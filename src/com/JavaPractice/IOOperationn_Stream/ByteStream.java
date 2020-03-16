package com.JavaPractice.IOOperationn_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class ByteStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=null;
        FileOutputStream fout=null;
       try {
           fin = new FileInputStream("C:\\Users\\jc52036\\Documents\\Interview\\Java\\IOFiles\\inputReader.txt");
           fout = new FileOutputStream("C:\\Users\\jc52036\\Documents\\Interview\\Java\\IOFiles\\output.txt");

           int temp = 0;
           while ((temp = fin.read()) != -1) {
               fout.write((byte) temp);
           }
       }
        finally{
          if(fin !=null){
              fin.close();
          }
           if(fout!=null){
               fout.close();
           }
        }
    }
}
