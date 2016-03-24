package de.hska.iwi.vslab;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringRestDemoApplication.class)
@WebAppConfiguration
public class SpringRestDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
