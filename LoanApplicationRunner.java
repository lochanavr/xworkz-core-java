class LoanApplicationRunner{

    public static void main(String[]loan){
		
		System.out.println("Main Started");
		boolean isLoanCreated=LoanApplication.createLoanAccount(null,"Personal","Lochana","State Bank of India","8.8","7 years");
		if(isLoanCreated == true)
		LoanApplication.readLoanAccount();
		System.out.println("Main ended");
	}
}