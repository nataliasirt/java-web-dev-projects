package assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class JobData {

    // Path to the CSV file containing the job data
    private static final String DATA_FILE = "C:\\Users\\nsirt\\IdeaProjects\\LAUNCHCODE\\classes-part-one\\exercises\\src\\main\\java\\assignment\\job_data.csv";

    // This ArrayList will store each job as a HashMap
    private static ArrayList<HashMap<String, String>> allJobs = new ArrayList<>();

    // Boolean flag to indicate whether the data is loaded
    private static boolean isDataLoaded = false;

    // Method to load the CSV data into allJobs
    public static void loadData() {
        // Only load the data once
        if (isDataLoaded) {
            return;
        }

        // Try to open the file and read its contents
        try (BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            System.out.println("Loading data...");
            String line = reader.readLine();  // Reading the first line (header)
            String[] headers = line.split(",");  // Splitting headers into an array
            System.out.println("Headers: " + Arrays.toString(headers));

            // Reading the file line by line
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");  // Splitting each line by commas
                HashMap<String, String> job = new HashMap<>();

                // Populating the job HashMap with key-value pairs from the headers and data
                for (int i = 0; i < headers.length; i++) {
                    job.put(headers[i], data[i]);
                }

                // Adding each job to the allJobs list
                allJobs.add(job);
                System.out.println("Loaded job: " + job);
            }
            isDataLoaded = true;  // Mark data as loaded
            System.out.println("Data loading completed!");

        } catch (IOException e) {
            System.out.println("Error loading the file: " + e.getMessage());

        }
    }

    // Method to find all jobs or specific values from a given field (column)
    public static ArrayList<String> findAll(String field) {
        loadData();  // Ensure the data is loaded
        ArrayList<String> values = new ArrayList<>();

        // Loop through each job and add unique field values to the list
        for (HashMap<String, String> job : allJobs) {
            String value = job.get(field);
            if (!values.contains(value)) {
                values.add(value);
            }
        }

        // Sort the values alphabetically
        Collections.sort(values);
        return values;
    }

    // Method to find jobs by a specific column and value
    public static ArrayList<HashMap<String, String>> findByColumnAndValue(String column, String value) {
        loadData();  // Ensure the data is loaded
        ArrayList<HashMap<String, String>> jobs = new ArrayList<>();

        // Loop through each job and check if the value in the specified column matches
        for (HashMap<String, String> job : allJobs) {
            String jobValue = job.get(column);
            if (jobValue.toLowerCase().contains(value.toLowerCase())) {
                jobs.add(job);
            }
        }

        return jobs;
    }

    // Method to return all jobs (returning a copy of the job list)
    public static ArrayList<HashMap<String, String>> findAllJobs() {
        loadData();  // Ensure the data is loaded
        return new ArrayList<>(allJobs);  // Return a copy of the list
    }
}