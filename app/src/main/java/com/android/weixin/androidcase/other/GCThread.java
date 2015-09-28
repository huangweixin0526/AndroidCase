package com.android.weixin.androidcase.other;

public class GCThread extends Thread {

	@Override
	public void run() {
		super.run();

		while (true) {
			try {
				Thread.sleep(1000 * 5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
