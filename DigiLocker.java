class DigiLocker{

static String full;
static String age;
static String sex;
static String phone;
static String security;
static String email;
static String aadhaar;
public static boolean createDigiLocker(String fullName, String dob, String gender, String phoneNumber, String securityPin, String emailId, String aadhaarNumber){
	boolean isDigiLockerCreated = true;
	
	full=fullName;
	age=dob;
	sex=gender;
	phone=phoneNumber;
	security=securityPin;
	email=emailId;
	aadhaar=aadhaarNumber;
	
	isDigiLockerCreated = true;
	return isDigiLockerCreated;
}
    
	public static void readDigiLocker(){
		
		System.out.println("Digi Locker sign up..");
		System.out.println("Full Name:"+full);
		System.out.println("Date of birth:"+age);
		System.out.println("Gender:"+sex);
		System.out.println("Phone Number:"+phone);
		System.out.println("Security Pin:"+security);
		System.out.println("Email Id:"+email);
		System.out.println("Aadhaar Number:"+aadhaar);
		
	}
}