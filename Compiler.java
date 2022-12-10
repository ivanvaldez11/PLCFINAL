import java.util.*;
import java.io.*;

public class Compiler{
public Compiler(){}

    public String convertFolder(File folder) throws Exception{
      
        String context = "";
        Scanner folderScanner = new Scanner(folder);
        while(folderScanner.hasNext()){
            context = context + " " + folderScanner.nextLine();
        }
        folderScanner.close();
        return context;
    }
}

