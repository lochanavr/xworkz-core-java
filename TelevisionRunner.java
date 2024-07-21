class TelevisionRunner{

public static void main(String[]LG){
	
	System.out.println("main started");
	
	boolean connect = Television.onOrOff();
	System.out.println("is Television connected :"+connect);
	
		connect = Television.onOrOff();
	    System.out.println("is Television connected :"+connect);
     System.out.println("main ended");	
	}
}