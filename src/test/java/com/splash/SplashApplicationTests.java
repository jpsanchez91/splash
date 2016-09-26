package com.splash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SplashApplicationTests {
	
	 @Autowired
	    private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
		String body = this.restTemplate.getForObject("/", String.class);
		String bodyemail = this.restTemplate.getForObject("/email", String.class);
		String bodyresposta = this.restTemplate.getForObject("/resposta", String.class);
	}

}
