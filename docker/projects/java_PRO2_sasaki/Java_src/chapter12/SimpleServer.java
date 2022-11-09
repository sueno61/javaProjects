import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.IOException;

class SimpleServer {
  public static void main(String[] args) {
    System.out.println("クライアントの接続を待っています");
    try (ServerSocket server = new ServerSocket(49152);
        Socket client = server.accept();
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);) {
      System.out.println("クライアントが接続しました");
      out.println("Hello, client!");
      out.println("Good bye!");
      client.close();
    } catch (IOException e) {
      System.err.println("エラーが発生しました: " + e);
    }
  }
}
