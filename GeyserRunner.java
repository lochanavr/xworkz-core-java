class GeyserRunner{
	
	static boolean connect;
	public static void main(String[]havells){
	
	System.out.println("main started");
	connect = Geyser.onOrOff();
	System.out.println("is Geyser connected :"+connect);
	Geyser.increaseSpeed();
		connect = Geyser.onOrOff();
	    System.out.println("is Geyser connected :"+connect);
		Geyser.increaseSpeed();
		Geyser.decreaseSpeed();
		connect = Geyser.onOrOff();
			Geyser.increaseSpeed();
			Geyser.increaseSpeed();
			Geyser.increaseSpeed();
			Geyser.increaseSpeed();
			Geyser.decreaseSpeed();
			Geyser.decreaseSpeed();
			Geyser.decreaseSpeed();
			Geyser.decreaseSpeed();
			Geyser.decreaseSpeed();
			Geyser.decreaseSpeed();
	System.out.println("is Geyser connected :"+connect);
		connect = Geyser.onOrOff();
	System.out.println("is Geyser connected :"+connect);
System.out.println("main ended");	
	}
}