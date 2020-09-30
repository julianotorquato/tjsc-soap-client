package br.jus.tjsc.selo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "messageSelos"
})
@XmlRootElement(name = "messageSelos")
public  class SeloRootV2 {

    private MessageSelos messageSelos;

    public MessageSelos getMessageSelos() {
        return messageSelos;
    }

    public void setMessageSelos(MessageSelos messageSelos) {
        this.messageSelos = messageSelos;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "codigoServentia",
            "messageID",
            "selos",
            "messageDate",
            "version"
    })
    public static class MessageSelos {

        private Long codigoServentia;

        private Long messageID;

        private br.jus.tjsc.selo.MessageSelos.Selos selos;

        private String messageDate;

        private String version;


        public Long getCodigoServentia() {
            return codigoServentia;
        }

        public void setCodigoServentia(Long codigoServentia) {
            this.codigoServentia = codigoServentia;
        }

        public Long getMessageID() {
            return messageID;
        }

        public void setMessageID(Long messageID) {
            this.messageID = messageID;
        }

        public br.jus.tjsc.selo.MessageSelos.Selos getSelos() {
            return selos;
        }

        public void setSelos(br.jus.tjsc.selo.MessageSelos.Selos selos) {
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

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "selo"
        })
        public static class Selos {

            private List<br.jus.tjsc.selo.MessageSelos.Selo> selo;

            public List<br.jus.tjsc.selo.MessageSelos.Selo> getSelo() {
                return selo;
            }

            public void setSelo(List<br.jus.tjsc.selo.MessageSelos.Selo> selo) {
                this.selo = selo;
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "tipoSelo",
                "numeroSerie",
                "validador",
                "valorSelo"
        })
        public static class Selo {

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
    }
}
