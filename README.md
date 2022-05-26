# Controle de doacoes

## Projeto para estudar Spring-Boot, modelagem de dados, MySQL, API REST.

Tecnologias utlizada:
- Java 11
- Eclipse IDE for Enterprise Java Developers.
- Maven
- Spring-Boot
- Mysql 8

Para executar o programa, você pode importar o projeto para sua IDE ou pelo terminal com o comando:
```bash
mvn spring-boot:run
```

Para recuperar uma lista com todas as Pessoas tanto Postman(HTTP GET) ou no Browser:

```
http://localhost:8080/pessoa
```

Para recuperar uma Pessoa pelo ID tanto no Postman(HTTP GET) ou no Browser, por exemplo, para recuperar a pessoa de id=1:

```
http://localhost:8080/pessoa/1
```
Para adicionar uma Pessoa no Banco de Dados vai precisar do Postman ou outro programa semelhante. Na url:

```
http://localhost:8080/pessoa
```

Defina o método HTTP POST -> Body -> raw -> JSON:

```Json
 {
        "nome": "Pedro",
        "email": "pedro@gmail.com",
        "telefone": "1112345678",
        "senha": "12345",
        "administrador": true,
        "cep": "08000000",
        "logradouro": "rua de casa",
        "numero": "0",
        "complemento": "",
        "bairro": "",
        "cidade": "sao paulo",
        "uf": "sp"
 }
 ```
 
 Para atualizar os dados de uma pessoa utilize o método HTTP PUT e siga os mesmos passos para adicionar. Podem adiciona o atributo idPessoa e passe o id da pessoa que deseja atualizar:
 ```
  "idPessoa": id,
 ```
