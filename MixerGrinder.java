class MixerGrinder{
     
	  static boolean isConnected = false;
	  static int maxSpeed =5;
	  static int currentSpeed = 1;
	  static int minSpeed = 2;
	  
	  public static boolean onOrOff(){
		  System.out.println("Start of onOrOff");
		  if(!isConnected)isConnected=true;
		  else if(!isConnected)isConnected=false;
		  System.out.println("end of onOrOff");
		  return isConnected;
	  }
	  
	  public static void increaseSpeed(){
		  System.out.println("Start of increase Speed");
		  if(isConnected){
			  if(currentSpeed<maxSpeed){
				  currentSpeed++;
				  System.out.println("current Speed is "+currentSpeed);
			  }
			  else{
				  System.out.println("max speed reached");
		  }
	  }
	  else{
		  System.out.println("please turn on the Mixer Grinder");
	  }
	  System.out.println("increase speed ended");
	  return;
}

    public static void decreaseSpeed(){
		System.out.println("decrease Speed started");
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
		System.out.println("please turn on Mixer Grinder");
	}
	System.out.println("decrease Speed ended");
return ;	
	}  
}