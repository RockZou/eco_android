package com.rock.player;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class UnityPlayerActivity extends com.unity3d.player.UnityPlayerActivity
{
//	protected UnityPlayer mUnityPlayer; // don't change the name of this variable; referenced from native code

	// Setup activity layout
	@Override
	protected void onCreate (Bundle savedInstanceState)
	{
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		
		Log.d("Custom UnityPlayerActivity","************onCreate***************");
		Log.d("Custom UnityPlayerActivity","************onCreate***************");
		Log.d("Custom UnityPlayerActivity","************onCreate***************");
		Log.d("Custom UnityPlayerActivity","************onCreate***************");
		Log.d("Custom UnityPlayerActivity","************onCreate***************");
		
		/*
		setTheme(android.R.style.Theme_NoTitleBar_Fullscreen);
		getWindow().setFormat(PixelFormat.RGBX_8888); // <--- This makes xperia play happy

		mUnityPlayer = new UnityPlayer(this);
		if (mUnityPlayer.getSettings ().getBoolean ("hide_status_bar", true))
			getWindow ().setFlags (WindowManager.LayoutParams.FLAG_FULLSCREEN,
			                       WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(mUnityPlayer);
		mUnityPlayer.requestFocus();
		*/
	}
	
	@Override 
	protected void onActivityResult(int requestCode, int resultCode, Intent data){
		Log.d("Custom UnityPlayerActivity","************onActivityResult***************");
		Log.d("Custom UnityPlayerActivity","************onActivityResult***************");
		Log.d("Custom UnityPlayerActivity","************onActivityResult***************");
		Log.d("Custom UnityPlayerActivity","************onActivityResult***************");
		Log.d("Custom UnityPlayerActivity","************onActivityResult***************");
		
		Uri resultUri=data.getData();
		String resultString = resultUri.toString();
		
		Log.d("Custom UnityPlayerActivity",resultString);
		
		com.unity3d.player.UnityPlayer.UnitySendMessage("JavaCallback","onActivityResult",resultString);
		super.onActivityResult(resultCode, resultCode, data);
	}

	// Quit Unity
	@Override protected void onDestroy ()
	{
		//mUnityPlayer.quit();
		super.onDestroy();
	}

	// Pause Unity
	@Override protected void onPause()
	{
		super.onPause();
		//mUnityPlayer.pause();
	}

	// Resume Unity
	@Override protected void onResume()
	{
		super.onResume();
		//mUnityPlayer.resume();
	}
	/*
	// This ensures the layout will be correct.
	@Override public void onConfigurationChanged(Configuration newConfig)
	{
		super.onConfigurationChanged(newConfig);
		//mUnityPlayer.configurationChanged(newConfig);
	}

	// Notify Unity of the focus change.
	@Override public void onWindowFocusChanged(boolean hasFocus)
	{
		super.onWindowFocusChanged(hasFocus);
		//mUnityPlayer.windowFocusChanged(hasFocus);
	}

	// For some reason the multiple keyevent type is not supported by the ndk.
	// Force event injection by overriding dispatchKeyEvent().
	@Override public boolean dispatchKeyEvent(KeyEvent event)
	{
		if (event.getAction() == KeyEvent.ACTION_MULTIPLE)
			return mUnityPlayer.injectEvent(event);
		return super.dispatchKeyEvent(event);
	}


	// Pass any events not handled by (unfocused) views straight to UnityPlayer
	@Override public boolean onKeyUp(int keyCode, KeyEvent event)     { return mUnityPlayer.injectEvent(event); }
	@Override public boolean onKeyDown(int keyCode, KeyEvent event)   { return mUnityPlayer.injectEvent(event); }
	@Override public boolean onTouchEvent(MotionEvent event)          { return mUnityPlayer.injectEvent(event); }
	///*API12 public boolean onGenericMotionEvent(MotionEvent event)  { return mUnityPlayer.injectEvent(event); }
	*/
}
