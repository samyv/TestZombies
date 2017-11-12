package com.wouter.samy.zombiesatgroupt.storage;

import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DatabaseTester {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetInstance() {
		assertNotNull("Instance not created", Databasetest.UNIQUEINSTANCE);
	}
	
	@Test
	public void testGetConnection() {
		assertNotNull("Connection not set up", Databasetest.UNIQUEINSTANCE.getConnection());
	}

}
