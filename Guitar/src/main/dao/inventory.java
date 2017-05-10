package guitar.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import guitar.domain.Guitar;
import jdbc.SQLiteJDBC;

public class Inventory {
	private List gui;
	private String sql;
	private Connection c;
	private Statement stmt;
	private PrepareStatement pstmt;
	public Inventory()    {       
		gui = new LinkedList();    
		}    
	public void addGuitar(String serialNumber, double price,
			              String builder, String model,
			              String type, String backWood, String topWood)    
	{       Guitar guitar = new Guitar(serialNumber, price, builder,                                  
			model, type, backWood, topWood);       
			gui.add(guitar); 
			try{
				Connection c=DriverManager.getConnection(sql);
				Statement stmt=createStatement();
				PrepareStatement pstmt=null;
				//数据库操作
				String sql = "INSERT INTO guitar VALUES(?,?,?,?,?,?,?);";  
				pstmt=c.prepareStatement(sql);
				pstmt.setString(1,gui.getSerialNumber());
				pstmt.setDouble(2,gui.getPrice());
				pstmt.setString(3,gui.getBuilder());
				pstmt.setString(4,gui.getModel());
				pstmt.setString(5,gui.getType());
				pstmt.setString(6,gui.getBackWood());
				pstmt.setString(7,gui.getTopWood());
				//执行更新
				ptst.excuteUpdate();
				ptst.close();
				stmt.close();
				c.close();
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	//从.db文件中读取信息
	public List<Guitar>queryGuitar(){
				List<Guitar> list=new LinkedList<Guitar>();
				try{
					Connection c=DriverManager.getConnection(sql);
					Statement stmt=createStatement();
					ResultSet res=stmt.executeQuery("select * from guitar");
					
					while(res.next()){
					//公共部分	
						String serialNumber=res.getString("serialNumber");
						Double price=res.getDouble("price");
						String builder=res.getString("builder");
						String model=res.getString("model");
						String type=res.getString("type");
						String backWood=res.getString("backWood");
						String topWood=res.getString("topWood");
						gui.add(guitar);
						}
						res.closee();
						stmt.close();
						}catch(Exception e){
							catch (SQLException e) {
								e.printStackTrace();
							}
							return gui;
							}	
					}
	public Guitar getGuitar(String serialNumber)    {      
				 for (Iterator i = guitars.iterator(); i.hasNext(); )       
				 { Guitar guitar = (Guitar)i.next();            
				if (guitar.getSerialNumber().equals(serialNumber)){             
					  return guitar;            
					}        }       
				 return null;    
				}
	}
//搜索
	public Guitar search(Guitar searchGuitar) {
		    for (Iterator i = guitars.iterator(); i.hasNext(); ) {
			      Guitar guitar = (Guitar)i.next();
			      String builder = searchGuitar.getBuilder().toLowerCase();      
			if ((builder != null) && (!builder.equals("")) &&
					(!builder.equals(guitar.getBuilder().toLowerCase())))
			        continue;      
			String model = searchGuitar.getModel().toLowerCase();
			      if ((model != null) && (!model.equals("")) &&
					 (!model.equals(guitar.getModel().toLowerCase())))       
					continue;     
			String type = searchGuitar.getType().toLowerCase();      
				if ((type != null) && (!searchGuitar.equals("")) &&
		           (!type.equals(guitar.getType().toLowerCase())))        
				continue;      
			String backWood = searchGuitar.getBackWood().toLowerCase();    
			    if ((backWood != null) && (!backWood.equals("")) &&         
					(!backWood.equals(guitar.getBackWood().toLowerCase())))
		        continue;    
		    String topWood = searchGuitar.getTopWood().toLowerCase();      
		   if ((topWood != null) && (!topWood.equals("")) &&
		         (!topWood.equals(guitar.getTopWood().toLowerCase())))      
		    continue;     
		   return gui;
		       }
		    return null;  
		}
	}

	