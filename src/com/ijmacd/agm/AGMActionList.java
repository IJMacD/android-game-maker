package com.ijmacd.agm;

import java.util.ArrayList;

public class AGMActionList extends AGMAction {
	private ArrayList<AGMAction> mActions;
	
	AGMActionList(){
		mActions = new ArrayList<AGMAction>();
	}
	
	void addAction(AGMAction action){
		mActions.add(action);
	}
	
	@Override
	void run(AGMObject target) {
		for(AGMAction action : mActions){
			action.run(target);
		}
	}
}
