package Controller;

import DB.ConnectDB;
import Model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller_Account {

    //thêm nhân ACC
    public int add(Account acc) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "insert into Account(id,accountNumber,accountName,balance,status) "
                    + "values (?,?,?,?,?)";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setLong(1, acc.getId());
            sttm.setString(2, acc.getAccountNumber());
            sttm.setString(3, acc.getAccountName());
            sttm.setDouble(4, acc.getBalance());
            sttm.setInt(5, acc.getStatus());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Controller_Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    //Sửa thông tin ACC
    public int edit(Account acc) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "update Account set id=?,accountNumber=?,accountName=?,balance=?,status=? where id=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setLong(1, acc.getId());
            sttm.setString(2, acc.getAccountNumber());
            sttm.setString(3, acc.getAccountName());
            sttm.setDouble(4, acc.getBalance());
            sttm.setInt(5, acc.getStatus());
            sttm.setLong(6, acc.getId());
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Controller_Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    //lấy ds ACC
    public List<Account> getAllAccounts() {
        List<Account> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT id,accountNumber,accountName,balance,status from Account order by id desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getLong(1));
                acc.setAccountNumber(rs.getString(2));
                acc.setAccountName(rs.getString(3));
                acc.setBalance(rs.getDouble(4));
                acc.setStatus(rs.getInt(5));
                ls.add(acc);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }

    //xóa ACC theo id
    public int del(String AccId) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "delete Account where id = ?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, AccId);
            if (sttm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(Controller_Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu xóa không thành công
    }

    //tìm acc theo id
    public Account findByID(String id) throws Exception {
        String sSQL = "select *from Account where id = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                Account acc = new Account();
                acc.setId(rs.getLong(1));
                acc.setAccountNumber(rs.getString(2));
                acc.setAccountName(rs.getString(3));
                acc.setBalance(rs.getDouble(4));
                acc.setStatus(rs.getInt(5));
                return acc;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //hiệu lực
    public int Status(int status) {
        if (status == 0) {
            return 0;
        } else if (status == 1) {
            return 1;
        } else if (status == 2) {
            return 2;
        }
        return -1;//biến khác
    }

    //Check Acc độ dài soTK
    public int CheckDoDaiSoAcc(String soTK) {
        if (soTK.length() != 12) {
            return 1;
        }
        return 0;
    }
    public int CheckTrungSoAcc(String soTK1, String soTK2) {
        if(soTK1.equals(soTK2)) {
            return 1;
        }
        return 0;
    }

    public int CheckTenAcc(String tenTK) {
        if (tenTK.length() > 5 && tenTK.length() < 100) {
            return 1;
        }
        return -1;
    }

}
