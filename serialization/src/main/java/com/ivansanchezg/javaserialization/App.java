package com.ivansanchezg.javaserialization;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee("John Smith", 12345, 1, "Random Street 123");
        System.out.println("Writing the following object:");
        System.out.println(employee.toString());

        File file = new File("employee.ser");
        ObjectWriter objectWriter = new ObjectWriter();
        objectWriter.writeObject(employee, file);

        ObjectReader objectReader = new ObjectReader();
        Employee readEmployee = (Employee) objectReader.readObject(file);
        System.out.println("Object read:");
        System.out.println(readEmployee.toString());
    }
}
