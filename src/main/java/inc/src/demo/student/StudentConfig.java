package inc.src.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student srchang = new Student("srchang", "srchang@gmail.com", LocalDate.of(1975, Month.MAY, 22));
            Student ejpark = new Student("ejpak", "glam0730@gmail.com", LocalDate.of(1978, Month.JULY, 30));

            studentRepository.saveAll(List.of(srchang, ejpark));
        };
    }
}
