package com.example.tjscsoapclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private String tjscWebserviceUri;
    private String username;
    private String password;

    public String getTjscWebserviceUri() {
        return tjscWebserviceUri;
    }

    public void setTjscWebserviceUri(String tjscWebserviceUri) {
        this.tjscWebserviceUri = tjscWebserviceUri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}