package com.icechen.caitu;

import org.loon.framework.android.game.LGameAndroid2DActivity;

import com.icechen.caitu.sreen.MenuScreen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends LGameAndroid2DActivity {


	@Override
	public void onGamePaused() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onGameResumed() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onMain() {
        /* 设置游戏是否横屏 */  
		   
        this.initialization(true);  

          
        /* 给Activity赋予一个画面，有点类似于View */  

        this.setScreen(new MenuScreen(this));  

          

        this.setFPS(30);  

          

        this.setShowFPS(true);  

          

        this.setShowLogo(false);  

          

        this.showScreen();  

	}

}
