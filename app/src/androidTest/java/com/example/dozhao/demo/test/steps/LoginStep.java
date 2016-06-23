package com.example.dozhao.demo.test.steps;

import com.example.dozhao.demo.test.pages.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by dozhao on 6/22/16.
 */
public class LoginStep {
    @Given("^I am on Login Page")
    public void I_am_on_Login_Page() throws Exception {
    }

    @When("^I sign in with correct email and password$")
    public void I_sign_in_with_correct_email_and_password() throws Throwable {
        LoginPage loginPage = new LoginPage();
        loginPage.signIn("foo@example.com","hello");
    }
}
