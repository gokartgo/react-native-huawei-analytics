package com.reactlibrary;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.hms.analytics.HiAnalyticsInstance;
import com.huawei.hms.analytics.HiAnalyticsTools;

import javax.annotation.Nullable;

public class RNReactNativeHuaweiAnalyticsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  HiAnalyticsInstance instance;

  public RNReactNativeHuaweiAnalyticsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    Handler mainHandler = new Handler(reactContext.getMainLooper());
    Runnable myRunnable = new Runnable() {
      @Override
      public void run() {
        HiAnalyticsTools.enableLog();
        instance = HiAnalytics.getInstance(getReactApplicationContext());
        instance.setAnalyticsEnabled(true);
        instance.regHmsSvcEvent();
      }
    };
    mainHandler.post(myRunnable);
  }

  @Override
  public String getName() {
    return "RNReactNativeHuaweiAnalytics";
  }

  @ReactMethod
  public void logEvent(final String name, @Nullable final ReadableMap params) {
    Log.d("logEvent:",name+" "+params);
    instance.onEvent(name, Arguments.toBundle(params));
  }

  /**
   * @param enabled
   */
  @ReactMethod
  public void setAnalyticsCollectionEnabled(final Boolean enabled) {
    // Enable the automatic collection capability.
    instance.setAutoCollectionEnabled(enabled);
  }

  /**
   * @param screenName
   * @param screenClassOverride
   */
  @ReactMethod
  public void setCurrentScreen(final String screenName, final String screenClassOverride) {
    final Activity activity = getCurrentActivity();
    if (activity != null) {
      // needs to be run on main thread
      Log.d("setCurrentScreen:", "setCurrentScreen " + screenName + " - " + screenClassOverride);
      activity.runOnUiThread(new Runnable() {
        @Override
        public void run() {
          instance.setCurrentActivity(activity, screenName, screenClassOverride);
        }
      });
    }
  }

  /**
   * @param id
   */
  @ReactMethod
  public void setUserId(final String id) {
    Log.d("setUserId:",id+"");
    instance.setUserId(id);
  }

  /**
   * @param name
   * @param value
   */
  @ReactMethod
  public void setUserProperty(final String name, final String value) {
    Log.d("setUserProfile:",name+" "+value);
    instance.setUserProfile(name, value);
  }
  
}