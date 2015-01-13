package com.dustinblackman.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Intent;
import android.content.Context;

public class MusicControl extends CordovaPlugin {
  // @Override
  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
    Intent i;
    Context context=this.cordova.getActivity().getApplicationContext();

    i = new Intent("com.android.music.musicservicecommand");
    i.putExtra("command", action);
    context.sendBroadcast(i);
    callbackContext.success("Executed Music Control Cmd: "+action);
    return true;

  }

};
