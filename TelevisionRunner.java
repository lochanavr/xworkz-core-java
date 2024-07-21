class TelevisionRunner{
static boolean connect ;
public static void main(String[]lg){
	System.out.println("Main started");
	connect =  Television.onOrOff();
	System.out.println("is  Television connected :"+connect);
	 Television.increaseSpeed();
		connect =  Television.onOrOff();
	    System.out.println("is  Television connected :"+connect);
		 Television.increaseSpeed();
		 Television.decreaseSpeed();
		connect =  Television.onOrOff();
			 Television.increaseSpeed();
			 Television.increaseSpeed();
			 Television.increaseSpeed();
			 Television.increaseSpeed();
			 Television.increaseSpeed();
			 Television.decreaseSpeed();
			 Television.decreaseSpeed();
			 Television.decreaseSpeed();
			 Television.decreaseSpeed();
			 Television.decreaseSpeed();
	System.out.println("is  Television connected :"+connect);
		connect =  Television.onOrOff();
	System.out.println("is  Television connected :"+connect);
	System.out.println("Main ended");
   }	
}