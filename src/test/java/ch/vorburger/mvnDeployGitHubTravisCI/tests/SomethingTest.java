package ch.vorburger.mvnDeployGitHubTravisCI.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.vorburger.mvnDeployGitHubTravisCI.Something;

public class SomethingTest {

	@Test
	public void testGetMessage() {
		assertEquals("hello, world", new Something().getMessage());
	}

}
