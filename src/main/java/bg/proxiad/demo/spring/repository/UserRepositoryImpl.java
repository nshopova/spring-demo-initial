package bg.proxiad.demo.spring.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bg.proxiad.demo.spring.model.Student;

public class UserRepositoryImpl implements UserRepository {
	
	@Override
	public Collection<Student> findAllStudents() {
		Student student1 = new Student();
		student1.setName("Мария");
		student1.setAssesment(6.0);
		student1.setCourseProject(true);
		
		Student student2 = new Student();
		student2.setName("Иван");
		student2.setAssesment(5.50);
		student2.setCourseProject(false);
		
		Student student3 = new Student();
		student3.setName("Георги");
		
		List<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		return students;
	}
}
