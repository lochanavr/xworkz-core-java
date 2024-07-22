class XWorkzRunner{
	
	public static void main(String[]institute){
		
		System.out.println("Main Started");
		boolean isXworkzCreated=XWorkz.createXWorkzAccount("Lochana V R","8431159356",null,"lochana@gmail.com","1EE20CS023","BE","CSE","EWCE");
		if(isXworkzCreated == true)
		XWorkz.readXWorkzAccount();
		System.out.println("Main ended");
	}
}