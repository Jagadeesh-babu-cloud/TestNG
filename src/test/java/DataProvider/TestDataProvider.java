package DataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

//we can create single data provider for all the suites
//we can also create single data provider for every suite when we have categorize data based on suites
// source can be external Json,Excel,Yaml,Xml
//deleted comments
public class TestDataProvider {
    
	@DataProvider
	public static Object[][] dataProviderSuiteA(Method method) {
		Object data[][]=null;

		if (method.getName().equalsIgnoreCase("TestA")) {
			data = new Object[2][2];

			data[0][0] = "username1";
			data[0][1] = "password1";
			data[1][0] = "username2";
			data[1][1] = "password2";
		}

		return data;

	}

}
