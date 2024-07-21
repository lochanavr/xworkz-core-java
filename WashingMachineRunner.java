class WashingMachineRunner{

public static void main(String[]bosch){
	
	System.out.println("main started");
	
	boolean connect = WashingMachine.onOrOff();
	System.out.println("is Washing Machine connected :"+connect);
	
		connect = WashingMachine.onOrOff();
	    System.out.println("is Washing Machine connected :"+connect);
     System.out.println("main ended");	
	}
}