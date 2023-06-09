package repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Query;
import model.PhieuGiamGia;
import model.PhieuGiamGiaChiTiet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.HibernateUtil;
import viewmodel.PhieuGiamGiaResponse;

public class PhieuGiamGiaRepository {

    // 1. add
    public static boolean add(PhieuGiamGia phieu) {
        boolean check = false;
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Transaction transaction = session.beginTransaction();
            session.save(phieu);
            transaction.commit();
            check = true;
        } catch (HibernateException ex) {
            ex.printStackTrace(System.out);
        }
        return check;
    }

    // 2. update
    public static boolean update(PhieuGiamGiaResponse phieuGiamGiaResponse) {
        boolean check = false;
        try {
            Session session = HibernateUtil.getFACTORY().openSession();

            PhieuGiamGia phieuInDB = session.get(PhieuGiamGia.class, phieuGiamGiaResponse.getId());
            // 'phieuInDB' là thằng trong db mà mình get ra bằng id của response

            phieuInDB.setMaPhieu(phieuGiamGiaResponse.getMaPhieu());
            phieuInDB.setTenPhieu(phieuGiamGiaResponse.getTenPhieu());

            PhieuGiamGiaChiTiet phieuGiamGiaChiTiet = phieuInDB.getPhieuGiamGiaChiTiet();

            phieuGiamGiaChiTiet.setNgayBatDau(phieuGiamGiaResponse.getNgayBatDau());
            phieuGiamGiaChiTiet.setNgayKetThuc(phieuGiamGiaResponse.getNgayKetThuc());
            phieuGiamGiaChiTiet.setLuotSuDung(phieuGiamGiaResponse.getLuotSuDung());
            phieuGiamGiaChiTiet.setDieuKien(phieuGiamGiaResponse.getDieuKien());
            phieuGiamGiaChiTiet.setGiaTri(phieuGiamGiaResponse.getGiaTri());
            phieuGiamGiaChiTiet.setTrangThai(phieuGiamGiaResponse.getTrangThai());

            phieuInDB.setPhieuGiamGiaChiTiet(phieuGiamGiaChiTiet);

            Transaction transaction = session.beginTransaction();
            session.update(phieuInDB);
            transaction.commit();
            check = true;
        } catch (HibernateException ex) {
            ex.printStackTrace(System.out);
        }
        return check;
    }

    // 3. get all
    public static List<PhieuGiamGiaResponse> getAll() {
        List<PhieuGiamGiaResponse> phieuGiamGiaResponses = new ArrayList<>();
        try {
            Session session = HibernateUtil.getFACTORY().openSession();
            Query query = session.createQuery("""
                                              SELECT new viewmodel.PhieuGiamGiaResponse
                                              (pgg.id, pgg.maPhieu, pgg.tenPhieu, pct.ngayBatDau, pct.ngayKetThuc, pct.luotSuDung, pct.dieuKien, pct.giaTri, pct.trangThai)
                                              FROM PhieuGiamGia pgg
                                              INNER JOIN pgg.phieuGiamGiaChiTiet pct
                                               """);
            phieuGiamGiaResponses = query.getResultList();
        } catch (HibernateException ex) {
            ex.printStackTrace(System.out);
        }
        return phieuGiamGiaResponses;
    }

    public static void main(String[] args) {
        // add
//        PhieuGiamGiaChiTiet phieuGiamGiaChiTiet = new PhieuGiamGiaChiTiet();
//        
//        phieuGiamGiaChiTiet.setNgayBatDau(LocalDate.of(2023, 2, 10));
//        phieuGiamGiaChiTiet.setNgayKetThuc(LocalDate.of(2023, 4, 15));
//        phieuGiamGiaChiTiet.setLuotSuDung(25);  
//        phieuGiamGiaChiTiet.setDieuKien(9_000_000L);
//        phieuGiamGiaChiTiet.setGiaTri(2.6f);
//        phieuGiamGiaChiTiet.setTrangThai(1);
//
//        PhieuGiamGia phieuGiamGia = new PhieuGiamGia();
//
//        phieuGiamGia.setMaPhieu("GG002");
//        phieuGiamGia.setTenPhieu("ten phieu gg 2");
//        phieuGiamGia.setPhieuGiamGiaChiTiet(phieuGiamGiaChiTiet);
//
//        System.out.println(add(phieuGiamGia));

        // update
        PhieuGiamGiaResponse phieuGiamGiaResponse = new PhieuGiamGiaResponse();
        PhieuGiamGia phieuInDB = new PhieuGiamGia();
        // 'phieuInDB' là thằng trong db mà mình get ra bằng id của response
//
//        phieuInDB.setMaPhieu("up");
//        phieuInDB.setTenPhieu("up");
        phieuGiamGiaResponse.setId(11);
        phieuGiamGiaResponse.setMaPhieu("up");
        phieuGiamGiaResponse.setTenPhieu("up");

        phieuGiamGiaResponse.setNgayKetThuc(LocalDate.of(2022, 11, 13));
        phieuGiamGiaResponse.setLuotSuDung(13);
        phieuGiamGiaResponse.setDieuKien(13_000_000L);
        phieuGiamGiaResponse.setGiaTri(3.5f);
        phieuGiamGiaResponse.setTrangThai(2);
 
//        phieuInDB.setPhieuGiamGiaChiTiet(phieuGiamGiaChiTiet);

        System.out.println(update(phieuGiamGiaResponse));

        // get all
//        List<PhieuGiamGiaResponse> phieuGiamGiaResponses = getAll();
//        phieuGiamGiaResponses.forEach(p -> System.out.println(p.toString()));
    }

}
