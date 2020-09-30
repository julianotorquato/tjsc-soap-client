package com.example.tjscsoapclient.domain.getselo.response;

import com.example.tjscsoapclient.domain.ResponseClient;

import java.io.File;
import java.util.List;

public class SeloResponse implements ResponseClient {

    private static final long serialVersionUID = 1L;

    private Long codigoServentia;

    private Long messageId;

    private List<Selo> selos;

    private String messageDate;

    private String version;


    public Long getCodigoServentia() {
        return codigoServentia;
    }

    public void setCodigoServentia(Long codigoServentia) {
        this.codigoServentia = codigoServentia;
    }

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public List<Selo> getSelos() {
        return selos;
    }

    public void setSelos(List<Selo> selos) {
        this.selos = selos;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
