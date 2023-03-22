package service.impl;

import java.util.List;
import model.PhieuGiamGia;
import repository.PhieuGiamGiaRepository;
import viewmodel.PhieuGiamGiaResponse;
import service.PhieuGiamGiaService;

/**
 *
 * @author DELL
 */
public class PhieuGiamGiaServiceImpl implements PhieuGiamGiaService {

    PhieuGiamGiaRepository pr = new PhieuGiamGiaRepository();

    @Override
    public List<PhieuGiamGiaResponse> getall() {
        return pr.getAll();
    }

    @Override
    public String add(PhieuGiamGia phieu) {
   if (pr.add(phieu) == true) {
            return "Thêm thành công";
        }
        return "Thêm thất bại";
    }

    @Override
    public String update(PhieuGiamGiaResponse phieu) {
  if (pr.update(phieu)==true) {
            return "Sửa thành công";
        }
        return "sửa thất bại";
    }
    public static void main(String[] args) {
        PhieuGiamGiaService qs = new PhieuGiamGiaServiceImpl();
        System.out.println(qs.getall());
    }
}
