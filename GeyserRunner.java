class GeyserRunner{
	
	public static void main(String[]havells){
	
	System.out.println("main started");
	
	boolean connect = Geyser.onOrOff();
	System.out.println("is geyser connected :"+connect);
	
		connect = Geyser.onOrOff();
	    System.out.println("is Geyser connected :"+connect);
     System.out.println("main ended");	
	}
}