class Geyser{
     
	  static boolean isConnected = false;
	   static int maxTemperature = 7;
	  static int currentTemperature = 0;
	  static int minTemperature   = 0;
	  
	  
	   public static boolean onOrOff(){
		  System.out.println("Start of onOrOff");
		   if(!isConnected)isConnected = true;
	  else if(!isConnected)isConnected = false;
		   return isConnected;
	  }
	  
	  public static void increaseTemperature(){
			System.out.println("increaseTemperature started");
		if(isConnected){
			if(currentTemperature<maxTemperature){
				currentTemperature++;
				System.out.println("current temperature is "+currentTemperature);
			}
			else{
				System.out.println("max temperature reached");
			}
		}
		else{
			System.out.println("please turn on the geyser");
		}
		System.out.println("increaseTemperature ended");
	return ;	
	}
	
	public static void decreaseTemperature(){
		System.out.println("decreaseTemperature started");
		if(isConnected){
			if(currentTemperature>minTemperature){
				currentTemperature--;
				System.out.println("current temperature is "+currentTemperature);
			}
			else{
				System.out.println("min temperature reached");
			}
		}
		else{
			System.out.println("please turn on the geyser");
		}
		System.out.println("decreaseTemperature ended");
	return ;	
		}
}