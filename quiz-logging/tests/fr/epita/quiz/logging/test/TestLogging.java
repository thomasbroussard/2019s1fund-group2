package fr.epita.quiz.logging.test;

import fr.epita.quiz.logging.QuizLogger;

public class TestLogging {
	
	
	public static void main(String[] args) {
		
		//given that QuizLogger initialization
		QuizLogger instanceUnderTest = new QuizLogger("TestLogging");
		
		//when I try to output that message
		instanceUnderTest.logInfo("this is a test message");
		//we would like something like "${date} ${class} - [${level}] --- ${message}"
		//should output "${date} TestLogging - [INFO] --- this is a test message"
		
		//then ?
		
	}

}
