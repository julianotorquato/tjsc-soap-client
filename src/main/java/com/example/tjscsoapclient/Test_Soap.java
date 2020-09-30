package com.example.tjscsoapclient;

import br.jus.tjsc.selo.SeloRoot;
import br.jus.tjsc.selo.SeloService_Service;
import com.example.tjscsoapclient.service.util.XmlUtils;

import java.nio.charset.StandardCharsets;

public class Test_Soap {

    public static void main(String[] args) throws Exception{
        SeloService_Service seloService_service = new SeloService_Service();
        byte[] body = seloService_service.getSeloServicePort().getSelos("cartorio", "selodigital");

        System.out.println(body);
        SeloRoot seloRoot = null;
        try {
            // byte[] to string
            String s = new String(body, StandardCharsets.UTF_8);

            seloRoot =  XmlUtils.convertXmlToObject(s, SeloRoot.class);


        }catch (Exception e){
            e.printStackTrace();
        }



    }

}
