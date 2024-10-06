/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connect.DBContext;
import Entity.Information;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class InfoModel {

    private final DBContext db;

    public InfoModel() throws Exception {
        db = new DBContext();
    }

    public ArrayList<Information> getInfoPage() throws Exception {
        String query = "select * from Information";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Information> output = new ArrayList<>();

        try {
            conn = db.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String content = rs.getString(3);
                Information i = new Information(id, name, content);
                output.add(i);
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            db.close(conn, ps, rs);
        }
        return output;
    }

    public String getAddress(ArrayList<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {

            if (info.get(i).getName().equals("address")) {
                return info.get(i).getContent();
            }
        }
        return "";
    }

    public String getTel(ArrayList<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals("tel")) {
                return info.get(i).getContent();
            }
        }
        return "";
    }

    public String getMail(ArrayList<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals("mail")) {
                return info.get(i).getName() + ":" + info.get(i).getContent();
            }
        }
        return "";
    }

    public ArrayList<String> getOpenHours(ArrayList<Information> info) throws
            Exception {
        ArrayList<String> days = new ArrayList<>();
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().contains("day")) {
                days.add(info.get(i).getName() + ": " + info.get(i).getContent());
            }
        }
        return days;
    }

    public String getUrlCover(ArrayList<Information> info) throws Exception {
        for (int i = 0; i < info.size(); i++) {
            if (info.get(i).getName().equals("imgCover")) {
                return info.get(i).getContent();
            }
        }
        return "";
    }
}
