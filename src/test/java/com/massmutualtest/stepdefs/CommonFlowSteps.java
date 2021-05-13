package com.massmutualtest.stepdefs;

import com.massmutualtest.pages.PortalPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CommonFlowSteps {
	
	PortalPage portalpage = new PortalPage();
	
	@Before
	public void launch() {
		portalpage.lauchPortal();
	}
	
	@After
	public void tearDown() {
		portalpage.closeBrowser();
	}
	
}

