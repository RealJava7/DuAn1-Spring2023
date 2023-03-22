package viewmodel;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PhieuGiamGiaResponse {

    private int id;  // id phieuGiamGia
    private String maPhieu;
    private String tenPhieu;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private int luotSuDung;
    private long dieuKien;
    private float giaTri;
    private int trangThai;

    @Override
    public String toString() {
        return "PhieuGiamGiaResponse{" + "id=" + id + ", maPhieu=" + maPhieu + ", tenPhieu=" + tenPhieu + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", luotSuDung=" + luotSuDung + ", dieuKien=" + dieuKien + ", giaTri=" + giaTri + ", trangThai=" + trangThai + '}';
    }
//
//    public int getTrangThai(LocalDate ngayBatDau, LocalDate ngayKetThuc) {
//        LocalDate homNay = LocalDate.now();
//
//        if (homNay.compareTo(ngayBatDau) >= 0 && homNay.compareTo(ngayKetThuc) < 0) {
//            return 0;
//        } else if (homNay.compareTo(ngayBatDau) < 0) {
//            return 1;
//        } else if (homNay.compareTo(ngayBatDau) > 0 && homNay.compareTo(ngayKetThuc) >= 0) {
//            return 2;
//        } else return 0;
//    }

    public String getNgay() {
        if (trangThai == 0) {
            return "Đang";
        } else if (trangThai > 1) {
            return "Chưa";
        } else {
            return "Đã";
        }
    }

    public Object[] toDataRow() {
        return new Object[]{
            tenPhieu, maPhieu, giaTri, dieuKien, luotSuDung, getNgay()
        };
    }

    public static void main(String[] args) {

    }
}
