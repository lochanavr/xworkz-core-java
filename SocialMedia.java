class SocialMedia{
	
	int userId;
	String userName;
	long phoneNo;
	String email;

public SocialMedia(){
	System.out.println("SocialMedia object is created");
}

public SocialMedia(int userId,String userName,long phoneNo,String email){
	this.userId = userId;
	this.userName = userName;
	this.phoneNo = phoneNo;
	this.email = email;
}

public void getInfo(){
	    System.out.println("---------------------------");
		System.out.println("Details of Instagram user");
		System.out.println("User Id is "+this.userId);
		System.out.println("User name is "+this.userName);
		System.out.println("User PhoneNo is "+this.phoneNo);
		System.out.println("User email Id is "+this.email);
}
}