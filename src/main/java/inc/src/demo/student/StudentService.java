package inc.src.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L, "srchang", "srchang@gmail.com", LocalDate.of(1975, Month.MAY, 22), 46));
    }
}
