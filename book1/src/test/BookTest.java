public class BookTest{
	 public static void main(String[] args) {
	        Book book1=new Book("1","1-1-1","公司理财","财务");
	        Book book2=new Book("2","1-1-2","管理运筹","数学");
	        Book book3=new Book("3","1-1-3","数据库","计算机");
	        Member member1=new Member("09143643","小明一号");
	        Member member2=new Member("09143644","小明二号");
	        Member member3=new Member("09143645","小明三号");    
	        member1.Loan(book1);
	        member1.Loan(book2);
	        member1.Loan(book3);
	        member1.Return(book1);
	        member1.Loan(book1);
	    }
}