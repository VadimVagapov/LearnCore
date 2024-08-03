package vagapov.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaCoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(JavaCoreApplication.class, args);
    }

    @Bean("RestTemplate")
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
