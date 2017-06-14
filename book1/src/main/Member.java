public class Member{
	private String Id;
	public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    private String Name;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name= name;
    }
    private ArrayList<Loan> Loans=new ArrayList<Loan>;
    public ArrayList<Loan> getLoans() {
        return Loans;
    }
    public void setLoans(ArrayList<Loan> Loans) {
    	Loans= loans;
    }
    public final void Return(Book book){
    	model.Loan loan=FindCurrentLoanFor(book);
    	if(loan!=null){
    		loan.MarkAsReturned();
    		book.setLoanTo(null);
    	}
    }
    public final boolean CanLoan(Book book){
    	return book.getLoanTo()==null;
    }
    public final Loan Loan(Book book){
    	Loan loan=null;
    	if(CanLoan(book)){
    		loan=LoanFactory.CreateLoan(book,this);
    		getLoans().add(loan);
    	}
    	return loan;
    }
    public Loan FindCurrentLoanFor(Book book){
    	Loan searchLoan=new Loan();
    	for(Loan loan:getLoans()){
    		if(loan.getBook()==book){
    			searchLoan=loan;
    		}
    	}
    	return searchLoan;
    }
}