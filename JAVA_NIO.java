/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_nio;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;


public class JAVA_NIO {

    
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        

        FileInputStream input = new FileInputStream("F:\\file2.txt");
        ReadableByteChannel source = input.getChannel();  //channel from where data is read 
        FileOutputStream output = new FileOutputStream("F:\\file1.txt");
        WritableByteChannel destination = output.getChannel();  // channel from where data is written
        copyData(source,destination);  // method to copy data 
        source.close();
        destination.close();

    }

    private static void copyData(ReadableByteChannel source, WritableByteChannel destination) throws IOException {
     ByteBuffer buffer= ByteBuffer.allocate(20*1024); // data size is measured
     while(source.read(buffer)!=-1 )
         
         
             {
                buffer.flip();
                while(buffer.hasRemaining())
                {
                    destination.write(buffer);
                    
                }
                buffer.clear();
             }

    }
    
}
