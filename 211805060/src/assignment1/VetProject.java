package assignment1;

import java.util.Scanner;

public class VetProject {

	public static void main(String[] args) {
		MyLinkedL list = new MyLinkedL();
		Scanner scanner = new Scanner(System.in);
		while (true) {
            System.out.println("**********Veterinarian Records System**********");
            System.out.println("1. Add a new pet record to head");
            System.out.println("2. Add a new pet record to end");
            System.out.println("3. Add a new pet record to middle");
            System.out.println("4. Remove a pet");
            System.out.println("5. Print all pet records");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                	list.addPetRecord();
                    break;
                case 2:
                	list.addrecordtoEnd();
                    break;
                case 3:
                	Scanner scanner2 = new Scanner(System.in);
                	System.out.print("After how many pets do you want to add a new pet:");
                	int index = scanner2.nextInt();
                	if(index == 0) {
        				System.out.println("Please add pets to the list before selecting this option");
                	}
                	list.addRecordtoMidle(index);
                    break;
                case 4:
                	System.out.print("Select a petID to delete the pet:");
                	int selectPet = scanner.nextInt();
                	list.findAndDelete(selectPet);
                    break;
                case 5:
                	list.print();
                	break;
                case 6:
                	System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                	break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
		
	}

}
