class AmazonRunner{
	
	public static void main(String[]ecommerce){
		
		System.out.println("Main Started");
		
		boolean isAmazonCreated = Amazon.createAmazonAccount(null,"thanu@gmail.com","besto","besto","26/11/2002","8876544480");
		if(isAmazonCreated == true)
	    Amazon.readAmazonAccount();

		System.out.println("Main ended");
	}
}