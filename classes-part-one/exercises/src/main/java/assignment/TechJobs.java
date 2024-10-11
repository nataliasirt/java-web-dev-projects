package assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TechJobs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the Tech Jobs App!");

        while (true) {
            System.out.println("\n1 - List Employers");
            System.out.println("2 - List Locations");
            System.out.println("3 - Search by Employer");
            System.out.println("4 - Search by Position Type");
            System.out.println("5 - Exit");

            System.out.print("\nEnter your choice: ");
            int choice = in.nextInt();
            in.nextLine();  // Consume newline

            if (choice == 5) {
                break;  // Exit the loop
            }

            switch (choice) {
                case 1:
                    ArrayList<String> employers = JobData.findAll("employer");
                    System.out.println("\nAll Employers:");
                    for (String employer : employers) {
                        System.out.println(employer);
                    }
                    break;

                case 2:
                    ArrayList<String> locations = JobData.findAll("location");
                    System.out.println("\nAll Locations:");
                    for (String location : locations) {
                        System.out.println(location);
                    }
                    break;

                case 3:
                    System.out.print("\nEnter employer to search: ");
                    String employer = in.nextLine();
                    ArrayList<HashMap<String, String>> jobsByEmployer = JobData.findByColumnAndValue("employer", employer);
                    printJobs(jobsByEmployer);
                    break;

                case 4:
                    System.out.print("\nEnter position type to search: ");
                    String positionType = in.nextLine();
                    ArrayList<HashMap<String, String>> jobsByPosition = JobData.findByColumnAndValue("position type", positionType);
                    printJobs(jobsByPosition);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        in.close();
    }

    // Helper method to print job information
    private static void printJobs(ArrayList<HashMap<String, String>> jobs) {
        if (jobs.isEmpty()) {
            System.out.println("No results found.");
        } else {
            for (HashMap<String, String> job : jobs) {
                System.out.println("\nJob Details:");
                for (String key : job.keySet()) {
                    System.out.println(key + ": " + job.get(key));
                }
                System.out.println("************");
            }
        }
    }
}