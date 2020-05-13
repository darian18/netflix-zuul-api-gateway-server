package dch.com.netflixzuulapigatewayserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootTest
class NetflixZuulApiGatewayServerApplicationTests {

	@Test
	void contextLoads() {
	}

}
