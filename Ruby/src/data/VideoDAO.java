/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;


import ruby.Video;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Luong Huy Thong
 */
public class VideoDAO {
    public ArrayList<Video> getListVideo(){
        try {
            String sql = "SELECT * FROM KhachHang WHERE TinhTrang=1";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<Video> dskh = new ArrayList<>();
            while (rs.next()) {
                Video vd = new Video();
                vd.setSerial(rs.getString(1));
                vd.setNameVideo(rs.getString(2));
                vd.setYearRelease(rs.getInt(3));
                vd.setCategory(rs.getString(4));
                dskh.add(vd);
            }
            return dskh;
        } catch (SQLException ex) {
        }
        return null;
    }
}
