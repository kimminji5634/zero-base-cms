package zero.base.cms.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableFeignClients
@SpringBootApplication
@EnableJpaAuditing /*test할 때 날짜 제대로 잘 들어가도록*/
@EnableJpaRepositories
public class CmsApplication {


	public static void main(String[] args) {
		SpringApplication.run(CmsApplication.class, args);
	}
}
