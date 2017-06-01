package Dao;

public class dataAccess1{
	private static String daoName="sqliteDao";
	public static instrumentDao createInstrumentDao(){
		instrumentDao result=null;
		try{
			Object o=Class.forName(daoName+"."+"instrumentDaoImpl").newInstance();
			result=(instrumentDaoImpl)o;
		}catch
		e.printStackTrace();
	}
	return result;

	public static UserDao createUserDao(){
		UserDao result=null;
		try{
			Object o=Class.forName(daoName+"."+"UserDaoImpl").newInstance();
			result=(UserDaoImpl)o;
		}catch
		e.printStackTrace();
	}
	return result;
	
}