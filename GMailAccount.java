class GMailAccount{
	
	static String first;
	static char last;
	static String user; 
	static String passwd;
	
	public static boolean createMailAccount(String firstName, char lastName,String userName, String pwd){
	boolean isMailAccountCreated = true;
	
	first=firstName;
	last=lastName;
	user=userName;
	passwd=pwd;
	
	isMailAccountCreated = true;
	return isMailAccountCreated;
}
    
	public static void readMailAccount(){
		
		System.out.println("Create gmail account");
		System.out.println("First Name:"+first);
		System.out.println("Last Name:"+last);
		System.out.println("User Name:"+user);
		System.out.println("Password:"+passwd);
	}

}