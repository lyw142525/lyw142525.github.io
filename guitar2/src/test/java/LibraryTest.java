/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import guitar.dao.impl.Inventory;
import guitar.domain.Guitar;

import static org.junit.Assert.*;
import jdbc.SQLiteJDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class LibraryTest {
	private String sql;
	private Connection conn;
	private PreparedStatement pstmt;
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
    @Test public void addguitar(){
//    	//sql="insert into guitar values(?,?,?,?,?,?,?);";  
//    	sql="insert into guitar values('6 29584', 2100.95, 'PRS', 'Dave Navarro Signature','electric', 'Mahogany', 'Maple');";  
//
//        try {
//        	conn=SQLiteJDBC.getConnection();
//			pstmt =conn.prepareStatement(sql);       
////			pstmt.setString(1,"1");  
////			pstmt.setDouble(2,2);  
////			pstmt.setString(3,"1");  
////			pstmt.setString(4,"1");  
////			pstmt.setString(5,"1");  
////			pstmt.setString(6,"1");  
////			pstmt.setString(7,"1");  
//
//			pstmt.executeUpdate();
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	Inventory in=new Inventory();
    	in.addGuitar("serialNumber", 11, "builder", "model", "type", "backWood", "topWood");
    }
    @Test public void search() {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor","electric", "Alder", "Alder");
        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
          System.out.println("Erin, you might like this " +
            guitar.getBuilder() + " " + guitar.getModel() +  " " +
            guitar.getType() + " guitar:\n   " +
            guitar.getBackWood() + " back and sides,\n   " +
            guitar.getTopWood() + " top.\nYou can have it for only $" +
            guitar.getPrice() + "!");
        } else {
          System.out.println("Sorry, Erin, we have nothing for you.");
        }
      }

      private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95, "Collings", "CJ", "acoustic",
                            "Indian Rosewood", "Sitka");
        inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric",
                            "Alder", "Alder");
        inventory.addGuitar("V9512", 1549.95, "Fender", "Stratocastor", "electric",
                            "Alder", "Alder");
        inventory.addGuitar("122784", 5495.95, "Martin", "D-18", "acoustic",
                            "Mahogany", "Adirondack");
        inventory.addGuitar("76531", 6295.95, "Martin", "OM-28", "acoustic",
                            "Brazilian Rosewood", "Adriondack");
        inventory.addGuitar("70108276", 2295.95, "Gibson", "Les Paul", "electric",
                            "Mahogany", "Maple");
        inventory.addGuitar("82765501", 1890.95, "Gibson", "SG '61 Reissue",
                            "electric", "Mahogany", "Mahogany");
        inventory.addGuitar("77023", 6275.95, "Martin", "D-28", "acoustic",
                            "Brazilian Rosewood", "Adirondack");
        inventory.addGuitar("1092", 12995.95, "Olson", "SJ", "acoustic",
                            "Indian Rosewood", "Cedar");
        inventory.addGuitar("566-62", 8999.95, "Ryan", "Cathedral", "acoustic",
                            "Cocobolo", "Cedar");
        inventory.addGuitar("6 29584", 2100.95, "PRS", "Dave Navarro Signature",
                            "electric", "Mahogany", "Maple");
      }
      @Test
      public void getGuitarLinkedList(){
  			sql="select * from guitar;";  					
  			try {
  				pstmt =SQLiteJDBC.getConnection().prepareStatement(sql);      			
  				ResultSet rs=pstmt.executeQuery();
  				while(rs.next()){
  					String serialNumber = rs.getString("serialNumber");
  			        Double price = rs.getDouble("price");
  			        String builder = rs.getString("builder");
  			        String model = rs.getString("model");
  			        String type = rs.getString("type");
  			        String backWood = rs.getString("backWood");
  			        String topWood = rs.getString("topWood");
  			        Guitar guitar=new Guitar(serialNumber,price,builder,model,type,backWood,topWood);
  					System.out.println(guitar.getBuilder());;			    
  				}
  					pstmt.close();
  			} catch (SQLException e) {
  				// TODO Auto-generated catch block
  				e.printStackTrace();
  			}
  		
  	}
    @Test
    public void search1(){
    	Inventory inventory = new Inventory();
    	inventory.getGuitarLinkedList();
        Guitar whatErinLikes = new Guitar("", 0, "Fender", "Stratocastor","electric", "Alder", "Alder");
        Guitar guitar = inventory.search(whatErinLikes);
    	System.out.println(guitar.getPrice());
    	
    	
    }
}