class DishWasher{
     
	  static boolean isConnected = false;
	  
	  public static void turnOn(){
	  
		  System.out.println("Start of turnOn");
		   if(isConnected == false){
			   isConnected = true;
			   
			   System.out.println("dish washer is turned on");
		   }
		   
		   System.out.println("end of turnOn");
	  }
	  
public static boolean turnOff(){
    System.out.println("Start of turnOff");
		   if(isConnected == true){
			  isConnected = false;
			   System.out.println("dish washer is turned off");
		   }
	  System.out.println("end of turnOff");
		   
		   return isConnected;
	  }
}