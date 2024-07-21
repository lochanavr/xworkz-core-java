class GeyserRunner{
	
	static boolean connect;
	public static void main(String[]havells){
	
	System.out.println("main started");
	
	connect = Geyser.onOrOff();
	System.out.println("is geyser connected :"+connect);
	Geyser.increaseTemperature();
	
		connect = Geyser.onOrOff();
	    System.out.println("is geyser connected :"+connect);
	Geyser.increaseTemperature();
		Geyser.decreaseTemperature();
		connect = Geyser.onOrOff();
			Geyser.increaseTemperature();
			Geyser.decreaseTemperature();
			
	System.out.println("is geyser connected :"+connect);
		connect = Geyser.onOrOff();
	System.out.println("is geyser connected :"+connect);
System.out.println("main ended");	
	}
}