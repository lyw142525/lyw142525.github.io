package service;
import java.util.List;
public class instrumentService{
	private  instrumentDao dao=dataAccess1.createinstrumentDao();
	public instrumentService(){}
	public Inventory getInventory(){
		Inventoy inventory=new Inventory();
		List<Instrumrnt> list=dao.getAllinstruments();
		for (instrument : list){
			inventory.addInstrument(i.getSerialNumber(),i.getPrice());
		}
		return inventory;
	}
}