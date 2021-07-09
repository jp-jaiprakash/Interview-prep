package lowleveldesigns.filereadingthreads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadFilesThread1 implements Runnable{


   private File file;
   private int noOfFiles;
   private int nextFile = -1;
   private ArrayList<String> lstOfFiles = new ArrayList<>();
   private ExecutorService executorService;

   public ReadFilesThread1(File file){
      this.file = file;
   }

   private String readFileToString(String fileAddress){
      FileInputStream stream = null;
      MappedByteBuffer bb;
      String stringFromFile ="";
      try{
         stream = new FileInputStream(new File(fileAddress));
         FileChannel fc = stream.getChannel();
         bb = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());

         stringFromFile = Charset.defaultCharset().decode(bb).toString();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }finally {
         try{
            stream.close();

         } catch (IOException e) {
            e.printStackTrace();
         }
      }

      return stringFromFile;
   }

   private void toFile(String message, String fileName){
      try{
         FileWriter fis = new FileWriter("/Users/jprakas/Desktop/morgan/test1"+fileName);
         BufferedWriter out = new BufferedWriter(fis);
         out.write(message);
         out.close();

      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

   public void getAllFilesInArrayList(final File fileOrFolder){
      String temp = "";

      if(fileOrFolder.isDirectory()){
         for(final File fileEntry: fileOrFolder.listFiles()){
            if(fileEntry.isFile()){
               temp = fileEntry.getAbsolutePath();
               lstOfFiles.add(temp);
            }
         }
      }

      if(fileOrFolder.isFile()){
         temp = fileOrFolder.getAbsolutePath();
         lstOfFiles.add(temp);
      }

   }

   public synchronized String getNextFile(){
      nextFile++;
      if(nextFile < lstOfFiles.size()){
         return lstOfFiles.get(nextFile);
      }else
         return null;
   }

   @Override
   public void run() {
      getAllFilesInArrayList(file);
      executorService = Executors.newFixedThreadPool(lstOfFiles.size());
      while (nextFile < lstOfFiles.size()){
         String tempGetFile = getNextFile();
         File tempFile = new File(lstOfFiles.get(nextFile));
         toFile(readFileToString(tempFile.getAbsolutePath()), "Copy".concat(tempFile.getName()));

      }
   }
}
