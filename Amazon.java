class Amazon{

static String fullName;
static String email;
static String passwd;
static String confirm;

public static boolean createAmazonAccount(String name, String emailId, String pwd, String confirmpwd){
	boolean isAmazonCreated = true;
	
	fullName=name;
	email=emailId;
	passwd=pwd;
	confirm=confirmpwd;
	
	isAmazonCreated = true;
	return isAmazonCreated;
}
    
	public static void readAmazonAccount(){
		
		System.out.println("Amazon registration");
		System.out.println("Name:"+fullName);
		System.out.println("Email Id:"+email);
		System.out.println("Password:"+passwd);
		System.out.println("Confirm:"+confirm);
	}
}