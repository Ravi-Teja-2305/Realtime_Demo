package RerunFailedTestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RerunFailedTestCases {

	@Test
	public void Rerun(){
		
		TestNG runner = new TestNG();
		
		List<String> failedtc = new ArrayList<String>();
		
		failedtc.add("G:\\Rest Assured Automation Testing\\Eclipse Practice\\workspace\\SeleniumRevision\\test-output\\testng-failed.xml");
		
		runner.setTestSuites(failedtc);
		
		runner.run();
		
	}
	
}
