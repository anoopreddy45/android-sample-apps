package com.google.android.libraries.cast.companionlibrary.cast.tracks;

import android.os.Bundle;

import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;

import static com.google.android.libraries.cast.companionlibrary.utils.LogUtils.LOGE;

/**
 * Created by kollu on 3/21/2017.
 */

public class NewJavaClass {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        VideoCastManager castManager = VideoCastManager.getInstance();
        if (!castManager.isFeatureEnabled(VideoCastManager.FEATURE_CAPTIONS_PREFERENCE)) {
            LOGE(TAG, "Did you forget to enable FEATURE_CAPTIONS_PREFERENCE when you initialized"
                    + " the VideoCastManage?");
            finish();
            return;
        }


}
