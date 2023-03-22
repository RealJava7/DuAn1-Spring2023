package service;

import java.util.List;
import model.PhieuGiamGia;
import viewmodel.PhieuGiamGiaResponse;

public interface PhieuGiamGiaService {

    List<PhieuGiamGiaResponse> getall();

    String add(PhieuGiamGia phieu);

    String update(PhieuGiamGiaResponse phieu);

}
