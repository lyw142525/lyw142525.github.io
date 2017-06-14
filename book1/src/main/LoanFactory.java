public static class LoanFactory{
	public static Loan CreateLoan(Book book,Member member){
		var loan=new Loan();
		loan.Book=book;
		loan.Member=member;
		loan.LoanDate=DateTime.Now;
		loan.DateForReturn=DateTime.Now.AddDays(10);
		return loan;
	}
}