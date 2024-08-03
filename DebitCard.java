class DebitCard{
	
	int cardId;
	String cardHolderName;
	long cardNo;
	String expDate;
	int cvv;
	
	public DebitCard(){
		System.out.println("Debit Card object is created");
	}
	
    public DebitCard(int cardId,String cardHolderName,long cardNo,String expDate,int cvv){
	
	this.cardId = cardId;
	this.cardHolderName = cardHolderName;
	this.cardNo = cardNo;
	this.expDate = expDate;
	this.cvv = cvv;
}
}