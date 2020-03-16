package com.JavaPractice.IOOperationn_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by JC52036 on 13-03-2020.
 */
public class BufferenReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Reading i/p stream");
        int i=Integer.parseInt(br.readLine());
        System.out.println(i);
        System.out.println("Reading string from i/p ");
        String str=br.readLine();
        System.out.println(str);

    }
}
