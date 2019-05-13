package fr.epita.bank.datamodel;

public enum ContactType {
	
	MOBILE("mobile phone"),
	HOME("home number"),
	WORK("work");
	
	private String description;
	
	private ContactType(String label){
		this.description = label;
	}

	public String getDescription() {
		return description;
	}
	
	
	
	
	
}
