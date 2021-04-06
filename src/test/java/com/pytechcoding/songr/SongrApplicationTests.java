package com.pytechcoding.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test public void testConstructorCreation(){
		String imgUrl = "https://www.rollingstone.com/wp-content/uploads/2020/09/R1344-467" +
				"-Maxwell-Black-Summers-Night.jpg?w=1000";
		Album test = new Album("BLACKsummers’night","Maxwell",imgUrl,16,255);
		String expected = "BLACKsummers’night";
		String actual = test.getTitle();
		Assert.isTrue(expected.equals(actual),"Should create a new album");
	}
}
