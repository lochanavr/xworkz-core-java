class MixerGrinderRunner{

public static void main(String[]pigeon){
	
	System.out.println("main started");
	
	boolean connect = MixerGrinder.onOrOff();
	System.out.println("is  MixerGrinder connected :"+connect);
	
		connect = MixerGrinder.onOrOff();
	    System.out.println("is MixerGrinder connected :"+connect);
     System.out.println("main ended");	
	}
}