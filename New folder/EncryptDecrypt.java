/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author MAHE
 */
import java.io.RandomAccessFile;
class EncryptDecrypt {
    public static void main(String[] args){
        try{
            RandomAccessFile file = new RandomAccessFile("Input", "rw");
            byte b[] = new byte[(int)file.length()];
            file.readFully(b);
            file.seek(0);
            for(int i = 0; i< b.length;i++)
                b[i]+=13;
            file.write(b);
            file.seek(0);
            file.readFully(b);
            for(byte a : b){
                System.out.print((char)a);
            }
            for(int i = 0; i< b.length;i++)
                b[i]-=13;
            file.seek(0);
            file.write(b);
            file.seek(0);
            file.readFully(b);
            for(byte a : b){
                System.out.print((char)a);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

