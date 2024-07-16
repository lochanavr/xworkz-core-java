class SwiggyRunner{
public static void main(String[]menu){
		System.out.println("Main started");
		
		String foodName="idly";
		double search= Swiggy.search(foodName,2);
		System.out.println("The cost of "+foodName+" is "+search);
		System.out.println("Main ended");
	}
}