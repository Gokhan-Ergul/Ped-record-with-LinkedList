package assignment1;

import java.util.Scanner;

public class MyLinkedL {
	MyNode head;
	MyNode end;
	public MyLinkedL() {
		head = null;
		end = null;
	}
	public void addPetRecord(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Pet ID: ");
		int petId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Pet Name: ");
        String petName = scanner.nextLine();
        System.out.print("Enter Pet Type: ");
        String petType = scanner.nextLine();
        System.out.print("Enter Birth Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();
        addtoHead(weight);
        addtoHead(birthYear);
        addtoHead(petType);
        addtoHead(petName);
		addtoHead(petId);
		System.out.println("Your animal registration has been successful.");
		System.out.println("");
	}
	public void addrecordtoEnd(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Pet ID: ");
		int petId = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter Pet Name: ");
        String petName = scanner.nextLine();
        System.out.print("Enter Pet Type: ");
        String petType = scanner.nextLine();
        System.out.print("Enter Birth Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Enter Weight: ");
        double weight = scanner.nextDouble();
        addtoEnd(petId);
        addtoEnd(petName);
        addtoEnd(petType);
        addtoEnd(birthYear);
        addtoEnd(weight);
		
		System.out.println("Your animal registration has been successful to End of the list.");
		System.out.println("");
	}
	
	public void addtoEnd(Object input) {
		MyNode newnode = new MyNode(input); 
		if(isfull()) {
			// if the list full
			end.nextNode = newnode;
			end = newnode;
		}
		else {
			// if the list not full
			head = newnode;
			end = newnode;
		}
		
	}
	public void addRecordtoMidle(int index) {
		if(isfull()) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter Pet ID: ");
			int petId = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter Pet Name: ");
	        String petName = scanner.nextLine();
	        System.out.print("Enter Pet Type: ");
	        String petType = scanner.nextLine();
	        System.out.print("Enter Birth Year: ");
	        int birthYear = scanner.nextInt();
	        System.out.print("Enter Weight: ");
	        double weight = scanner.nextDouble();
	        addtomiddle(weight,index);
	        addtomiddle(birthYear,index);
	        addtomiddle(petType,index);
	        addtomiddle(petName,index);
	        addtomiddle(petId,index);
		}
		else {
			// if the list not full
			System.out.println("Please add pets to the list before selecting this option");
		}
		
	}
	public void addtomiddle(Object input,int index2) {
			MyNode newnode = new MyNode(input); 
			MyNode temp1 = head;
	        MyNode temp2 = null;
			if(isfull()) {
				// if the list full
				 for(int i=1;i<index2*5;i++) {
			        	temp1 = temp1.nextNode;
			        }
			        temp2 = temp1.nextNode;
			        temp1.nextNode = null;
			        temp1.nextNode = newnode;
			        newnode.nextNode = temp2;
			}
	}
	
	
	
	public void addtoHead(Object input) {
		MyNode newnode = new MyNode(input); 
		if(isfull()) {
			// if the list full
			newnode.nextNode = head; 
			head = newnode;
		}
		else {
			// if the list not full
			head = newnode;
			end = newnode;
		}
	}
	public void deleteFromHeat(){ 
		if(isfull()) {
			 for(int i=0;i<5;i++){
				MyNode temp = head.nextNode;
				head.nextNode = null;
				head = temp;
			 }
			 System.out.println("Pet record removed successfully.");
		}
	}
	
	public void deleteFromEnd() {
		if(isfull()) {
			if(head == end) {
				head = null;
				end = null;
			} else {
				MyNode temp1 = null;
				MyNode temp2 = head;
				while(temp2 != end ) { 
					temp1 = temp2;
					temp2 = temp2.nextNode;

				}
					if(temp2 == end) {
						temp1.nextNode = null;
						end = temp1;
						
					}
			}
		}
	}
		
	public void print() {
		int counter = 0;
		MyNode temp = head;
		while(temp != null) {
			System.out.println("The Pet Id:"+temp.input);
			temp = temp.nextNode;
			System.out.println("The Pet Name:"+temp.input);
			temp = temp.nextNode;
			System.out.println("The Pet Type:"+temp.input);
			temp = temp.nextNode;
			System.out.println("The Pet Birth Year:"+temp.input);
			temp = temp.nextNode;
			System.out.println("The Pet Weight:"+temp.input);
			System.out.println("");
			temp = temp.nextNode;
			
		}
		System.out.println("");
	}
	
	public void addtoindis(Object input, int index) {
		MyNode newnode = new MyNode(input); 
		if(isfull()) {
			if(index == 0) {
				newnode.nextNode = head;
				head = newnode;
			} else {
				MyNode temp = null;
				MyNode temp2 = head;
				int myindex = 0;
				while(temp2 != null && myindex < index) { 
					temp = temp2;
					temp2 = temp2.nextNode;
					myindex++;
				}
					if(temp2 == null) {
						end.nextNode = newnode;
						end = newnode;
					} else {
						
						temp.nextNode = newnode;
						newnode.nextNode = temp2;
					}
			}
		}
		else {
			// if the list not full
			head = newnode;
			end = newnode;
		} 
	}
	
	public void deleteFromIndex(int index) {
		if(isfull()) {
			if(end == head) {
				end = null;
				head = null;
			} else {
				if(index == 0) {
					deleteFromHeat(); 
				}
				else {
					MyNode temp1 = null;
					MyNode temp2 = head;
					int myindex = 0;
					while(temp2!=null && myindex<index) {
						temp1 = temp2;
						temp2 = temp2.nextNode;
						myindex++;
					}
					if(temp2!=null) {
						if(temp2==end) {
							end =temp1;
							temp1.nextNode = null;
							
						}
						else {
							MyNode temp3 =null;
							temp3 = temp2.nextNode;
							temp2.nextNode = null;
							temp1.nextNode = temp3;
							
						}
					}
				}
			}
		}
	}
	public void findAndDelete(Object input ) {

		if(isfull()) {
			
					if(head.input == input) {
					deleteFromHeat();
					}
					else {
						MyNode temp1 = null;
						MyNode temp2 = head;
						
						while(temp2 != null && temp2.input != input) {
							temp1 = temp2;
							temp2 = temp2.nextNode;
							
						}
						if(temp2!=null) {
							if(temp2==end) {
								end =temp1;
								temp1.nextNode = null;
								
							}
							else {
								MyNode temp3 =null;
								temp3 = temp2.nextNode;
								temp2 = temp3.nextNode;
								temp3 = temp2.nextNode;
								temp2 = temp3.nextNode;
								temp3 = temp2.nextNode;
								temp2.nextNode = null;
								temp1.nextNode = temp3;
								System.out.println("Pet record removed successfully.");
								
							}
						} else {
							System.out.println("No ped found with this ID");
						}
						
					}	
			}

		}
	
	
	
	
	public boolean isfull() {
		if(head!=null)
			return true;
		else
			return false;
	}
	
}
