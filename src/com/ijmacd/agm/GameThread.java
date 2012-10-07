package com.ijmacd.agm;

import android.os.SystemClock;

public class GameThread extends Thread {

	private Game mGame;
	private GameObject mGameRoot;
	private long mLastTime;
	private boolean mRunning;
	
	GameThread(){
		mGameRoot = new GameObjectManager();
	}
	
	@Override
	public void run() {
		mLastTime = SystemClock.uptimeMillis();
		while(mRunning){
			final long time = SystemClock.uptimeMillis();
			final long delta = time - mLastTime;
			if(delta > 12){
                float secondsDelta = (time - mLastTime) * 0.001f;
                if (secondsDelta > 0.1f) {
                    secondsDelta = 0.1f;
                }
                mLastTime = time;
                
                mGameRoot.update(delta);
                
                // Now swap render list thread over with rendering thread
			}
		}
	}

}
