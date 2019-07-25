package com.company.threads;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by karodes on 7/31/2017.
 */
public class FileReader2 implements Runnable {
    @Override
    public void run() {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\karodes\\Documents\\BootCamp_Sameer\\Day11\\ConcurrentFileReading\\src\\com\\company\\files\\story2.txt");
            int b = fis.read();
            while(b != -1) {
                System.out.print((char)b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
