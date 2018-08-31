package com.capgemini.Day2.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testcheckpalindrome() {
		assertEquals(true,Palindrome.checkPalindrome(121));
		assertEquals(true,Palindrome.checkPalindrome(363));
		assertEquals(false,Palindrome.checkPalindrome(-121));
		assertEquals(false,Palindrome.checkPalindrome(0023));
	}

}
