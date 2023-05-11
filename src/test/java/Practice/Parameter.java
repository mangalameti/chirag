package Practice;

import org.testng.annotations.Test;

public class Parameter {
	@Test
	public void m1()
	{
		String BROWSER=System.getProperty("browser");
		String URL=System.getenv("url");
		System.out.println(BROWSER);
		System.out.println(URL);
	}

}
