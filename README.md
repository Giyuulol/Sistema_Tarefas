# SistemaTarefas
**teste**
Este projeto foi desenvolvido como avaliação final para a disciplina de Programação Orientada a Objetos. Trata-se de um sistema em Java para o controle e organização de tarefas em uma fábrica de software, permitindo uma gestão eficiente das atividades das equipes de desenvolvimento.

## 🎯 Contexto
Uma fábrica de software necessita de um sistema para organizar as tarefas dos times de desenvolvimento.

## ✨ Funcionalidades Implementadas

O sistema permite realizar as seguintes operações, divididas pelos perfis de usuário:

**Gerente:**
* ✔️ Cadastra, modifica e exclui Tarefas.
* ✔️ Cadastra, modifica e exclui Categorias de tarefas.
* ✔️ Cadastra, modifica e exclui Colaboradores.
* ✔️ Associa Tarefas a Colaboradores.
* ✔️ Consulta a lista de Colaboradores.
* ✔️ Consulta a lista de Categorias de tarefas.
* ✔️ Consulta a lista de Tarefas utilizando filtros (por colaborador, categoria e status).

**Colaborador:**
* ✔️ Consulta as suas Tarefas atribuídas.
* ✔️ Altera o status das suas Tarefas.
* ✔️ Consulta a lista de Tarefas utilizando filtros (por categoria e status, geralmente focado nas suas tarefas ou conforme regras de negócio).

## 💻 Tecnologias Utilizadas
* **Linguagem:** Java (Core)
* **Princípios:** Programação Orientada a Objetos (POO)
* **Banco de Dados:** MySQL (via JDBC)
* **Interface:** Linha de Comando (CLI)

## 👥 Equipe de Desenvolvimento
* Alex Dantas
* Diego Braga
* Francisco Serafim
* Handrey Kaleu

## ⚙️ Pré-requisitos e Configuração do Ambiente

Antes de executar o projeto, certifique-se de que você tem o seguinte instalado:
* Java Development Kit (JDK) - Versão X.X ou superior (ex: JDK 11, 17)
* MySQL Server - Versão X.X ou superior
* Um cliente MySQL (ex: MySQL Workbench, DBeaver) para criar o banco de dados e as tabelas.
* (Opcional) Uma IDE Java como IntelliJ IDEA, Eclipse ou VS Code.

**Configuração do Banco de Dados:**
1.  Crie um banco de dados no MySQL com o nome `sistemarefasdb` (ou o nome que definiram).
2.  Execute o script SQL fornecido no arquivo `schema.sql` (ou similar, localizado em `src/main/resources/database/` ou na raiz do projeto) para criar as tabelas necessárias: `categorias`, `colaboradores` e `tarefas`.
3.  Configure as credenciais de acesso ao banco de dados na classe `DatabaseConnector.java` (localizada em `com.sistemarefas.database.DatabaseConnector`):
    ```java
    // Exemplo dentro de DatabaseConnector.java
    private static final String DB_URL = "";
    private static final String USER = "";
    private static final String PASS = "";
    ```

## 🚀 Como Compilar e Executar

**Compilação (via linha de comando):**
1.  Navegue até o diretório raiz do projeto (onde se encontra a pasta `src`).
2.  Compile os arquivos Java:
    ```bash
    javac -d out -sourcepath src src/com/sistemarefas/MainApp.java src/com/sistemarefas/model/* src/com/sistemarefas/dao/* src/com/sistemarefas/service/* src/com/sistemarefas/database/* src/com/sistemarefas/exception/* src/com/sistemarefas/ui/*
    ```
    *(Este comando pode precisar de ajustes dependendo da estrutura final dos seus pacotes e se utilizar módulos Java).*
    *Alternativamente, se estiver usando uma IDE, ela geralmente trata da compilação automaticamente.*

**Execução (via linha de comando):**
1.  Após a compilação bem-sucedida (os arquivos `.class` estarão na pasta `out`), execute a aplicação:
    ```bash
    java -cp out com.sistemarefas.MainApp
    ```
2.  Siga as instruções apresentadas no menu da aplicação via linha de comando.

**Execução (via IDE):**
1.  Importe o projeto para a sua IDE Java preferida.
2.  Localize a classe `MainApp.java` (em `com.sistemarefas`).
3.  Execute o método `main` desta classe.

## 🏗️ Estrutura do Projeto (Visão Geral dos Pacotes)
* `com.sistemarefas.MainApp`: Ponto de entrada da aplicação, orquestra a UI.
* `com.sistemarefas.model`: Contém as classes de entidade (POJOs) como `Tarefa`, `Categoria`, `Colaborador`.
* `com.sistemarefas.dao`: Contém as classes Data Access Object (DAO) responsáveis pela interação com o banco de dados via JDBC.
* `com.sistemarefas.service`: Contém a camada de serviço com a lógica de negócio da aplicação.
* `com.sistemarefas.database`: Responsável pela gestão da conexão com o banco de dados.
* `com.sistemarefas.exception`: Contém as classes de exceções personalizadas.
* `com.sistemarefas.ui`: Contém as classes que gerenciam a interface com o usuário via linha de comando.

## 🤝 Contribuições
Este é um projeto acadêmico. Contribuições externas não são esperadas neste momento, mas sugestões são bem-vindas.

---
*Este projeto foi desenvolvido para fins educacionais como parte da disciplina de Programação Orientada a Objetos.*

