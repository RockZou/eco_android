package com.rock.moves_api;

import com.unity3d.player.UnityPlayer;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.widget.Toast;

public class MovesAuth {


    private static final String CLIENT_ID = "81BlGaldSj5KIjUdz374fcMocXbu6AMC";
    private static final String CLIENT_SECRET = "uXeALhVX4zefkW7j73tVMtKE35R0777z8XmK14yaOp91sE41XrvcWfx5q9N9evvc";
    private static final String CODE = "B60pXI53j9f1T7M7fgj8v05R2BH3aQnhvft7ybGsfb7o6SOq08VBd8ZZpSPUG7Nh";

    private static final String REDIRECT_URI = "/";

    private static final int REQUEST_AUTHORIZE = 1;
    
    public Uri auth_Token;
    
    public static void doRequestMovesAuthInApp() {
    //private void doRequestAuthInApp() {
        
        Log.d("MainActivity","********Auth is called********");
        Log.d("MainActivity","********Auth is called********");
        Log.d("MainActivity","********Auth is called********");
        Log.d("MainActivity","********Auth is called********");
        Log.d("MainActivity","********Auth is called********");
        Log.d("MainActivity","********Auth is called********");
        
        Uri uri = createMovesAuthUri("moves", "app", "/authorize").build();
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        try {
            UnityPlayer.currentActivity.startActivityForResult(intent, REQUEST_AUTHORIZE);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(null, "Moves app not installed", Toast.LENGTH_SHORT).show();
        }
        //return 12345;
    }
 
    public static Uri.Builder createMovesAuthUri(String scheme, String authority, String path) {
    //private Uri.Builder createAuthUri(String scheme, String authority, String path) {
        return new Uri.Builder()
                .scheme(scheme)
                .authority(authority)
                .path(path)
                .appendQueryParameter("client_id", CLIENT_ID)
                .appendQueryParameter("redirect_uri", REDIRECT_URI)
                .appendQueryParameter("scope", "location activity")
                .appendQueryParameter("state", String.valueOf(SystemClock.uptimeMillis()));
    }
    
    public static Uri.Builder createMovesTokenUri(String scheme, String authority, String path) {
    //private Uri.Builder createAuthUri(String scheme, String authority, String path) {
        return new Uri.Builder()
                .scheme(scheme)
                .authority(authority)
                .path(path)
                .appendQueryParameter("code", CODE)
                .appendQueryParameter("client_id", CLIENT_ID)
                .appendQueryParameter("client_secret", CLIENT_SECRET);
    }
    
    /*
    public void exchangeToken(){
    	Uri uri = createMovesTokenUri("http","api.moves-app.com","/oauth/v1/access_token").build();
    }
    */

}
