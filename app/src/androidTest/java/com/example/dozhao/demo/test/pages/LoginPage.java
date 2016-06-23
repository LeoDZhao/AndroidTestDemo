package com.example.dozhao.demo.test.pages;

import android.support.test.espresso.Espresso;
import com.example.dozhao.demo.R;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by dozhao on 6/23/16.
 */
public class LoginPage {

    public void signIn(String email, String password) {
        Espresso.onView(withId(R.id.email))
                .perform(replaceText(email));
        Espresso.onView(withId(R.id.password))
                .perform(replaceText(password));
        Espresso.onView(withId(R.id.email_sign_in_button))
                .perform(click());
    }
}
