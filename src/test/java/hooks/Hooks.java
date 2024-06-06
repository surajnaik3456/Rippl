package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.IOException;
import testBase.TestBase;

public class Hooks {
	TestBase base = new TestBase();
	
	@Before
	public void browserSetup() throws IOException
	{
		base.browserLaunch();
		System.out.println("I'm inside browser setup");
	}

	@After
	public void tearDown(Scenario scenario)
	{
		base.browserQuit(scenario); 
		System.out.println("Browser closed");
	}
}
