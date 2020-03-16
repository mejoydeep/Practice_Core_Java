package com.JavaPractice.IOOperationn_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class CharStream {
    public static void main(String[] args) throws IOException {
        FileReader freader=null;

        try {
            freader=new FileReader("C:\\Users\\jc52036\\Documents\\Interview\\Java\\IOFiles\\inputReader.txt");
            int temp=0;
            while ((temp=freader.read())!=-1){
                System.out.print((char) temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if(freader!=null){
                freader.close();
            }
        }
    }
}
