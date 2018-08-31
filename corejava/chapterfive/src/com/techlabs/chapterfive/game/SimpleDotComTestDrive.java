package com.techlabs.chapterfive.game;

public class SimpleDotComTestDrive {
	public static void main(String arg[]){
		SimpleDotCom dot = new SimpleDotCom();
		int []locations = {2,3,4};
		dot.setLocationCells(locations);
		String userGess ="2";
		String result = dot.checkYourself(userGess);
	}

}
