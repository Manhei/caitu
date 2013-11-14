package com.icechen.caitu.sreen;

import org.loon.framework.android.game.core.graphics.LColor;
import org.loon.framework.android.game.core.graphics.Screen;
import org.loon.framework.android.game.core.graphics.Touch;
import org.loon.framework.android.game.core.graphics.device.LGraphics;
import org.loon.framework.android.game.core.timer.LTimerContext;

import com.icechen.caitu.MainActivity;

import android.util.Log;

public class MenuScreen extends Screen {
	
	MainActivity content;

	public MenuScreen(MainActivity activity) {
		Log.v("MenuScreen", "构造函数!");
		content = activity;
	}

	@Override
	public void alter(LTimerContext arg0) {
		Log.v("MenuScreen", "alter函数!");

	}

	@Override
	public void draw(LGraphics g) {
		// TODO 自动生成的方法存根
		Log.v("MenuScreen", "draw()函数!");
//		g.drawClear(LColor.black);
//		g.drawString("Hello World", 100, 100);
	}


	@Override
	public void onTouchDown(Touch arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onTouchMove(Touch arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onTouchUp(Touch arg0) {
		// TODO 自动生成的方法存根
		
	}

}
