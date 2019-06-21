/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAHE
 */
//Program to read and write primitive data using random access files
import java.io.*;
class RandomAccess {
    public static void main(String[] args){
        try{
            RandomAccessFile file = new RandomAccessFile("Random", "rw");
            file.writeInt(275);
            file.writeChar('c');
            file.writeDouble(2.75);
            file.seek(0);
            System.out.println(file.readInt());
            System.out.println(file.readChar());
            System.out.println(file.readDouble());
            file.seek(file.length());
            file.writeInt(189);
            file.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
