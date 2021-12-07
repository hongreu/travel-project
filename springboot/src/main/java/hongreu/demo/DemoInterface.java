package hongreu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//(exclude = {SecurityAutoConfiguration.class })
public class DemoInterface {
	public static void main(String args[]) {
		SpringApplication.run(DemoInterface.class, args);
	}
}
