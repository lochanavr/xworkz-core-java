class RadioRunner{

public static void main(String[]redfm){
	
	System.out.println("main started");
	
	boolean connect = Radio.onOrOff();
	System.out.println("is Radio connected :"+connect);
	
		connect = Radio.onOrOff();
	    System.out.println("is Radio connected :"+connect);
     System.out.println("main ended");	
	}
}