import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {
        // Criando ServerSocket que irá aguardar conexão na porta=12345
        try (ServerSocket server = new ServerSocket(12345)) {
            System.out.println("Server awaiting connection...");

            Socket socket = server.accept(); // Espera até que um Client se conecte
            System.out.println("Client connected!");
            
            /*
             * BufferedReader: permite ler os texto linha por linha recebidos pelo Client
             * InputStreamReader: converte os bytes recebidos em texto.
             * socket.getInputStream(): canal por onde chegam os dados enviados pelo cliente.
             */
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            /*
             * PrintWriter: facilita escrever texto em formato de String.
             * socket.getOutputStream(): canal usado para mandar dados de volta ao cliente.
             * true: envia o texto imediatamente, sem esperar acumular no buffer.
             */
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            String message;
            while ((message = input.readLine()) != null) {
                if ("sair".equalsIgnoreCase(message)) {
                    System.out.println("Client closed the connection.");
                    break;
                }

                System.out.println("Message received:" + message);
                output.println("Message received: " + message);
            }
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
