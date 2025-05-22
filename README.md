# Sistema de Cadastro de Brinquedos - FIAP (Checkpoint 3)

Aplicativo Java com Spring Boot e Oracle (criado na IDE IntelliJ), desenvolvido para o cadastro de brinquedos de até 14 anos. O projeto implementa as funcionalidades básicas de um CRUD completo, com testes via Postman.

Inclui:
- Integração com banco de dados Oracle
- Endpoints REST (GET, POST, PUT, DELETE)
- Persistência com Spring Data JPA
- Validações com Jakarta Bean Validation

⚙️ Tecnologias:
- Java 21

- Spring Boot

- Spring Data JPA

- Oracle SQL Developer

- Postman

- Maven

- IntelliJ IDEA

📦 Estrutura da API:
POST /brinquedos: Cadastra novo brinquedo

GET /brinquedos: Lista todos os brinquedos

GET /brinquedos/{id}: Busca brinquedo por ID

PUT /brinquedos/{id}: Atualiza um brinquedo

DELETE /brinquedos/{id}: Remove um brinquedo


# Criação e Teste do Projeto
- Estrutura no Spring Initializr
![image](https://github.com/user-attachments/assets/ec2f3266-4433-41f2-934e-48cfadaf7605)

- Criação Banco de Dados:
![image](https://github.com/user-attachments/assets/24ea7521-36b9-4d85-b3a2-068e6d16cae1)

- Classe Brinquedo:
![image](https://github.com/user-attachments/assets/7f66ccdc-6b6c-4723-920d-15e19e8a7bce)

- Application Properties:
![image](https://github.com/user-attachments/assets/9255eb29-1629-427c-92ac-3c6f291fda69)

## Operações CRUD

* POST
![image](https://github.com/user-attachments/assets/9ba6790e-8927-4f4c-a28e-9e01f75fc1ae)

* GET
![image](https://github.com/user-attachments/assets/c840cf18-2f75-4a01-bdff-e28b7ff643b4)

* PUT
![image](https://github.com/user-attachments/assets/3277d0a4-74ea-47b7-8b2b-70e1502ba5a9)

* DELETE
![image](https://github.com/user-attachments/assets/be837323-a4ce-4b94-b66f-f2a7f5482449)

- Console Hibernate com as operações CRUD
![image](https://github.com/user-attachments/assets/a4abd167-c97d-4152-a328-e3e90946ef19)

📚 Como Executar:
- Clone o repositório

- Configure application.properties com seu usuário Oracle

- Execute o projeto no IntelliJ

- Teste via Postman nos endpoints
