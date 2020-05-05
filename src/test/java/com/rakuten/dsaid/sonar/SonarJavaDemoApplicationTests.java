package com.rakuten.dsaid.sonar;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SonarJavaDemoApplicationTests {

	@Test
	void testHello() {
		Assert.isTrue(
				SonarJavaDemoApplication.getHelloString().equals("hello soarn java"),
				"shoud be the same");
	}

}
