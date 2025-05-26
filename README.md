DSList - Catálogo de Jogos
Este projeto é uma API RESTful desenvolvida com Spring Boot, utilizando PostgreSQL como banco de dados relacional. A aplicação permite gerenciar uma lista de jogos, incluindo operações de listagem, inserção e ordenação.

🚀 Tecnologias Utilizadas
<p align="center"> <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java" /> <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot" /> <img src="https://img.shields.io/badge/PostgreSQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white" alt="PostgreSQL" /> <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white" alt="Maven" /> </p>:contentReference[oaicite:16]{index=16}
⚙️ Pré-requisitos
Antes de iniciar, certifique-se de ter instalado:

Java 17 ou superior

Maven

PostgreSQL

📦 Instalação
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/NoClick11/DSList.git
cd DSList
Configure o banco de dados:

Crie um banco de dados no PostgreSQL com o nome desejado.

Atualize as credenciais e URL do banco de dados no arquivo src/main/resources/application.properties.

Instale as dependências e compile o projeto:

bash
Copiar
Editar
mvn clean install
▶️ Execução
Para iniciar a aplicação:

bash
Copiar
Editar
mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

📁 Estrutura do Projeto
plaintext
Copiar
Editar
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
│   │       └── static/
├── pom.xml
controller/: Contém os controladores REST.

model/: Define as entidades do banco de dados.

repository/: Interfaces para acesso aos dados.

service/: Contém a lógica de negócios da aplicação.

application.properties: Configurações da aplicação.
GitHub
+1
GitHub
+1

🧪 Testes
Para executar os testes:

bash
Copiar
Editar
mvn test
📄 Licença
Este projeto está licenciado sob a MIT License.

🤝 Contribuindo
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests.
