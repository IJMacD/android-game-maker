package com.ijmacd.agm;

import java.util.ArrayList;

public class GameObjectManager extends GameObject {
	private ArrayList<GameObject> mList;
	
	GameObjectManager(){
		mList = new ArrayList<GameObject>();
	}
	
	void addObject(GameObject object){
		mList.add(object);
	}
	
	void removeObject(GameObject object){
		mList.remove(object);
	}
	
	@Override
	void update(long delta) {
		for(GameObject object : mList){
			object.update(delta);
		}
	}

}
