package assignment1;

public class MyNode {
	int petId;
	String petName;
	String petType;
	int petBirthYear;
	double weight;
	MyNode nextNode;
	Object input;
	public MyNode(Object input) {
		this.input = input;
		this.nextNode = null;
		
	}
	
	
}
