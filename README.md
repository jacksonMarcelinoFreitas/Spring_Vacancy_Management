# Anotações

Rocketseat - Trilha ignite - formação em Spring Boot

### Objetivos:

Contruir uma API Rest de Gestão de Vagas

### Formas de executar o arquivo java:

```
mvn spring-boot:run
```

### Gerar o arquivo .jar e rodá-lo:
```
mvn package
java -jar target/seu-aplicativo.jar
```

### Tecnologias:
- Docker
- Java
- Maven
- ApiDog
- PostgresSQL

### VSCode extensions:
- vscjava.vscode-java-pack
- vscjava.vscode-java-debug
- vscjava.vscode-java-test
- vscjava.vscode-java-dependency
- vscjava.vscode-maven
- redhat.java
- vscjava.vscode-spring-initializr
- vmware.vscode-spring-boot
- vscjava.vscode-spring-boot-dashboard

### Versões:
- Java 17
- Maven 3.9.5
- Spring 3.1.6

### Conceitos:
- Inversão de controle (IOC):

é um design de software que permite:  o desacoplamento, modularidade, reusabilidade, gestão de ciclo de vida.
O próprio Spring fornece um container de IOC, que o implementa por meio da Injeção de Dependência (DI), onde as dependências necessárias para um componente são ingetadas nele.
