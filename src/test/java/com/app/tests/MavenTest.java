package com.app.tests;

import org.testng.annotations.Test;

public class MavenTest 
{
	@Test
	public void testSample()
	{
		String browser = System.getProperty("browser");
		String url = System.getProperty("url");
		System.out.println(browser);
		System.out.println(url);
	}
	


}
