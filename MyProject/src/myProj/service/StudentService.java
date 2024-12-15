package myProj.service;

import myProj.entity.Student;

public interface StudentService {

	void addStudent(Student student);
	Student getStudent(int id);
	void updateStudent(int id, String newName, int newAge, long newPhone, String newEmail);
	void deleteStudent(int id);
	void displayAllStudents();
}
