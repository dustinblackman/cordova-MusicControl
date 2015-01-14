package com.dustinblackman.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.content.Context;
import android.media.MediaPlayer;
import java.io.IOException;

public class MusicControl extends CordovaPlugin {
  // @Override

  private MediaPlayer mMediaPlayer = new MediaPlayer();

  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {

    if (action.equals("playTrack")) {
      String trackURI = args.getString(0);

      mMediaPlayer.reset();

      try {
        mMediaPlayer.setDataSource("file://"+trackURI);
      } catch (IllegalArgumentException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IllegalStateException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      try {
        mMediaPlayer.prepare();
      } catch (IllegalStateException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      mMediaPlayer.start();

      callbackContext.success("Started Track at URI: "+trackURI);

    } else {
      Intent i;
      Context context=this.cordova.getActivity().getApplicationContext();

      i = new Intent("com.android.music.musicservicecommand");
      i.putExtra("command", action);
      context.sendBroadcast(i);
      callbackContext.success("Executed Music Control Cmd: "+action);

    }

    return true;

  }

};
