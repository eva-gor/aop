package evagor.bl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.annotation.*;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@EnableSpringConfigured
@EnableAspectJAutoProxy
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
		
		MyService service = new MyService();
	      service.doSomething();
	}


}
