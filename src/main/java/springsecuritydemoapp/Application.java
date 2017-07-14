package springsecuritydemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import properties.RoleProperties;

@SpringBootApplication
@EnableConfigurationProperties(RoleProperties.class)
public class Application{

    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
   
}