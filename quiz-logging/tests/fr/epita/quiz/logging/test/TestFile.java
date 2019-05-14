package fr.epita.quiz.logging.test;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) throws IOException {
		
		//given that file
		File file = new File("C:/temp/demo/test.txt");
		
		
		System.out.println(file.getAbsolutePath());
		
		System.out.println(file.getParentFile());
		
		if (!file.exists()) {
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
		
		
		
		//when I write in that file
		PrintWriter writer = new PrintWriter(file);
		writer.write("this is a test");
		writer.flush();
		
		writer.close();
		
		//then I should find this text in it
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		System.out.println("found this in the file : " + line);
		scanner.close();
		
	}

}
