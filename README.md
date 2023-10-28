# Todo List 
Projeto para estudos CRUD TodoList.

## Tecnologias utilizadas
- [Spring Boot]()
- [Spring MVC]()
- [Spring Data JPA]()
- [MySQL]()
- [SwaggerAPI]()

- [API REST]()
- [Consultas com Spring Data JPA]()
- [Dependency Injection]()


## Como Executar 

- Clonar o repositório localmente na sua máquina



## API Endpoints
Para fazer as requisições HTTP foi utilizada a ferramenta [Postman](https://www.postman.com/)

O Swagger pode ser visto em [localhost:8080/swagger-ui.html](localhost:8080/swagger-ui.html)

- Cadastrar tarefa

```javascript
POST http:localhost:8080/todos

[
  {
      "nome": "Todo 1",
      "descricao": "Descricao todo",
      "realizado": false,
      "prioridade": 1
  }
]
```



- Listar tarefas

```javascript

GET http:localhost:8080/todos

[
  {
        "id": 1,
        "nome": "Todo 1",
        "descricao": "Descricao todo",
        "realizado": false,
        "prioridade": 1
  }
]

```

- Listar tarefa pelo ID

```javascript
GET http:localhost:8080/todos/id

[
  {
        "id": 1,
        "nome": "Todo 1",
        "descricao": "Descricao todo",
        "realizado": false,
        "prioridade": 1
  }
]


```



- Atualizar tarefa

```javascript
PUT http:localhost:8080/todos

[
  {
    "nome": "Todo 1",
    "descricao": "Atualizando descrição",
    "realizado": true,
    "prioridade": 1
  }
]

```

- Deletar tarefa

```javascript
DELETE http:localhost8080:/todos/id

[ ]


```


