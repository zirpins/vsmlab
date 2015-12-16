package de.hska.iwi.vslab.usrv;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import de.hska.iwi.vsys.microlab.UserSrvApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UserSrvApplication.class)
@WebAppConfiguration
public class UserSrvApplicationTests {

	@Test
	public void contextLoads() {
	}

}
