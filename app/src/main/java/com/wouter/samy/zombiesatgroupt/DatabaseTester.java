package com.wouter.samy.zombiesatgroupt;

import com.wouter.samy.zombiesatgroupt.Databasetest;

import static junit.framework.Assert.assertNotNull;

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
