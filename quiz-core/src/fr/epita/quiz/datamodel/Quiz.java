package fr.epita.quiz.datamodel;

public class Quiz {



	private String title;

	public Quiz(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Quiz [title=" + title + "]";
	}
}
