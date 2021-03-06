package com.example.tjscsoapclient.service.util;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;

public class Base64DecodePdf {

    public static void main(String[] args) {
        File file = new File("./test.pdf");

        try (FileOutputStream fos = new FileOutputStream(file); ) {

            // To be short I use a corrupted PDF string, so make sure to use a valid one if you want to preview the PDF file
            String b64 = "JVBERi0xLjUKJYCBgoMKMSAwIG9iago8PC9GaWx0ZXIvRmxhdGVEZWNvZGUvRmlyc3QgMTQxL04gMjAvTGVuZ3==";
            byte[] decoder = Base64.getDecoder().decode(b64);

            fos.write(decoder);
            System.out.println("PDF File Saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
