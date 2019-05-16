package fr.epita.quiz.services.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import fr.epita.quiz.datamodel.Quiz;
import fr.epita.quiz.exception.CreateFailedException;

public class QuizFileDAO {

	
	private File file;

	public QuizFileDAO(File file) {
		this.file = file;
	}
	
	/**
	 * This is the way to save a quiz using that dao
	 * Usage : 
	 * <pre><code> QuizFileDAO dao = ...;
	 * Quiz quiz = new Quiz("test");
	 * try{
	 * 	dao.create(quiz);
	 * }catch(CreateFailedException cfe){
	 * 	System.out.println("this Quiz was not created :" + cfe.getInstance());
	 * }
	 * </code></pre>
	 * @param quiz
	 * @throws CreateFailedException
	 */
	public void create(Quiz quiz) throws CreateFailedException{
		
		try (PrintWriter writer = new PrintWriter(file)) {
			writer.println(quiz.getTitle());
			writer.flush();
			
		} catch (FileNotFoundException e) {
			throw new CreateFailedException(quiz, e);
		}
	
	}

	public void update(Quiz quiz) {

	}

	public void delete(Quiz quiz) {

	}

	public Quiz getById(int id) {
		return null;

	}

	public List<Quiz> search(Quiz quizCriterion) {

		return null;
	}

}
