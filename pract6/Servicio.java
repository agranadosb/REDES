import java.lang.Thread;
import java.util.*;

public class Servicio extends Thread {
    Socket cliente;
    String s = "";
    public Servicio(Socket ss) {
        this.cliente = ss;
    }

    public void run() {
        try{
            while(!s.equals("FIN")){
                Scanner recibe=new Scanner(cliente.getInputStream());
                String s = recibe.nextLine();

                PrintWriter envia=new PrintWriter(cliente.getOutputStream());
                envia.println(s);
                envia.flush();
                s.close();
            }
        }
        catch(IOException e) { System.out.println(e); }
    } 
}
