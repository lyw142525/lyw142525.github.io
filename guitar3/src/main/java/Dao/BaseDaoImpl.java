package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Guitar;

public class BaseDaoImpl implements BaseDao {

	@Override
	public ArrayList<Guitar> getguitar(String type,String size,String color,String material) {
		// TODO Auto-generated method stub
		String str = "select * from guitar where 1 = 1 ";
		
		/*if(typ!=null){
			sql+="and guitar_size=41";
		}*/
		if(type!=""){
			str+=String.format("and guitar_type='"+type+"'");
		}
		if(size!=""){
			str+=String.format("and guitar_size='"+size+"'");
		}
		if(color!=""){
			str+=String.format("and guitar_color='"+color+"'");
		}
		if(material!=""){
			str+=String.format("and guitar_material='"+material+"'");
		}
		/*
		if(color!=""){
			sql+=String.format("and guitar_color='"+color+"'");
		}
		if(material!=""){
			sql+=String.format("and guitar_material='"+material+"'");
		}*/
		ResultSet rs=Dbutil.executeQuery(str,new Object[]{});
		ArrayList<Guitar> guitarlist=new ArrayList<Guitar>();
		try{
			while(rs.next()){
				Guitar guitar=new Guitar();
				guitar.setId(rs.getInt(1));
				guitar.setName(rs.getString(2));
				guitar.setType(rs.getString(3));
				guitar.setPrice(rs.getDouble(4));
				guitar.setSize(rs.getString(5));
				guitar.setColor(rs.getString(6));
				guitar.setMaterial(rs.getString(7));
				guitar.setAngle(rs.getString(8));
				guitar.setLocation(rs.getString(9));
				guitar.setDescriprition(rs.getString(10));
				guitarlist.add(guitar);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return guitarlist;
	}

}