public class Loan {
    private String Id;
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    private LocalDateTime LoanDate;
    public LocalDateTime getLoanDate() {
        return LoanDate;
    }
    public void setLoanDate(LocalDateTime loanDate) {
        LoanDate = loanDate;
    }
    private LocalDateTime DateForReturn;
    public LocalDateTime getDateForReturn() {
        return DateForReturn;
    }
    public void setDateForReturn(LocalDateTime dateForReturn) {
        DateForReturn = dateForReturn;
    }
    private LocalDateTime ReturnDate; 
    public LocalDateTime getReturnDate() {
        return ReturnDate;
    }
    public void setReturnDate(LocalDateTime returnDate) {
        ReturnDate = returnDate;
    }
    private Book book;
    public Book getBook() {
        return book;
    }
    public void setBook(Book book) {
        this.book = book;
    }
    private Member member;
    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }  
    public boolean HasNotBeenReturned(){
        return ReturnDate == null;
    }
    public void MarkAsReturned(){
        ReturnDate = LocalDateTime.now();
    }
  
}