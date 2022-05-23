import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class client {
    public static void main(String[] args) {
        try(Socket socket = new Socket("127.0.0.1",8000) ){

                try (
                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                ){
                    System.out.println("Connected");
                    String request = "hi";
                    writer.write(request);
                    writer.newLine();
                    writer.flush();

                    String response = reader.readLine();
                    System.out.println(response);
                }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
