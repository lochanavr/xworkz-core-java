class RadioRunner{
static boolean connect ;
public static void main(String[]redfm)
{
      System.out.println("Main started");

	connect = Radio.onOrOff();
	System.out.println("is Radio connected :"+connect);
	Radio.increaseSpeed();
		connect = Radio.onOrOff();
	    System.out.println("is Radio connected :"+connect);
		Radio.increaseSpeed();
		Radio.decreaseSpeed();
		connect = Radio.onOrOff();
			Radio.increaseSpeed();
			Radio.increaseSpeed();
			Radio.increaseSpeed();
			Radio.increaseSpeed();
			Radio.decreaseSpeed();
			Radio.decreaseSpeed();
			Radio.decreaseSpeed();
			Radio.decreaseSpeed();
			Radio.decreaseSpeed();
			Radio.decreaseSpeed();
	System.out.println("is Radio connected :"+connect);
		connect = Radio.onOrOff();
	System.out.println("is Radio connected :"+connect);
	System.out.println("Main ended");
   }	
}