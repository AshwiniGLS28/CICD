package com.cicdDemo.cicdDemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void applicationContextTest() {
		CicdDemoApplication.main(new String[] {});
	}

}
