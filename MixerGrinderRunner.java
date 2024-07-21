class MixerGrinderRunner{
static boolean connect ;
public static void main(String[]preethi){
	System.out.println("Main started");
	connect = MixerGrinder.onOrOff();
	System.out.println("is MixerGrinder connected :"+connect);
	MixerGrinder.increaseSpeed();
		connect = MixerGrinder.onOrOff();
	    System.out.println("is MixerGrinder connected :"+connect);
		MixerGrinder.increaseSpeed();
		MixerGrinder.decreaseSpeed();
		connect = MixerGrinder.onOrOff();
			MixerGrinder.increaseSpeed();
			MixerGrinder.increaseSpeed();
			MixerGrinder.increaseSpeed();
			MixerGrinder.increaseSpeed();
			MixerGrinder.decreaseSpeed();
			MixerGrinder.decreaseSpeed();
			MixerGrinder.decreaseSpeed();
			MixerGrinder.decreaseSpeed();
			MixerGrinder.decreaseSpeed();
			MixerGrinder.decreaseSpeed();
	System.out.println("is MixerGrinder connected :"+connect);
		connect = MixerGrinder.onOrOff();
	System.out.println("is MixerGrinder connected :"+connect);
	System.out.println("Main ended");
   }	
}