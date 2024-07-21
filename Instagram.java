class Instagram{
	
	static String email; 
	static String fullName;
	static String user;
	static String pword;
	
	public static boolean createInstagram(String emailId, String name, String userName, String pwd){
	boolean isInstagramCreated = true;
	
	email=emailId;
	fullName=name;
	user=userName;
	pword=pwd;
	
	isInstagramCreated = true;
	return isInstagramCreated;
}
    
	public static void readInstagram(){
		
		System.out.println("Sign up Details");
		System.out.println("Email Id:"+email);
		System.out.println("Name:"+fullName);
		System.out.println("User Name:"+user);
		System.out.println("Password:"+pword);
	}
}