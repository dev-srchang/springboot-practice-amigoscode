package inc.src.demo;

import inc.src.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
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

	@GetMapping(path = "/student")
	public List<Student> getTestStudent() {
		return List.of(new Student(1L, "srchang", "srchang@gmail.com", LocalDate.of(1975, Month.MAY, 22), 46));
	}
}
