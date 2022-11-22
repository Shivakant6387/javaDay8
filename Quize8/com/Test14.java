package com.Quize8.com;

import java.io.IOException;

public class Test14 {
    public static void main(String[]args){
        try{
                throw new IOException("MyException");
        }catch (ArrayStoreException | IOException |ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
