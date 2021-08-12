# API REST Pessoas utilizando Spring Boot
## Projeto lab da Digital Innovation One

[Link do Lab](https://web.digitalinnovation.one/lab/desenvolvendo-um-sistema-de-gerenciamento-de-pessoas-em-api-rest-com-spring-boot)

Para execução local, realizar os seguintes passos:
- Clonar ou realizar download do repositório;
- executar o seguinte comando no diretório corrente:
```
mvn spring-boot:run 
```
- Após subida do Maven, utilizar a seguinte URI em seu sistema:
```
http://localhost:8080/api/v1/person
```

O projeto também está Live no Heroku, no seguinte endereço:
```
https://dio-person-rest.herokuapp.com/
```

## Modelo e utilização

Ação | Verbo | Endpoint
-----|-------|----
Lista todos os usuários | GET | /v1/person
Lista usuário específico | GET | /v1/person/{id_do_usuario}
Adicionar usuário | POST | v1/person/
Editar usuário | PUT | v1/person/{id_do_usuario}
Excluir usuário | DELETE | v1/person/{id_do_usuario}

Para inclusão e edição de usuários é necessário trabalhar com a seguinte estrutura no Body:

### POST
```
{    
    "firstName": "Roberto",
    "lastName": "Jefferson",
    "cpf": "123.456.789.90",
    "birthDate": "23-03-1985",
    "phones": [
        {            
            "type": "MOBILE",
            "number": "(11) 1234-3933"
        }
    ]
}
```

### PUT
```
{    
    "id": 2,
    "firstName": "Roberto",
    "lastName": "Jefferson",
    "cpf": "123.456.789.90",
    "birthDate": "23-03-1985",
    "phones": [
        {
            "id": 2,            
            "type": "MOBILE",
            "number": "(11) 1234-3933"
        }
    ]
}
```

## Requisitos

* Java 11 ou superior;
* Maven 3.8.1 ou superior