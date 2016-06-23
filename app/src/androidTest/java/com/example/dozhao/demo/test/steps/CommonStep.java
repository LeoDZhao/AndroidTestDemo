package com.example.dozhao.demo.test.steps;

import android.support.test.espresso.Espresso;

import cucumber.api.java.en.Then;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by dozhao on 6/23/16.
 */
public class CommonStep {
    @Then("^I should see \"([^\"]*)\"$")
    public void I_should_see(String text) throws Throwable {
        Espresso.onView(withText(text))
                .check(matches(notNullValue()));
    }
}
