class WashingMachineRunner{
static boolean connect ;
public static void main(String[]bosch){
	System.out.println("Main started....");
	connect = WashingMachine.onOrOff();
	System.out.println("is WashingMachine connected :"+connect);
	WashingMachine.increaseSpeed();
		connect = WashingMachine.onOrOff();
	    System.out.println("is WashingMachine connected :"+connect);
		WashingMachine.increaseSpeed();
		WashingMachine.decreaseSpeed();
		connect = WashingMachine.onOrOff();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
            WashingMachine.increaseSpeed();
			WashingMachine.increaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
			WashingMachine.decreaseSpeed();
	System.out.println("is WashingMachine connected :"+connect);
		connect = WashingMachine.onOrOff();
	System.out.println("is WashingMachine connected :"+connect);
	System.out.println("Main ended...");
   }	
}