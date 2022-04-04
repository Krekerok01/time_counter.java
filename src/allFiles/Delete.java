package allFiles;

import java.io.*;

public class Delete {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/resultFile"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/source"))){

            String s = reader.readLine().substring(0,49);
            while (s != null){
                writer.write(s);
                writer.write("\n");
                s = reader.readLine().substring(0,49);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
