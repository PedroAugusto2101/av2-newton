---
# Tarefa

Aplicação web RESTful desenvolvida com *Spring Boot* e *MySQL* para gerenciamento de tarefas, com autenticação segura via JWT, documentação interativa com Swagger e deploy via Docker.

## Integrantes:
- Pedro Augusto Andrade Silva (12118331)

## Funcionalidades:
- *Gerenciamento de Tarefas:* Operações CRUD (Criar, Ler, Atualizar, Deletar) para tarefas.
- *Autenticação JWT:* Sistema seguro de login e controle de acesso.
- *Documentação Interativa:* Explore as rotas da API através do Swagger.
- *Testes Unitários:* Garantem a confiabilidade das funcionalidades.
  
## Tecnologias Utilizadas:
- *Backend:* Spring Boot, Java
- *Banco de Dados:* MySQL
- *Segurança:* JWT (JSON Web Tokens)
- *Documentação:* Swagger
- *Deploy:* Docker e Docker Compose

## Rotas da API:
- *GET /feed*: Retorna todas as tarefas.
- *POST /tasks*: Cria uma nova tarefa.
- *PUT /tasks/{id}*: Atualiza uma tarefa específica.
- *DELETE /tasks/{id}*: Deleta uma tarefa.

Documentação completa disponível no Swagger em http://localhost:8080/swagger-ui/.

## Estrutura do Banco de Dados:
- *Tabela tarefas:*
  - task_id (bigint)
  - creation_timestamp (Timestamp)
  - descricao (varchar-255)
  - user_id (binary-16)
  - content (varchar-255)
  
  

## Como Executar o Projeto:
1. Clone o repositório:
   bash
   git clone https://github.com/LeonardoVieiraGuimaraes/tarefa.git
   
2. Configure o arquivo application.properties com suas credenciais do MySQL.
3. Execute o projeto via Maven ou Docker Compose:
   bash
   docker-compose up
   
4. Acesse a documentação Swagger em:
   plaintext
   http://localhost:8080/swagger-ui/
   

## Como Contribuir:
1. Faça um fork do projeto.
2. Crie uma branch (git checkout -b feature/nome-da-feature).
3. Commit suas mudanças (git commit -m 'Adicionar nova funcionalidade').
4. Envie para a branch principal (git push origin feature/nome-da-feature).
5. Abra um Pull Request.

---
