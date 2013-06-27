package com.example.ifinance2;

import android.app.Application;
import android.content.Context;

public class ApplicationContextProvider extends Application {
	private static Context mContext;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		mContext=getApplicationContext();
		
	}

	public static Context getContext() {
		return mContext;
	}

}
