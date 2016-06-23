package com.example.dozhao.demo.test;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.util.Log;

import com.example.dozhao.demo.LoginActivity;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by dozhao on 6/22/16.
 */
public class GlobalHook {
    @Before
    public void setUp() {
        Instrumentation inst = InstrumentationRegistry.getInstrumentation();
        Intent intent = new Intent(inst.getTargetContext(), LoginActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        inst.startActivitySync(intent);
    }

    @After
    public void tearDown() {
        Log.i("dozhao", "tearDown");
    }
}

