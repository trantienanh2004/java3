/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banquanao.sevice;

import banquanao.untility.DB;
import com.model.ChatLieu;
import com.model.MauSac;
import com.model.SanPham;
import com.model.SanPhamCT;
import com.model.Size;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class serquanly {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = null;
    
    public List<SanPham> getAll(){
        sql = "select IDSP,MaSP,Ten from SanPham";
        List<SanPham> list = new ArrayList<>();
        try {
            con = DB.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    public List<SanPhamCT> getSanPham(){
        List<SanPhamCT> list = new ArrayList<>();
        sql = "select SanPham.MaSP,SanPham.Ten,Size.GiaTri,TenMau,TenCL, DonGia,SL  from SanPhamChiTiet join SanPham on SanPhamChiTiet.IDSP = SanPham.IDSP join MauSac on MauSac.MaMau = SanPhamChiTiet.MaMau join ChatLieu on ChatLieu.MaCL = SanPhamChiTiet.MaCL join Size on SanPhamChiTiet.MaSize = Size.MaSize";
        try {
            con = DB.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                SanPham sp1 = new SanPham(rs.getString(1), rs.getString(2));
                MauSac mauSac = new MauSac(rs.getString(3));
                Size size = new Size(rs.getString(4));
                ChatLieu chatLieu = new ChatLieu(rs.getString(5));
                SanPhamCT sp = new SanPhamCT(sp1, mauSac, size, chatLieu, rs.getFloat(6), rs.getInt(7));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            return null;
        }
    }
}
