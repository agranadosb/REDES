import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteHTTP {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("www.upv.es", 80);
	Scanner lee = new Scanner(s.getInputStream());
	PrintWriter write = new PrintWriter(s.getOutputStream(), true);
	write.printf("GET / HTTP/1.0\r\n\r\n");
	while (lee.hasNext()) {
		System.out.println(lee.nextLine());
	}
        s.close();
        lee.close();
	write.close();
    }
}
