package Resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport 

{
	static ExtentReports extent;
	
public static ExtentReports getreportobject()
{
	
	String path = System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter reporter = new ExtentSparkReporter(path);
	reporter.config().setReportName("Web automation result");
	reporter.config().setDocumentTitle("TestResult");
	extent = new ExtentReports();
	extent.attachReporter (reporter);
	extent.setSystemInfo("Tester", "divya varnwal");
	return extent;
}

}
