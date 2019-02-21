import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteDayTime {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("ntp.upv.es", 13);
        Scanner lee = new Scanner(s.getInputStream());
        System.out.println(lee.nextLine());
        s.close();
        lee.close();
    }
}
