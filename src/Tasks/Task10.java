package Tasks;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task10 {
    public static void main(String[] args) throws IOException {

        File csvFile = new File("C:\\Workspace For Java\\Level 1\\Hello\\src\\Tasks\\Filename");
        FileWriter fileWriter = new FileWriter(csvFile);
        String[][] students ={
                {"barış","köseoğlu"},
                {"ahmet","yıldız"},
                {"ecem","çalışkan"},
                {"ayşe","köse"},
                {"yasemin","yaşar"},
                {"kemal","ulu"},
        };
        for (String[] data : students) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < data.length; i++) {
                line.append("\"");
                line.append(data[i].replaceAll("\"","\"\""));
                line.append("\"");
                if (i != data.length - 1) {
                    line.append(',');
                }
            }
            line.append("\n");
            fileWriter.write(line.toString());
        }
        fileWriter.close();
    }
}
