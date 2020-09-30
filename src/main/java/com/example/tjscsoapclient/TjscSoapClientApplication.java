package com.example.tjscsoapclient;

import com.example.tjscsoapclient.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({ApplicationProperties.class})
@SpringBootApplication
public class TjscSoapClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TjscSoapClientApplication.class, args);
	}

}
