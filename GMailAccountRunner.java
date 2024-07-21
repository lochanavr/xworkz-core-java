class GMailAccountRunner{
	
	public static void main(String[]mail){
	System.out.println("Main started");
	GMailAccount.createMailAccount("Harshitha", 'B', "harshu_b", "techie");
	GMailAccount.readMailAccount();
	System.out.println("Main ended");
	}
}