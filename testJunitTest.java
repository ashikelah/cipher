package cipherTdd.com.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class testJunitTest {

	@Test
	public void test() {
		Cipher test1 = new Cipher();
		String out = Cipher.encrypt("ASHIK", 0);
		assertEquals(out,"ASHIK");
		
	}

}
