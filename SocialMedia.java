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
}