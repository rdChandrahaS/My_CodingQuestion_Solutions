//import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
class BufferInJava{
    public static void main(String[] args) /**throws IOException*/ {
        try{
            //Taking Input from keyboard
            InputStreamReader IPSR = new InputStreamReader(System.in);
            BufferedReader BufferedReaderInputKeyboard = new BufferedReader(IPSR);

            String str = BufferedReaderInputKeyboard.readLine();
            BufferedReaderInputKeyboard.close();

            System.out.println(str+"    Hi");

            //Taking Input from a txt File
            FileReader FRD = new FileReader("Source_FC_Dynamic.txt");
            BufferedReader BufferedReaderInputFile = new BufferedReader(FRD);
            String st;
            while((st=BufferedReaderInputFile.readLine()) != null)System.out.println(st);


            //Writing to a file
            FileWriter FW = new FileWriter("BuffereInJava.txt");
            BufferedWriter writer = new BufferedWriter(FW);
            writer.write("Hi I am Rajdeep. I Love Titli\n");
            writer.write("She may not be my first Love, but I loved her after I realised whats love\n");
            writer.write("I first loved a girl when i was in class 4, it was affecton not love. Titli will always be my love");
            writer.close(); // without close method, the file wont save
        }catch(IOException e){
            System.out.println("Exception Caught");
        }

    }
}