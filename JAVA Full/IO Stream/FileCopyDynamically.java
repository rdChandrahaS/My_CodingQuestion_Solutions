import java.io.*;
import java.util.*;
class FileCopyDynamically{
    public static void main(String[] args) throws FileNotFoundException,IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter source file name : ");
        String source = sc.nextLine();
        System.out.print("Enter destination file name : ");
        String destination = sc.nextLine();
        FileInputStream flc_source = new FileInputStream(source);
        FileOutputStream flc_destination = new FileOutputStream(destination);
        int data;
        while((data=flc_source.read()) != -1)flc_destination.write(data);
        flc_destination.close();
        flc_source.close();
        System.out.println("Done");
    }
}