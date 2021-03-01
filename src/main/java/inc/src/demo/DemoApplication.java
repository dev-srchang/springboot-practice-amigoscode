package inc.src.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public String getHelloWolrd() {
		return "Hello World";
	}

	@GetMapping(path = "/list")
	public List<String> getHiWorldList() {
		return List.of("Hi", "World", "List");
	}
}
