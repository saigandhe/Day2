package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SentenceTest {

	@Test
	void test() {
		assertEquals("this is a sentence", Sentence.correction("this is is a sentence","is",3));
	}

		

}
