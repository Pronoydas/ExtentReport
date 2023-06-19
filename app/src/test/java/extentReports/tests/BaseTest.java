package extentReports.tests;

import java.io.File;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
  public   static ExtentTest test;
  public  static ExtentReports report;

    @BeforeSuite(alwaysRun = true)
    public void setupReport(){
        report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReportResult.html",true);
        report.loadConfig(new File(System.getProperty("user.dir")+"/ExtentReport.xml"));
    }

    @AfterSuite
    public void closed(){
        report.flush();
        report.close();
    }

    
}
