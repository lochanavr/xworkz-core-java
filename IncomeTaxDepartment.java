class IncomeTaxDepartment{

static String panNum;
static String first;
static String middle;
static String last;
static String sex;
static String city;
public static boolean createIncomeTaxDepartment(String pan, String firstName, String middleName, String lastName, String gender, String address){
	boolean isIncomeTaxDepartmentCreated = true;
	
	panNum=pan;
	first=firstName;
	middle=middleName;
	last=lastName;
	sex=gender;
	city=address;
	
	isIncomeTaxDepartmentCreated = true;
	return isIncomeTaxDepartmentCreated;
}
    
	public static void readIncomeTaxDepartment(){
		
		System.out.println("Income Tax portal sign up");
		System.out.println("Pan Number:"+panNum);
		System.out.println("First Name:"+first);
		System.out.println("Middle Name:"+middle);
		System.out.println("Last Name:"+last);
		System.out.println("Gender:"+sex);
		System.out.println("Address:"+city);
	}
}