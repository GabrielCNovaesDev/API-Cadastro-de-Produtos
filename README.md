# API de Cadastro de Produtos (CRUD + Banco)

Projeto de uma API RESTful construída com Spring Boot para cadastro e gestão de produtos. Utiliza banco de dados H2 em memória, organizado no padrão de camadas MVC. Os dados podem ser testados via Postman, com suporte completo a operações CRUD.

## 🔧 Tecnologias e Conceitos Aplicados

🔹 Arquitetura MVC no Spring  
🔹 Criação de Controllers, Models, Repositories e Services  
🔹 Banco H2 com Spring Data JPA  
🔹 Endpoints: GET, POST, DELETE  
🔹 Uso do Postman para testar rotas  
🔹 Boas práticas de organização e injeção de dependência  

📌 **Projeto:** API de Cadastro de Produtos  
🎯 **Objetivo:** Dominar o ciclo completo de uma API CRUD com persistência em banco

## 🚀 Guia de Uso

### ▶️ Como rodar o projeto

1. **Pré-requisitos**:
   - Java 17
   - IDE com suporte a Maven (IntelliJ, VS Code)
   - Postman para testar a API

2. **Clonar o repositório**:
```bash
git clone https://github.com/seu-usuario/produto-api.git
```

3. **Executar o projeto**:
Abra na IDE e execute a classe:
```
com.seunome.produtoapi.ProdutoApiApplication
```

### 💾 Acessar o H2 Console

Acesse no navegador:
```
http://localhost:8080/h2-console
```

Preencha:

| Campo       | Valor               |
|-------------|---------------------|
| JDBC URL    | jdbc:h2:mem:testdb  |
| User Name   | sa                  |
| Password    | *(deixe em branco)* |
| Driver      | (já preenchido)     |

Clique em **Connect**

### 📮 Como testar com Postman

#### ➕ POST (Cadastrar Produto)
```
POST http://localhost:8080/produtos
```
Body (JSON):
```json
{
  "nome": "Teclado",
  "preco": 250.00
}
```

#### 📄 GET (Listar Produtos)
```
GET http://localhost:8080/produtos
```

#### ❌ DELETE (Excluir Produto)
```
DELETE http://localhost:8080/produtos/{id}
```
