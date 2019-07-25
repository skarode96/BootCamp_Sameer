package com.company.file;

import com.company.employee.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by karodes on 7/27/2017.
 */
public class ObjectReader {
    public static void readData() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        Employee employee = null;
        try {
            fileInputStream = new FileInputStream("C:\\Users\\karodes\\Documents\\CdkTraining\\FileHandling\\ObjectSerializationExercise\\src\\com\\company\\file\\employee_data.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (objectInputStream.available() != -1) {
                try {
                    employee = (Employee) objectInputStream.readObject();
                    System.out.println(employee);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
