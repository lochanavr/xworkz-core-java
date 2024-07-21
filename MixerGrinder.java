class MixerGrinder{
     
	  static boolean isConnected = false;
	   static int maxSpeed  	= 12;
	  static int currentSpeed = 5;
	  static int minSpeed    = 7;
	  
	 public static boolean onOrOff(){
		  System.out.println("Start of onOrOff");
		  isConnected = (isConnected == false) ? true:false;
				    System.out.println("end of onOrOff");
		  return isConnected;
	 }
	 
	 public static void increaseSpeed(){
		System.out.println("increaseSpeed started");
	if(isConnected){
		if(currentSpeed<maxSpeed){
			currentSpeed++;
			System.out.println("current speed is "+currentSpeed);
		}
		else{
			System.out.println("max speed reached");
		}
	}
	else{
		System.out.println("please turn on the MixerGrinder");
	}
	System.out.println("increaseSpeed ended");
return ;	
}
	public static void decreaseSpeed(){
		System.out.println("decreaseSpeed started");
	if(isConnected){
		if(currentSpeed>minSpeed){
			currentSpeed--;
			System.out.println("current Speed is "+currentSpeed);
		}
		else{
			System.out.println("min speed reached");
		}
	}
	else{
		System.out.println("please turn on the MixerGrinder");
	}
	System.out.println("decreaseSpeed ended");
return ;
		
	}
}