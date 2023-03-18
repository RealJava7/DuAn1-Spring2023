/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class PhanMemBanDienThoai extends javax.swing.JFrame {

    public PhanMemBanDienThoai() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTrangChu = new javax.swing.JPanel();
        lblTrangChu = new javax.swing.JLabel();
        btnSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        btnBanHang = new javax.swing.JPanel();
        lblBanHang = new javax.swing.JLabel();
        btnHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        btnGiamGia = new javax.swing.JPanel();
        lblGiamGia = new javax.swing.JLabel();
        btnBaoHanh = new javax.swing.JPanel();
        lblBaoHanh = new javax.swing.JLabel();
        btnHeThong = new javax.swing.JPanel();
        lblHeThong = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDangXuat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PHẦN MỀM QUẢN LÝ BÁN ĐIỆN THOẠI 1.0");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(38, 68, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logo.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(38, 68, 170));
        jPanel3.setLayout(new java.awt.GridLayout(7, 1, 0, 10));

        btnTrangChu.setBackground(new java.awt.Color(38, 68, 170));
        btnTrangChu.setLayout(new java.awt.GridLayout(1, 1));

        lblTrangChu.setBackground(new java.awt.Color(38, 68, 170));
        lblTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        lblTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.png"))); // NOI18N
        lblTrangChu.setText("TRANG CHỦ");
        lblTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTrangChuMouseExited(evt);
            }
        });
        btnTrangChu.add(lblTrangChu);

        jPanel3.add(btnTrangChu);

        btnSanPham.setBackground(new java.awt.Color(38, 68, 170));
        btnSanPham.setLayout(new java.awt.GridLayout(1, 1));

        lblSanPham.setBackground(new java.awt.Color(38, 68, 170));
        lblSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/product.png"))); // NOI18N
        lblSanPham.setText("SẢN PHẨM");
        lblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSanPhamMouseExited(evt);
            }
        });
        btnSanPham.add(lblSanPham);

        jPanel3.add(btnSanPham);

        btnBanHang.setBackground(new java.awt.Color(38, 68, 170));
        btnBanHang.setLayout(new java.awt.GridLayout(1, 1));

        lblBanHang.setBackground(new java.awt.Color(38, 68, 170));
        lblBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBanHang.setForeground(new java.awt.Color(255, 255, 255));
        lblBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/cart.png"))); // NOI18N
        lblBanHang.setText("BÁN HÀNG");
        lblBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBanHangMouseExited(evt);
            }
        });
        btnBanHang.add(lblBanHang);

        jPanel3.add(btnBanHang);

        btnHoaDon.setBackground(new java.awt.Color(38, 68, 170));
        btnHoaDon.setLayout(new java.awt.GridLayout(1, 1));

        lblHoaDon.setBackground(new java.awt.Color(38, 68, 170));
        lblHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        lblHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/HOADON.png"))); // NOI18N
        lblHoaDon.setText("HÓA ĐƠN");
        lblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHoaDonMouseExited(evt);
            }
        });
        btnHoaDon.add(lblHoaDon);

        jPanel3.add(btnHoaDon);

        btnGiamGia.setBackground(new java.awt.Color(38, 68, 170));
        btnGiamGia.setLayout(new java.awt.GridLayout(1, 1));

        lblGiamGia.setBackground(new java.awt.Color(38, 68, 170));
        lblGiamGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGiamGia.setForeground(new java.awt.Color(255, 255, 255));
        lblGiamGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGiamGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-shopping-cart-promotion-40.png"))); // NOI18N
        lblGiamGia.setText("GIẢM GIÁ");
        lblGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGiamGiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGiamGiaMouseExited(evt);
            }
        });
        btnGiamGia.add(lblGiamGia);

        jPanel3.add(btnGiamGia);

        btnBaoHanh.setBackground(new java.awt.Color(38, 68, 170));
        btnBaoHanh.setLayout(new java.awt.GridLayout(1, 1));

        lblBaoHanh.setBackground(new java.awt.Color(38, 68, 170));
        lblBaoHanh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBaoHanh.setForeground(new java.awt.Color(255, 255, 255));
        lblBaoHanh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaoHanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-online-maintenance-portal-40.png"))); // NOI18N
        lblBaoHanh.setText("BẢO HÀNH");
        lblBaoHanh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblBaoHanhMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBaoHanhMouseExited(evt);
            }
        });
        btnBaoHanh.add(lblBaoHanh);

        jPanel3.add(btnBaoHanh);

        btnHeThong.setBackground(new java.awt.Color(38, 68, 170));
        btnHeThong.setLayout(new java.awt.GridLayout(1, 1));

        lblHeThong.setBackground(new java.awt.Color(38, 68, 170));
        lblHeThong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHeThong.setForeground(new java.awt.Color(255, 255, 255));
        lblHeThong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-settings-40.png"))); // NOI18N
        lblHeThong.setText("HỆ THỐNG");
        lblHeThong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHeThongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHeThongMouseExited(evt);
            }
        });
        btnHeThong.add(lblHeThong);

        jPanel3.add(btnHeThong);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Xin Chào,");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bình");

        lblDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        lblDangXuat.setText("Đăng Xuất?");
        lblDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDangXuatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDangXuat)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDangXuat)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 941, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setColor(JPanel p) {
        p.setBackground(new Color(170, 190, 255));
    }

    private void resetColor(JPanel p) {
        p.setBackground(new Color(38, 68, 170));
    }
    private void lblTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseExited
        resetColor(btnTrangChu);

    }//GEN-LAST:event_lblTrangChuMouseExited

    private void lblTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTrangChuMouseEntered
        setColor(btnTrangChu);
    }//GEN-LAST:event_lblTrangChuMouseEntered

    private void lblDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseEntered
        lblDangXuat.setForeground(Color.red);
    }//GEN-LAST:event_lblDangXuatMouseEntered

    private void lblDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseExited
        lblDangXuat.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblDangXuatMouseExited

    private void lblDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDangXuatMouseClicked

        new Login().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblDangXuatMouseClicked

    private void lblSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseEntered
        setColor(btnSanPham);
    }//GEN-LAST:event_lblSanPhamMouseEntered

    private void lblSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSanPhamMouseExited
        resetColor(btnSanPham);
    }//GEN-LAST:event_lblSanPhamMouseExited

    private void lblBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseEntered
        setColor(btnBanHang);
    }//GEN-LAST:event_lblBanHangMouseEntered

    private void lblBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBanHangMouseExited
        resetColor(btnBanHang);
    }//GEN-LAST:event_lblBanHangMouseExited

    private void lblHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseEntered
        setColor(btnHoaDon);
    }//GEN-LAST:event_lblHoaDonMouseEntered

    private void lblHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHoaDonMouseExited
        resetColor(btnHoaDon);
    }//GEN-LAST:event_lblHoaDonMouseExited

    private void lblGiamGiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGiamGiaMouseEntered
        setColor(btnGiamGia);
    }//GEN-LAST:event_lblGiamGiaMouseEntered

    private void lblGiamGiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGiamGiaMouseExited
        resetColor(btnGiamGia);
    }//GEN-LAST:event_lblGiamGiaMouseExited

    private void lblBaoHanhMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBaoHanhMouseEntered
        setColor(btnBaoHanh);
    }//GEN-LAST:event_lblBaoHanhMouseEntered

    private void lblBaoHanhMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBaoHanhMouseExited
        resetColor(btnBaoHanh);
    }//GEN-LAST:event_lblBaoHanhMouseExited

    private void lblHeThongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHeThongMouseEntered
        setColor(btnHeThong);
    }//GEN-LAST:event_lblHeThongMouseEntered

    private void lblHeThongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHeThongMouseExited
        resetColor(btnHeThong);
    }//GEN-LAST:event_lblHeThongMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhanMemBanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhanMemBanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhanMemBanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhanMemBanDienThoai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhanMemBanDienThoai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBanHang;
    private javax.swing.JPanel btnBaoHanh;
    private javax.swing.JPanel btnGiamGia;
    private javax.swing.JPanel btnHeThong;
    private javax.swing.JPanel btnHoaDon;
    private javax.swing.JPanel btnSanPham;
    private javax.swing.JPanel btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblBanHang;
    private javax.swing.JLabel lblBaoHanh;
    private javax.swing.JLabel lblDangXuat;
    private javax.swing.JLabel lblGiamGia;
    private javax.swing.JLabel lblHeThong;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblTrangChu;
    // End of variables declaration//GEN-END:variables
}
