package com.cdk.file;

import com.cdk.employee.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by karodes on 7/27/2017.
 */
public class ObjectWriter {

    public static void writeData(ArrayList<Employee> employeeArrayList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("C:\\Users\\karodes\\Documents\\CdkTraining\\FileHandling\\ObjectSerializationExercise\\src\\com\\cdk\\file\\employee_data.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            Iterator<Employee> itr = employeeArrayList.iterator();
            while(itr.hasNext()) {
                Employee employee = itr.next();
                objectOutputStream.writeObject(employee);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(objectOutputStream != null){
                    objectOutputStream.close();
                }
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }

            } catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}
