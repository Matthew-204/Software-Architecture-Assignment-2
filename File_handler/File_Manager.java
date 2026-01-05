package File_handler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class File_Manager {
    private File_Manager() {}

    public static List<String[]> readFile(String filePath) {
        BufferedReader reader = null;
        List<String[]> data = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                data.add(line.split(",",-1)); //
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static Boolean writeFile(String filePath, String data) {
        BufferedWriter writer = null;

        try {
            //
            writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(data);

            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}