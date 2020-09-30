# Client Soap

## Tabela de Índice

1.  [Descrição](#id-descricao)
2.  [Pré-requisitos](#id-requisitos)
4.  [Tecnologias](#id-tecnologias)
5.  [SOAP](#id-soap)
6.  [Instalação](#id-instalacao)
6.  [Links TJSC](#id-links)
9.  [Autor](#id-autor)

<div id='id-descricao'/>

## Descrição

**Client Soap** é um applicação gerada pelo [String Initializr](https://start.spring.io/). É um projeto de exemplo Client Soap com base no Selo TJSC.

---

<div id='id-requisitos'/>

## ✋🏻 Pré-requisitos

- Java (1.8)
- Maven (3.3.9)

---

<div id='id-tecnologias'/>

### 🚀 Tecnologias

- [SpringBoot](https://spring.io/) - facilita a criação de aplicações Spring com poucas configurações e não faz uso de XML, usa anotações.
- [MapsStruct](https://mapstruct.org/) - realiza a conversão dos DTO para os domains e vise versa.
- [Maven](https://maven.apache.org/) - ferramenta de building para: testar e executar.

---

<div id='id-soap'/>

## Soap

Abaixo segue as intruções usadas para fazer o download das classes Pojos java a partir dos xml


Instalar os pacotes do JDK  headless
```
    sudo apt install openjdk-8-jdk-headless
```

    cd src/main/java
      
Comando usado para importar o Pojos
```
  wsimport -keep -verbose http://selo.tjsc.jus.br/SeloService30Teste?wsdl
```

    cd /br/jus/tjsc/selo
    
Remoção dos .class
```
  rm *.class
```    

---

<div id='id-instalacao'/>

## 🔥 Instalação e execução

Faça o clone desse repositório e entre na pasta

```
cd tjsc-soap-client
```

Instalar as dependências

```
mvn install -DskipTests
```

Executar aplicação

```
./mvnw spring-boot:run
```

Acesse a API Clique [Aqui](http://localhost:8080/api/selos)


---

<div id='id-links'/>

## Links TJSC

- [Selo Digital](http://selo.tjsc.jus.br/html/padrao_tecnico.html) - Versão 3.0 e demais versões.
- [Interoperabilidade](http://selo.tjsc.jus.br/XMLSchema/v3.0/interoperabilidade_sd_3.0.pdf) - PDF daa páginas 19 e 20 mostram os serviços por ambientes.
- [Selo XMl](http://selo.tjsc.jus.br/XMLSchema/v0.3/Exemplos/ExemploSelos.xml) - XMl que contêm o payload do selo disponível pelo serviço GetSelos.

---

<div id='id-autor'/>

## Autor

**[Juliano Torquato](https://github.com/julianotorquato)**

---



