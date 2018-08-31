package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringOfPalTest {

	@Test
	void test() {
		assertArrayEquals(new String[] {"121","787" , "545","454",null,null,null,null,null,null}, Stringofpal.OrderPalindromes(new String[] {"121","154","234","787","545","678","454","678","789","890"}));
	}

}
