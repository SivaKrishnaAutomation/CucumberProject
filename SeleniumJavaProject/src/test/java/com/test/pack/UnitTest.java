package com.test.pack;

import org.testng.Assert;
import org.testng.annotations.Test;

import comp.app.training.AppTest;

public class UnitTest {
	
	
	
	@Test
	public void test2() {
		
		AppTest app = new AppTest();
		int code = app.loginApp("siva", "labcorp");
		Assert.assertEquals(1, code);
		
	}

}
