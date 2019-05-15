package fr.epita.quiz.tests;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import fr.epita.quiz.datamodel.Quiz;

public class TestWriteDatamodelInstancesInFile {

	public static void main(String[] args) throws Exception {
		
		//given
		Quiz quiz = new Quiz("Java Fundamentals - 2019 - Final exam");

		
		
		//when ?
		File file = new File("data.txt");
		if (!file.exists()) {
			File parentFile = file.getAbsoluteFile().getParentFile();
			parentFile.mkdirs();
			file.createNewFile();
		}
		
		PrintWriter writer = new PrintWriter(file);
		writer.println(quiz.getTitle());
		writer.flush();
		writer.close();
		
		//then ?
		Scanner scanner = new Scanner(file);
		String readLine = scanner.nextLine();
		scanner.close();
		if (! readLine.equals("Java Fundamentals - 2019 - Final exam")) {
			
			throw new Exception("read value is different from written values");
		}else {
			System.out.println("test success!");
		}
		
	
	}

}
