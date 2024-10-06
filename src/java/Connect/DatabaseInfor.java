/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

/**
 *
 * @author Administrator
 */
public interface DatabaseInfor {
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String url = "jdbc:sqlserver://DESKTOP-8EFKOES:1433;databaseName=SushiDB;encrypt=true;trustServerCertificate=true";
    public static String user = "sa";
    public static String pass = "abc123";
}
