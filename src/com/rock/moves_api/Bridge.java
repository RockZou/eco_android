package com.rock.moves_api;

import com.unity3d.player.UnityPlayer;

import android.content.Intent;
import android.provider.MediaStore;
import android.util.Log;

public class Bridge {
	
	public static void ShowCamera(int requestCode){
		Intent photoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
		UnityPlayer.currentActivity.startActivityForResult(photoIntent, requestCode);		
	}
	
	public static void doRequestMovesAuthInApp(){
		MovesAuth.doRequestMovesAuthInApp();
	}
    
	public void bridgeSimpleFunc(){
		Log.d("Bridge","*******bridgeSimpleFunc**********");
		Log.d("Bridge","*******bridgeSimpleFunc**********");
		Log.d("Bridge","*******bridgeSimpleFunc**********");
		Log.d("Bridge","*******bridgeSimpleFunc**********");
		Log.d("Bridge","*******bridgeSimpleFunc**********");
	}
}
