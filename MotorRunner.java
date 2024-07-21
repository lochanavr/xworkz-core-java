class MotorRunner{

public static void main(String[]ford){
	
	System.out.println("main started");
	
	boolean connect = Motor.onOrOff();
	System.out.println("is Motor connected :"+connect);
	
		connect = Motor.onOrOff();
	    System.out.println("is Motor connected :"+connect);
     System.out.println("main ended");	
	}
}