package bg.proxiad.demo.spring.repository;

import java.util.Collection;

import bg.proxiad.demo.spring.model.Student;

public interface UserRepository {
	Collection<Student> findAllStudents();
}
