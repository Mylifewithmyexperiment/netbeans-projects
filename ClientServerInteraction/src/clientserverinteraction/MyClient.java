/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientserverinteraction;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author SHASHI
 * make socket with ip and port 
 * make reference to send data through socket object 
 * write content in object of dataoutputstream
 * and flush it 
 * 
 * 
 */
public class MyClient {
    
    
    public static void main(String[] args) throws IOException {
        
        Socket obj = new Socket("localhost",8040);
        DataOutputStream dout = new DataOutputStream(obj.getOutputStream());
        dout.writeUTF("This message is from client side");
        dout.flush();
        
        
    }
}
