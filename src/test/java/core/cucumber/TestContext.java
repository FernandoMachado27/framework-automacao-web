package core.cucumber;

import core.managers.DriverManager;
import core.managers.PageObjectManager;

public class TestContext {

	private DriverManager driverManager;
	private PageObjectManager pageObjectManager;

	public TestContext() {
		driverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(driverManager.getDriver());
	}

	public DriverManager getWebDriverManager() {
		return driverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
