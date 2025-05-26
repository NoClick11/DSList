# DSList - Catálogo de Jogos

Este projeto é uma aplicação backend com Spring Boot que expõe uma API REST para gerenciar listas de jogos. Ele consome dados de um banco de dados relacional, utilizando JPA e H2 em ambiente de desenvolvimento.

## 🚀 Tecnologias Utilizadas

<p align="left">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" />
  <img src="https://img.shields.io/badge/H2-004482?style=for-the-badge&logo=h2&logoColor=white" alt="H2 Database" />
  <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven" />
</p>

## ⚙️ Pré-requisitos

* [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/install.html)

## 📦 Instalação

1. Clone o repositório:

```bash
git clone https://github.com/NoClick11/DSList.git
cd DSList
```

2. Compile o projeto:

```bash
mvn clean install
```

## ▶️ Execução

Execute a aplicação:

```bash
mvn spring-boot:run
```

A API estará disponível em: `http://localhost:8080`

## 🔧 Funcionalidades da API

* Listar todos os jogos
* Listar jogos por ID
* Listar todas as listas de jogos
* Listar jogos de uma lista específica
* Mover a posição de um jogo dentro de uma lista

## 📘 Exemplos de Uso

### 📄 Listar Todos os Jogos

```http
GET /games
```

### 🔍 Buscar Jogo por ID

```http
GET /games/1
```

### 📋 Listar Todas as Listas de Jogos

```http
GET /lists
```

### 📂 Listar Jogos de uma Lista Específica

```http
GET /lists/1/games
```

### 🔄 Mover Posição de um Jogo na Lista

```http
POST /lists/1/replacement
Content-Type: application/json

{
  "sourceIndex": 2,
  "destinationIndex": 0
}
```

## 🧱 Estrutura do Projeto

```plaintext
DSList/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/devsuperior/dslist/
│   │   │       ├── controllers/
│   │   │       ├── dto/
│   │   │       ├── entities/
│   │   │       ├── repositories/
│   │   │       └── services/
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
```

## 🧪 Testes

```bash
mvn test
```

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

## 🤝 Contribuição

Contribuições são bem-vindas! Abra uma issue ou pull request com melhorias ou correções.
