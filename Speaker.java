class Speaker{
      
	  static boolean isConnected = false;
	  
	  public static void turnOn(){
		  System.out.println("Start of turnOn");
		   
		   if(isConnected == false){
			   isConnected = true;
			   System.out.println("Speaker is turned on..");
		   }
		   System.out.println("end of turnOn");
		   //return isConnected;
	  }
	  
	  
	  public static boolean turnOff(){
	   System.out.println("Start of turnOff");
		   
		   if(isConnected == true){
			   isConnected = false;
			   System.out.println("Speaker is turned off..");
		   }
		   System.out.println("end of turnOff");
		   return isConnected;
	  }
}