package com.ijmacd.agm;

abstract class AGMAction {
	public enum AppliesToType {
		NONE,
		SELF,
		OTHER,
		OBJECT
	}
	public enum Directions {
		NONE(0),
		UP(1),
		NE(3),
		RIGHT(2),
		SE(6),
		DOWN(4),
		SW(12),
		LEFT(8),
		NW(9),
		HORIZONTAL(10),
		VERTICAL(5),
		BOTH(15);
		private int mValue;
		Directions(int value){
			mValue = value;
		}
		int getValue(){
			return this.mValue;
		}
	}
	
	protected AppliesToType mAppliesTo;
	protected AGMObject mAppliesToObject;
	protected String mData;
	
	void execute(AGMObject self, AGMObject other){
		switch(mAppliesTo){
		case SELF:
			run(self);
			break;
		case OTHER:
			run(other);
			break;
		case OBJECT:
			run(mAppliesToObject);
			break;
		default:
			break;
		}
	}
	
	abstract void run(AGMObject target);

	static class ChangeInstanceAction extends AGMAction {
		
		private AGMObject mObject;
		private boolean mEvents;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class ChangeSpriteAction extends AGMAction {
		private AGMSprite mSprite;
		private int mSubImage;
		private int mSpeed;

		@Override
		void run(AGMObject appliesTo) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class DestroyInstanceAction extends AGMAction {

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class GoToNextRoomAction extends AGMAction {

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class JumpToPostionAction extends AGMAction {

		Vector2 mPosition;
		boolean mRelative;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class JumpToStartAction extends AGMAction {

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class PlaySoundAction extends AGMAction {
		private AGMSound mSound;
		private boolean mLoop;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class RestartGameAction extends AGMAction {

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class ReverseDirectionAction extends AGMAction {
		Directions mDirections;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class SetAlarmAction extends AGMAction {

		private Alarm mAlarm;
		private int mSteps;
		private boolean mRelative;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class SetCaptionAction extends AGMAction {

		boolean mShowScore;
		String mScoreCaption;
		boolean mShowLives;
		String mLivesCaption;
		boolean mShowHealth;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class SetLivesAction extends AGMAction {

		private int mValue;
		private boolean mRelative;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
	}
	
	class SetScoresAction extends AGMAction {

		int mValue;
		boolean mRelative;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class ShowHighScoresAction extends AGMAction {

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class SleepAction extends AGMAction {
		int mPeriod;
		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	class StartMovingAction extends AGMAction {
		private Directions mDirection;
		private int mSpeed;
		
		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	static class WrapScreenAction extends AGMAction {

		private Directions mDirection;

		@Override
		void run(AGMObject target) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
