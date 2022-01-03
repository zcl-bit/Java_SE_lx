package server;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: zcl
 * @create: 2022/1/3 9:56
 */
public class LoginServer2 {
    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(100);
        while(true){
            Socket socket = serverSocket.accept();
            LoginThread loginThread = new LoginThread(socket);
            new Thread(loginThread).start();
        }
//        serverSocket.close();
    }
}
