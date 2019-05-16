package fr.epita.quiz.tests;

import java.io.File;

import fr.epita.quiz.datamodel.Quiz;
import fr.epita.quiz.exception.CreateFailedException;
import fr.epita.quiz.services.data.QuizFileDAO;

public class TestQuizFileDAO {
	
	public static void main(String[] args) {
		//given
		QuizFileDAO dao = new QuizFileDAO(new File("/tmp/quizTest.txt"));
		Quiz quiz = new Quiz("Intermediate Quiz for Java and OOP");

		//when
		try {
			dao.create(quiz);
		} catch (CreateFailedException e) {
			System.out.println("this Quiz was not created :" + e.getInstance());
			e.printStackTrace();
		}
		
		//then ?
		
		
	}

}
