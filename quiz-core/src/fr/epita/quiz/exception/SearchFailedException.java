package fr.epita.quiz.exception;

public class SearchFailedException extends Exception {
	public Object getInstance() {
		return instance;
	}

	private Object instance;
	
	
	public SearchFailedException(Object badInput) {
		this.instance = badInput;
	}
	
	public SearchFailedException(Object badInput, Exception initialCause) {
		this.instance = badInput;
		this.initCause(initialCause);
	}
	
	
	
}
