public class HasReachMaxSpecification implements ISpecification<Member>{
	public boolean IsSatisfiedBy(Member member){
		int count=0;
		ArrayList<Loan> loans=new ArryList<Loan>();
		loans=member.getLoans();
		for(Loan loan:loans){
			if(loan.getReturnDate()==null)
				count=count+1;
		}
		if(count>=3){
			return true;
		}else{
			return false;
		}
	}
}