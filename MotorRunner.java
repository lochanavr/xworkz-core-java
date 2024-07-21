class MotorRunner{
	
static boolean connect ;
public static void main(String[]tata){
	System.out.println("Main started");
	connect = Motor.onOrOff();
	System.out.println("is Motor connected :"+connect);
	Motor.increaseSpeed();
		connect = Motor.onOrOff();
	    System.out.println("is Motor connected :"+connect);
		Motor.increaseSpeed();
		Motor.decreaseSpeed();
		connect = Motor.onOrOff();
			Motor.increaseSpeed();
			Motor.increaseSpeed();
			Motor.increaseSpeed();
			Motor.increaseSpeed();
			Motor.decreaseSpeed();
			Motor.decreaseSpeed();
			Motor.decreaseSpeed();
			Motor.decreaseSpeed();
			Motor.decreaseSpeed();
			Motor.decreaseSpeed();
	System.out.println("is Motor connected :"+connect);
		connect = Motor.onOrOff();
	System.out.println("is Motor connected :"+connect);
	System.out.println("Main ended");
   }	
}