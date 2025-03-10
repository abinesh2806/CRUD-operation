package myProj.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import myProj.entity.Student;
import myProj.exception.StudentIdNotFoundException;
import myProj.service.StudentService;

public class StudentServiceimplementation implements StudentService {

	private Map<Integer, Student> students = new HashMap<>();

	@Override
	public void addStudent(Student student) {
		if (students.containsKey(student.getId())) {
			throw new StudentIdNotFoundException("Student with ID " + student.getId() + " already exists.");
		}
		students.put(student.getId(), student);
		System.out.println("Student added successfully: " + student.getId());

	}

	@Override
	public Student getStudent(int id) {
		if (!students.containsKey(id)) {
			throw new StudentIdNotFoundException("No student found with ID: " + id);
		}
		return students.get(id);
	}

	@Override
	public void updateStudent(int id, String newName, int newAge, long newPhone, String newEmail) {
		if (!students.containsKey(id)) {
			throw new StudentIdNotFoundException("No student found with ID: " + id);
		}
		Student student = students.get(id);
		student.setName(newName);
		student.setAge(newAge);
		student.setPhone(newPhone);
		student.setEmail(newEmail);
		System.out.println("Student updated successfully: " + student);

	}

	@Override
	public void deleteStudent(int id) {
		if (!students.containsKey(id)) {
			throw new StudentIdNotFoundException("No student found with ID: " + id);
		}
		students.remove(id);
		System.out.println("Student with ID " + id + " deleted successfully.");

	}

	@Override
	public void displayAllStudents() {
		if (students.isEmpty()) {
			System.out.println("No students available.");
			return;
		}
		for (Student student : students.values()) {
			System.out.println(student);
		}

	}

}
