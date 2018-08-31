package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuiTest {

	@Test
	void testcheckCui() {
		assertEquals(1,Cui.checkId("saigandhe","150696","saigandhe","150696"));
		assertEquals(0,Cui.checkId("saigandhe","1506966","Saigandhe","150369"));
		
	}

}
