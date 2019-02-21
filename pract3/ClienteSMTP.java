import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteSMTP {
    public static void main(String[] args) throws IOException {
	System.setProperty("line.separator", "\r\n");
        Socket s = new Socket("smtp.upv.es", 25);
	Scanner lee = new Scanner(s.getInputStream());
	PrintWriter write = new PrintWriter(s.getOutputStream(), true);

        write.println("HELO rdc06.redes.upv.es");
        System.out.println(lee.nextLine());
        s.close();
        lee.close();
	write.close();
    }
}
