class LinkedlnRunner{
	
	public static void main(String[]job){
		
		System.out.println("Main Started");
		
		boolean isLinkedlnCreated =Linkedln.createLinkedlnAccount("Suhas",null,"vrsuhas@gmail.com","qwerty@567","qwerty@567","India","562101","Microsoft","SDE","3years","IT","BE in CSE");
		if(isLinkedlnCreated == true)
	    Linkedln.readLinkedlnAccount();

		System.out.println("Main ended");
	}

}