package Dao;

import java.util.ArrayList;

import model.Guitar;

public interface BaseDao {
	public ArrayList<Guitar> getguitar(String type,String size,String color,String material);
}
