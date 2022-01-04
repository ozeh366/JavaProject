package javaPart4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) throws SQLException {
        //Create a connection
        Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost\\Scrumwars");

        //Create a query
        Statement stmt = con.createStatement();
        String s = "insert into Customer values(100, 'Lucio')";

        //Execute statement
        stmt.executeQuery(s);

        //Close connection
        con.close();

        System.out.println("Program is completed");
    }
}
