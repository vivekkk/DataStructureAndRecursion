import java.io.FileOutputStream;

public class ReadingFileinJava{

    public static void main (String args[])
    {
        FileOutputStream fos;
        try{
         
     fos=new FileOutputStream("D:\\vivek.txt");
        String name="My Name is Vivek Kaushik";
        byte [] bytearray=new byte[100];
        bytearray=name.getBytes();
        fos.write(bytearray);
        fos.close();
        }

        catch(Exception e){
            System.out.println(e);


        }

    }


}