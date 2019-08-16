package base;
/**
 *
 * @author hayashi-s
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManager {
    public static Connection getConnection(){
        Connection con = null;
        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kagoyume_db?serverTimezone=JST","root","");
        	  Class.forName("org.postgresql.Driver");
        	  con = DriverManager.getConnection("jdbc:postgresql://ec2-54-227-245-146.compute-1.amazonaws.com:5432/d7ellkuenpgfb9?sslmode=require", "uwlxcbubozirmd", "6ba827882664015825b2ec32d278882c321813b672add0a58ff77ed809fc5027");
            System.out.println("DBConnected!!");
            return con;
        }catch(ClassNotFoundException e){
            throw new IllegalMonitorStateException();
        } catch (SQLException e) {
            throw new IllegalMonitorStateException();
        }
    }
}
