package com.ijmacd.agm;

public class AGMEvent {
	public enum EventType {
		NONE,
		CREATE,
		STEP,
		COLLISION,
		INPUT,
		OUTSIDE_ROOM,
		GAME_START,
		NO_LIVES,
		ALARM,
		DESTROY
	}
	private EventType mType;
	private String mValue;
	private AGMActionList mActionList;
}
