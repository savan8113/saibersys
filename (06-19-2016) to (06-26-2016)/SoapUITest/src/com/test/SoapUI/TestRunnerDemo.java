package com.test.SoapUI;

import org.junit.Test;

import com.eviware.soapui.tools.SoapUITestCaseRunner;

public class TestRunnerDemo {

	
	@Test
	public void demo() throws Exception
	{
		SoapUITestCaseRunner testRunner = new SoapUITestCaseRunner();
		
		testRunner.setProjectFile("/Users/Savanth/Desktop/SOAP-Practice/CalculatorService-soapui-project.xml");
		
		testRunner.run();
	}

		
		
	
}
