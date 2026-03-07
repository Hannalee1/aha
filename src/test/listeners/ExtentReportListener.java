package com.example.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener {
    
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Extent Report: Test Started - " + result.getName());
    }
    
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Extent Report: Test Passed - " + result.getName());
        // Add Extent Report logging here
    }
    
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Extent Report: Test Failed - " + result.getName());
        // Add Extent Report logging here
    }
    
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Extent Report: Test Skipped - " + result.getName());
        // Add Extent Report logging here
    }
    
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Extent Report: Test Failed but within success % - " + result.getName());
    }
}
