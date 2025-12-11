package Model;

import java.util.List;

import File_handler.File_Manager;

public class Tester {
    static void main(String[] args) {

        Patients linda = new Patients("P006","Linda", "Miller", "Linda.miller@email.com",
                "079494351", "P006",  'F',
                "27/04/1978", "987 Cedar Grove, Birmingham", "6789012345",
                "B4 6FF", "Mark Miller","074959592", "2020-12-01",
        "S002");

        System.out.println(linda.phoneNumber);

        List<String[]> patientData = File_Manager.readFile("data/staff.csv");

        for (String[] line : patientData) { // get the line
            for (String element : line) { // get the nested element
                System.out.println("element line: " + element + "\n");
            }
        }


    }
}