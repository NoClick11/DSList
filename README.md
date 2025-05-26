# DSList - Catálogo de Jogos

Este projeto é uma API RESTful desenvolvida com Spring Boot, utilizando PostgreSQL como banco de dados relacional. A aplicação permite gerenciar uma lista de jogos, incluindo operações de listagem, inserção e ordenação.

## 🚀 Tecnologias Utilizadas

<p align="left">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven" />
</p>

## ⚙️ Pré-requisitos

* [Java 17 ou superior](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/install.html)
* [PostgreSQL](https://www.postgresql.org/download/)

## 📆 Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/NoClick11/DSList.git
   cd DSList
   ```

2. Configure o banco de dados:

   * Crie um banco no PostgreSQL com o nome desejado
   * Atualize as credenciais em `src/main/resources/application.properties`

3. Compile o projeto:

   ```bash
   mvn clean install
   ```

## ▶️ Execução

Para iniciar a aplicação:

```bash
mvn spring-boot:run
```

A aplicação estará acessível em `http://localhost:8080`

## 📁 Estrutura do Projeto

```plaintext
DSList/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── noclick/
│   │   │           └── dslist/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── service/
│   │   └── resources/
│   │       ├── application.properties
├── pom.xml
```

* `controller/`: Controladores REST
* `model/`: Entidades JPA
* `repository/`: Interfaces de persistência
* `service/`: Lógica de negócio

## 🥺 Testes

Para executar os testes:

```bash
mvn test
```

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## 🤝 Contribuição

Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias e correções!
