package cipherTdd.com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class decryptTest {

	@Test
	void test() {
		Cipher test2 =  new Cipher();
		String out= test2.decrypt("ASHIK",-243);
		assertEquals(out, "UNDEF");
	}

}
