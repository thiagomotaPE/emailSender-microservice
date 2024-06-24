# 📧 User E-mail Microservice

Este projeto consiste em um sistema de microserviços construído com Java e Spring Boot para gerenciar usuários e notificações por email. Ele utiliza um banco de dados PostgreSQL, RabbitMQ para comunicação entre serviços e Gmail para envio de emails.

## 📚 Índice

1. [Visão Geral](#-visão-geral)
2. [Arquitetura](#-arquitetura)
3. [Tecnologias Utilizadas](#-tecnologias-utilizadas)
4. [Licença](#-licença)

## 🌟 Visão Geral

Este sistema de microserviços possui dois componentes principais:

1. **User Service**: Gerencia os dados dos usuários e os envia ao RabbitMQ.
2. **E-mail Service**: Recebe os dados do RabbitMQ, envia emails para os usuários e salva as notificações.

## 🏛️ Arquitetura

```plaintext
+-------------+     +-----------+     +-------------+
| User Service| --> | RabbitMQ  | --> | Notification |
+-------------+     +-----------+     +-------------+
      |                  |                  |
   PostgreSQL            |             PostgreSQL
```

- **User Service**: Recebe os dados do usuário e os armazena no PostgreSQL. Os dados são então enviados ao RabbitMQ.
- **RabbitMQ**: Atua como broker para comunicação assíncrona entre os serviços.
- **Notification Service**: Recebe os dados do RabbitMQ, envia emails e armazena informações sobre o envio no PostgreSQL.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Lombok**
- **PostgreSQL**
- **RabbitMQ** via **CloudAMQP**
- **Docker**
- **Flyway** (para migrações de banco de dados)
- **SMTP Gmail** (para envio de emails)

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
