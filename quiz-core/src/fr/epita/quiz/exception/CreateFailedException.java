package fr.epita.quiz.exception;

public class CreateFailedException extends DataAccessException{
	
	public Object getInstance() {
		return instance;
	}

	private Object instance;
	
	
	public CreateFailedException(Object beanThatWasNotCreated) {
		super(beanThatWasNotCreated);
	}
	
	public CreateFailedException(Object beanThatWasNotCreated, Exception initialCause) {
		super(beanThatWasNotCreated, initialCause);
	}

}
