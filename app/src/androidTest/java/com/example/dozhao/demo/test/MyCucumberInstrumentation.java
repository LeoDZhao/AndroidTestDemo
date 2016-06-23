package com.example.dozhao.demo.test;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import android.util.Log;

import cucumber.api.android.CucumberInstrumentationCore;

/**
 * Created by dozhao on 6/23/16.
 */
public class MyCucumberInstrumentation extends AndroidJUnitRunner {
        private final CucumberInstrumentationCore cucumberInstrumentationCore = new CucumberInstrumentationCore(this);

        @Override
        public void onCreate(final Bundle bundle) {
            super.onCreate(bundle);
            Log.d("dozhao", "onCreate");

            cucumberInstrumentationCore.create(bundle);
        }

        @Override
        public void onStart() {
            waitForIdleSync();
            cucumberInstrumentationCore.start();
        }

}
