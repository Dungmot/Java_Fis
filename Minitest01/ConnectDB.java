
package DB;

import java.sql.*;

public class ConnectDB {
    public static final  String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Minitest01;user=sa;password=271207";
    public static Connection getDBConnect(){
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);                   //tao ket noi den co so du lieu 
            return  con;
        } catch (ClassNotFoundException e) {
            //thiếu thư mục Driver
            System.out.println("Where is Driver?");
            System.out.println("Error:"+e.toString());
        } catch (SQLException ex) {
            //lỗi kết nối
            System.out.println("Error:"+ex.toString());
        }
        return null;
    }
}
