package org.juit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ThirdClass {
	
	@BeforeClass
	public static void afterClass() {
		System.out.println("beforeClass");
	}
	@Before
	public void before() {
		System.out.println("before");
	}

	@AfterClass
	public static void afterClas() {
	System.out.println("After Class");
	}
	
	@After
	public void after() {
		System.out.println("after");
	}	
		
	@Test
	public void tc1() {
		System.out.println("Test 1");
		
	}
		
	@Test
	public void tc2() {
		System.out.println("Test 2");
		
	}
		
	}
	
	

