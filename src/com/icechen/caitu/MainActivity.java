package com.icechen.caitu;

import org.loon.framework.android.game.LGameAndroid2DActivity;

import com.icechen.caitu.sreen.MenuScreen;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends LGameAndroid2DActivity {


	@Override
	public void onGamePaused() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void onGameResumed() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void onMain() {
        /* ������Ϸ�Ƿ���� */  
		   
        this.initialization(true);  

          
        /* ��Activity����һ�����棬�е�������View */  

        this.setScreen(new MenuScreen(this));  

          

        this.setFPS(30);  

          

        this.setShowFPS(true);  

          

        this.setShowLogo(false);  

          

        this.showScreen();  

	}

}
