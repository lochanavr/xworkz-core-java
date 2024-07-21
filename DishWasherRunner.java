class DishWasherRunner{

	public static void main(String[]ifb){
	
	System.out.println("main started");
	
	boolean connect = DishWasher.onOrOff();
	System.out.println("is dishWasher connected :"+connect);
	
		connect = DishWasher.onOrOff();
	    System.out.println("is DishWasher connected :"+connect);
     System.out.println("main ended");	
	}
}