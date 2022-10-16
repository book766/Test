package Test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String getcurrenttime(){
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        return dateFormat.format(date);
    }

    public static void record(String info) throws IOException {
        File file = new File("log.txt");
        FileWriter fileWriter = new FileWriter(file,true);

        fileWriter.write(info + "\n");
        fileWriter.close();
    }
}
