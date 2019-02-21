import java.util.*;

public class ServidorConcurrente {

    public static void main(String[] args) throws UnknownHostException, IOException {
        int puerto = 7777;
        
        while (true) {
            ServerSocket servidor = new ServerSocket(puerto);

            Socket cliente = servidor.accept();

            puerto++;

            Servicio Cl = new Servicio(cliente);

            Cl.start();
        }
    }
}