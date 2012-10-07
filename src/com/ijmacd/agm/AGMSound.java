package com.ijmacd.agm;

public class AGMSound {
	public enum SoundType {
		NONE,
		EFFECT,
		BACKGROUND
	}
	
	private String mID;
	private SoundType mType;
	private int mResource;
}
