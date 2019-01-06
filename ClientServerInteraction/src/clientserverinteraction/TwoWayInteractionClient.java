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
public class TwoWayInteractionClient {
 
    
    public static void main(String[] args) throws IOException {
        
        Socket obj = new Socket("localhost",8844);
        DataOutputStream dout = new DataOutputStream(obj.getOutputStream());
        dout.writeUTF("This message is from client side");
        dout.flush();
        
        
        //ServerSocket rec = new ServerSocket(8134);
        DataInputStream din = new DataInputStream(obj.getInputStream());
        String newdata = (String)din.readUTF();
        System.out.println(" the new msg is " +newdata);
        
    }
    
    
}
