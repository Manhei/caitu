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
		Log.v("MenuScreen", "���캯��!");
		content = activity;
	}

	@Override
	public void alter(LTimerContext arg0) {
		Log.v("MenuScreen", "alter����!");

	}

	@Override
	public void draw(LGraphics g) {
		// TODO �Զ����ɵķ������
		Log.v("MenuScreen", "draw()����!");
//		g.drawClear(LColor.black);
//		g.drawString("Hello World", 100, 100);
	}


	@Override
	public void onTouchDown(Touch arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void onTouchMove(Touch arg0) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void onTouchUp(Touch arg0) {
		// TODO �Զ����ɵķ������
		
	}

}
