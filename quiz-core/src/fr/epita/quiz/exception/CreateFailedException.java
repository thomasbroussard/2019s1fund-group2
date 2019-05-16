package fr.epita.quiz.exception;

public class CreateFailedException extends Exception{
	
	public Object getInstance() {
		return instance;
	}

	private Object instance;
	
	
	public CreateFailedException(Object beanThatWasNotCreated) {
		this.instance = beanThatWasNotCreated;
	}
	
	public CreateFailedException(Object beanThatWasNotCreated, Exception initialCause) {
		this.instance = beanThatWasNotCreated;
		this.initCause(initialCause);
	}

}
