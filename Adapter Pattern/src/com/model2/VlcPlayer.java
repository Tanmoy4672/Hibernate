package com.model2;

public class VlcPlayer implements AdvanceMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing Vlc file. Name: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing
	
	}


}
