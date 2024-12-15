package myProj.exception;

@SuppressWarnings("serial")
public class StudentIdNotFoundException extends RuntimeException{

	public StudentIdNotFoundException(String message) {
		super(message);
	}
}
