/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquanao.sevice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import banquanao.model.dangnhap;
import banquanao.untility.DB;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class dangnhapSevice {

   public ArrayList<dangnhap> alldangnhap() {
        ArrayList<dangnhap> dsdangnhap = new ArrayList<>();
        Connection cn = DB.getConnection();
        try {
            String sql = "select matk,tentk,matkhau,diachi,tennv,gioitinh,sodienthoai,taikhoan.maqh,tenquyenhan,trangthai,ghichu from TaiKhoan join QuyenHan on TaiKhoan.maqh = quyenhan.maqh\n" +
"group by matk,tentk,matkhau,diachi,tennv,gioitinh,sodienthoai,taikhoan.maqh,tenquyenhan,trangthai,ghichu";
            PreparedStatement pd = cn.prepareStatement(sql);
            ResultSet rs = pd.executeQuery();
            while (rs.next()) {
                dangnhap user = new dangnhap();
                user.setMatk(rs.getNString(1));
                user.setUser(rs.getNString(2));
                user.setPass(rs.getNString(3));
                user.setDiaChi(rs.getNString(4));
                user.setTenNV(rs.getNString(5));
                user.setGioitinh(rs.getInt(6));
                user.setSodienthoai(rs.getInt(7));
                user.setMAQH(rs.getNString(8));
                user.setRole(rs.getNString(10));
                user.setGhichu(rs.getNString(12));
                user.setTrangthai(rs.getNString(11));
                dsdangnhap.add(user);
            }
        } catch (Exception e) {
        }

        return dsdangnhap;
    }
   
   public ArrayList<dangnhap>adddangnhap(){
       ArrayList<dangnhap> dsdn = new ArrayList<>();
       Connection cn = DB.getConnection();
       try {
           String sql = "select tentk,matkhau,tenquyenhan from taikhoan join quyenhan on taikhoan.maqh = quyenhan.maqh";
           PreparedStatement pd = cn.prepareStatement(sql);
           ResultSet rs = pd.executeQuery();
           while (rs.next()) {               
               dangnhap user = new dangnhap();
               user.setUser(rs.getNString(1));
               user.setPass(rs.getNString(2));
               user.setRole(rs.getNString(3));
               dsdn.add(user);
           }
       } catch (Exception e) {
       }
       return dsdn;
   }
}
