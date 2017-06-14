public class Book {
	private String Id;
	public final String getId(){
		return Id;
	}
	public final void setId(String value){
		Id=id;
	}
	private String ISBN;
	public final String getISBN(){
		return ISBN;
	}
	public final void setISBN(String value){
		ISBN=isbn;
	}
	private String Title;
	public final String getTitle(){
		return Title;
	}
	public final void setTitle(String value){
		Title=title;
	}
	private Member LoanTo;
	public Member getLoanTo(){
		return LoanTo;
	}
	public void setLoanTo(Member value){
		LoanTo=value;
	}
}