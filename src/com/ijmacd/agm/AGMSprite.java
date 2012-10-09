package com.ijmacd.agm;

import android.graphics.Bitmap;

public class AGMSprite {
	public AGMSprite(String id) {
		this.id = id;
	}
	public String id;
	public Bitmap bitmap;
	public Vector2 size;
	public Vector2 origin;
	public boolean transparent;
}
