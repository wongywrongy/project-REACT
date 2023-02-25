import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Main {

    public static void createFile(String name) {
        try {
            File file = new File(name + ".txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter("all_files.txt", true);
            writer.write(name + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Wizlet! An everyday tool to help you study!\n");
        System.out.println("Would you like to:\n(1) Create a new study set\n(2) Edit an existing one\n(3) Use an existing study set\n");


        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        switch(first) {
            case 1:
                int count = 0;
                boolean sentinel = true;
                while (true) {
                    System.out.print("Enter name of the study set: ");

                    String name = scan.next();
                    System.out.println();
                    createFile(name); // creates the new study set
                    count++;

                    System.out.println("Would you like to create another one (y/n)? ");
                    String ans = scan.next();
                    ans = ans.toUpperCase();
                    if (ans.equals("N")) {
                        break;
                    }
                }

                System.out.println(count + " study set(s) created!");
                break;
            case 2: // access one in the list
                System.out.print("Which study set would you like to edit: ");

                break;
            default:
                System.out.println("That is an invalid option :(");
        }


    }
}