package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;

public class MyTests extends RetryAnalyzer{

	//@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class) -- for retry logic at @Test level
	@Test
	public void Test1()
	{
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(false,true);
	}
	
	@Test
	public void Test3()
	{
		Assert.assertEquals(true,true);
	}
	
}
