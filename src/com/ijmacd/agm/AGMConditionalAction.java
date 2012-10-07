package com.ijmacd.agm;

public class AGMConditionalAction extends AGMActionList {

	public enum Operation {
		EQUALTO,
		LESSTHAN,
		MORETHAN
	}
	
	private Condition mCondition;
	
	@Override
	void execute(AGMObject self, AGMObject other) {
		if(mCondition != null){
			if(mCondition.evaluate())
				run(self);
		}
	}
	
	interface Condition {
		boolean evaluate();
	}
	
	static class InstanceCount implements Condition {
		private AGMObject mObject;
		private Operation mOperation;
		private int mValue;
		@Override
		public boolean evaluate() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}

	static class NextRoomExists implements Condition {

		@Override
		public boolean evaluate() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
	static class PositionFree implements Condition {
		private Vector2 mPostion;
		@Override
		public boolean evaluate() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
	static class GridAligned implements Condition {
		private Vector2 mGridSize;
		@Override
		public boolean evaluate() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
	static class Property implements Condition {
		private String mPropertyname;
		@Override
		public boolean evaluate() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
	
	static class Random implements Condition {
		private int mChanceIn;

		@Override
		public boolean evaluate() {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
}
