class SpotifyRunner{
	
	public static void main(String[]music){
		
		System.out.println("Main Started");
		
		boolean isSpotifyCreated = Spotify.createSpotifyAccount("John",null,"9887633401","yuiop","09/02/2000");
		if(isSpotifyCreated == true)
		Spotify.readSpotifyAccount();
		
		System.out.println("Main ended");
	}

}