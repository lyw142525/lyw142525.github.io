package jdbc;

import java.sql.*;

public class SQLiteJDBC
{
  public static void main( String args[] )
  {
    Connection c = null;
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:Guitar.db");
    } catch ( Exception e ) {
    	e.printStackTrace();
    }
    return null; 
  }
}