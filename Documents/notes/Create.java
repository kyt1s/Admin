import java.io.*;
class Create
{
   public void Createfile(String FileName)
   {
         try
         {
            FileOutputStream f=new FileOutputStream(FileName+".txt") //create new file
            f.write('B');
            f.close();
         }
         catch(IOException e){}
   }  
}