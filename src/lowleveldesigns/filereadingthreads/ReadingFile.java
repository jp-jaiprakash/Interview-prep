package lowleveldesigns.filereadingthreads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

   static void readFiles(String dirPath) throws FileNotFoundException {
      File fileDir = new File(dirPath);

      File fileLst[] = fileDir.listFiles();

      for(File file: fileLst){
         System.out.println(file.getName());
         FileInputStream fis = new FileInputStream(file);
         Scanner sc = new Scanner(fis);
         while (sc.hasNext()){
            System.out.println(sc.nextLine());
         }
         System.out.println("******************");
      }

   }

   public static void main(String[] args) throws FileNotFoundException {
      readFiles("/Users/jprakas/Desktop/morgan/test");
   }
}
