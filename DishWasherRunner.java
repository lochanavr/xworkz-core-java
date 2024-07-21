class DishWasherRunner{
static boolean connect ;
	public static void main(String[]ifb){
	System.out.println("main started");
	connect = DishWasher.onOrOff();
	System.out.println("is dishWasher connected :"+connect);
	DishWasher.increaseSpeed();
		connect = DishWasher.onOrOff();
	    System.out.println("is DishWasher connected :"+connect);
		DishWasher.increaseSpeed();
		DishWasher.decreaseSpeed();
		connect = DishWasher.onOrOff();
			DishWasher.increaseSpeed();
			DishWasher.increaseSpeed();
			DishWasher.increaseSpeed();
			DishWasher.increaseSpeed();
			DishWasher.increaseSpeed();
			DishWasher.decreaseSpeed();
			DishWasher.decreaseSpeed();
			DishWasher.decreaseSpeed();
			DishWasher.decreaseSpeed();
			DishWasher.decreaseSpeed();
	System.out.println("is DishWasher connected :"+connect);
		connect = DishWasher.onOrOff();
	System.out.println("is DishWasher connected :"+connect);
System.out.println("main ended");	
	}
}