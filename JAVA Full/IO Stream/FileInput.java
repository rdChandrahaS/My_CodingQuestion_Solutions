import java.io.*;
class FileInput{
    public static void main(String[] args)throws FileNotFoundException,IOException {
        FileInputStream flip = new FileInputStream("FileStreamInput.txt");
        //read in file
        int data;
        //while((data=flip.read()) != -1)System.out.print((char)data);

        // Write data in file
        FileOutputStream flop = new FileOutputStream("FileStreamOutput.txt");
        while((data=flip.read()) != -1)flop.write(data);
        
    }
}