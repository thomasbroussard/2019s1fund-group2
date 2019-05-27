package fr.epita.quiz.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestDatabase {

	public static void main(String[] args) throws SQLException {
		
		/* Operations we would like to test : 
		create table QUIZ(id bigint auto_increment, name varchar(255));

		select ID, NAME from QUIZ

		insert into QUIZ (name) values ('Test Quiz')*/
		
		
		Connection connection = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		String schema = connection.getSchema();
		System.out.println(schema);
		
		
		String query = "select ID, NAME from QUIZ";
		
		PreparedStatement pstmt = connection.prepareStatement(query);
		
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("ID");
			String topic = rs.getString("NAME");
			System.out.println("id : " + id + " topic:" +  topic);
		}
		
		pstmt.close();
		rs.close();
		connection.close();
		
		

	}

}
