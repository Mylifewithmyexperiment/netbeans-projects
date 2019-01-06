/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverinteraction;

import java.io.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author SHASHI
 */
public class TwoWayInteractionServer {
     public static void main(String[] args) throws IOException {
        
    ServerSocket obj1 = new ServerSocket(8844);
        Socket obj = obj1.accept();
        DataInputStream din = new DataInputStream(obj.getInputStream());
        String str = (String)din.readUTF();
        System.out.println("The message from client is  " +str);
        
       // while two way interaction no need to create new port
        DataOutputStream dout =  new DataOutputStream(obj.getOutputStream()); 
        dout.writeUTF("This msg is send from server");
        dout.flush();
     }
     
    
}
