class WashingMachine{
     
	  static boolean isConnected = false;
	  
	public static void turnOn(){
		  System.out.println("Start of turnOn");
		   if(isConnected == false){
			   isConnected = true;
			   System.out.println("Washing Machine is turned onn...");
		   }
		   System.out.println("end of turnOn");
	  }
	  
public static boolean turnOff(){
	   System.out.println("Start of turnOff");
		   if(isConnected == true){
			   isConnected = false;
			   System.out.println("Washing Machine is turned off");
		   }
		   System.out.println("end of turnOff");
		   return isConnected;
	  }
}