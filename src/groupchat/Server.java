
package groupchat;

import java.net.*;
import java.io.*;
import java.util.*;
import java.util.HashMap;

public class Server implements Runnable {

    Socket socket;

    public static Vector client = new Vector();

    public Server(Socket socket) {
        try {
            this.socket = socket;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

            client.add(writer);

            while (true) {
                String data = reader.readLine().trim();
                System.out.println("Received " + data);
                
                for (int i = 0; i < client.size(); i++) {
                    try {
                        BufferedWriter bw = (BufferedWriter) client.get(i);
                        bw.write(data);
                        bw.write("\r\n");
                        bw.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initiateSocket() {
        try {
            ServerSocket s = new ServerSocket(2003);
            while (true) {
                System.out.println("Connection Started");
                Socket socket = s.accept();
                Server server = new Server(socket);
                Thread thread = new Thread(server);
                thread.start();
            }
        } catch (IOException ex) {
            System.out.println("Exception at initiateSocket() of Server.java");
            System.err.println(ex);
        }
    }

//    public static void main(String[] args) throws Exception {
//        ServerSocket s = new ServerSocket(2003);
//        while (true) {
//            System.out.println("Connection done");
//            Socket socket = s.accept();
//            Server server = new Server(socket);
//            Thread thread = new Thread(server);
//            thread.start();
//
//        }
//    }
}
