public class BookTest{
	 public static void main(String[] args) {
	        Book book1=new Book("1","1-1-1","��˾���","����");
	        Book book2=new Book("2","1-1-2","�����˳�","��ѧ");
	        Book book3=new Book("3","1-1-3","���ݿ�","�����");
	        Member member1=new Member("09143643","С��һ��");
	        Member member2=new Member("09143644","С������");
	        Member member3=new Member("09143645","С������");    
	        member1.Loan(book1);
	        member1.Loan(book2);
	        member1.Loan(book3);
	        member1.Return(book1);
	        member1.Loan(book1);
	    }
}