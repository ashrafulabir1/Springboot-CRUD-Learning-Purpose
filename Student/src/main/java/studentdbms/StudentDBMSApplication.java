package studentdbms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import studentdbms.entity.Course;
import studentdbms.entity.Student;
import studentdbms.service.CourseService;
import studentdbms.service.StudentService;

@SpringBootApplication
public class StudentDBMSApplication implements CommandLineRunner
{
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private CourseService courseService;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentDBMSApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Student student = new Student("Aditya");
		studentService.save(student);
		Student student2= new Student("Abir");
		studentService.save(student2);
		Course course = new Course("Spring Boot");
		courseService.save(course);
		Course course2 = new Course("C and C++");
		courseService.save(course2);
		student.addCourse(course); 
		studentService.save(student);
		course.addStudent(student);
		courseService.save(course);
	}

}
