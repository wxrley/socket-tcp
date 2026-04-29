import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        // Criando um Socket que tenta se conectar no Server na porta=12345
        try (Socket socket = new Socket("localhost", 12345)) {
            /*
             * PrintWriter: objeto para enviar texto de forma simples ao servidor.
             * socket.getOutputStream(): canal por onde os dados são enviados ao servidor.
             * true: envia o texto imediatamente, sem esperar acumular no buffer.
             */
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            /*
             * BufferedReader: Permite ler textos de forma fácil, inclusive linha por linha.
             * socket.getInputStream(): Canal por onde chegam os dados enviados pelo servidor.
             * InputStreamReader: Converte os bytes recebidos em caracteres (texto) para podermos ler.
             */
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Scanner scanner = new Scanner(System.in);
            
            String message;
            while (true) {
                System.out.print("Enter a message (or 'exit' to quit): ");
                message = scanner.nextLine();
                output.println(message);

                if ("exit".equalsIgnoreCase(message)) {
                    break;
                }

                String response = input.readLine();
                System.out.println("Response: " + response);
            }
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
