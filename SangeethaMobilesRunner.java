class SangeethaMobilesRunner{
	
	public static void main(String[]mobile){
		
		System.out.println("Main Started");
		
		String mobileName ="oppo";
		double findMobilePhone=SangeethaMobiles.findMobilePhone(mobileName);
		System.out.println("The price of the "+mobileName+" mobile phone is "+findMobilePhone);
		System.out.println("Main ended");
	}
}