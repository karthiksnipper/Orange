package org.juit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ReportCore {
	
	@Test
	public void report() {
		//Result res = JUnitCore.runClasses(AdactinJu.class, ThirdClass.class);
		
		System.out.println("run Count :"+ res.getRunCount());
		System.out.println("Ignore Count :"+ res.getIgnoreCount());
		System.out.println("Failure Count :"+ res.getFailureCount());
	int passCount = res.getRunCount() - res.getFailureCount();
		System.out.println(res.getRunTime());
		
		List<Failure> fail = res.getFailures();
		for (Failure x : fail) { 
			System.out.println(x);
		}
		
	}

}
