package com.example.dozhao.demo.test;

import junit.framework.TestCase;

import cucumber.api.CucumberOptions;

/**
 * Created by dozhao on 6/22/16.
 */
@CucumberOptions(
        tags = {"@leo"},
        features = {"Demo.feature"},
        glue = {"com.example.dozhao.demo.test"},
        format = {"pretty",
                "html:/storage/emulated/0/demo-cucumber-report/cucumber-html",
                "json:/storage/emulated/0/demo-cucumber-report/cucumber-report.json",
                "rerun:/storage/emulated/0/demo-cucumber-report/rerun.txt"},
        strict = true,
        dryRun = false
)
public class MyTests{
}
