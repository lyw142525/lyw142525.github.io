package Dao;

import java.util.ArrayList;

import model.instrument;

public interface instrumentDao {
	public ArrayList<instrument> getguitar(String type,String size,String color,String material);
}
