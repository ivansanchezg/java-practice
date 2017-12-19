package com.ivansanchezg.javaserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public void writeObject(Object object, File file) {
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object wrote successfully");
	   }catch(Exception e){
		   e.printStackTrace();
	   }
    }
}