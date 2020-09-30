package br.jus.tjsc.selo;

import java.math.BigDecimal;

public class Selo {

    private Integer tipoSelo;

    private String numeroSerie;

    private String validador;

    private BigDecimal valorSelo;


    public Integer getTipoSelo() {
        return tipoSelo;
    }

    public void setTipoSelo(Integer tipoSelo) {
        this.tipoSelo = tipoSelo;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getValidador() {
        return validador;
    }

    public void setValidador(String validador) {
        this.validador = validador;
    }

    public BigDecimal getValorSelo() {
        return valorSelo;
    }

    public void setValorSelo(BigDecimal valorSelo) {
        this.valorSelo = valorSelo;
    }
}
