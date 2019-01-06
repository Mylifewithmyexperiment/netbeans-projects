/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverinteraction;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author SHASHI
 * 
 * in server side 
 * create socket with only port no 
 * accept the connection coming from that port
 * now read the msg and display it
 * 
 * 
 */
public class MyServer {
    public static void main(String[] args) throws IOException {
        
        ServerSocket obj1 = new ServerSocket(8040);
        Socket obj = obj1.accept();
        DataInputStream din = new DataInputStream(obj.getInputStream());
        String str = (String)din.readUTF();
        System.out.println("The message from client is  " +str);

        
    }
    
    
    
}
