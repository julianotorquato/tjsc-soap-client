package com.example.tjscsoapclient.service.util;

import java.nio.charset.StandardCharsets;

public class Base64Utils {

    public static String convertToString(byte[] body){
        return new String(body, StandardCharsets.UTF_8);
    }

}
