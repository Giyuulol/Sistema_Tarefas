# Sistema para Controle de Tarefas

Este projeto foi desenvolvido como avaliação final para a disciplina de Programação Orientada a Objetos. Trata-se de um sistema em Java para o controle e organização de tarefas numa fábrica de software, permitindo uma gestão eficiente das atividades das equipas de desenvolvimento.

## 🎯 Contexto
Uma fábrica de software necessita de um sistema para organizar as tarefas dos times de desenvolvimento.

## ✨ Funcionalidades Implementadas

O sistema permite realizar as seguintes operações, divididas pelos perfis de utilizador:

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

## 👥 Equipa de Desenvolvimento
* [Nome do Integrante 1]
* [Nome do Integrante 2]
* [Nome do Integrante 3]
* [Nome do Integrante 4]

## ⚙️ Pré-requisitos e Configuração do Ambiente

Antes de executar o projeto, certifique-se de que tem o seguinte instalado:
* Java Development Kit (JDK) - Versão X.X ou superior (ex: JDK 11, 17)
* MySQL Server - Versão X.X ou superior
* Um cliente MySQL (ex: MySQL Workbench, DBeaver) para criar o banco de dados e as tabelas.
* (Opcional) Uma IDE Java como IntelliJ IDEA, Eclipse ou VS Code.

**Configuração do Banco de Dados:**
1.  Crie um banco de dados no MySQL com o nome `sistemarefasdb_javapuro` (ou o nome que definiram).
2.  Execute o script SQL fornecido no ficheiro `schema.sql` (ou similar, localizado em `src/main/resources/database/` ou na raiz do projeto) para criar as tabelas necessárias: `categorias`, `colaboradores` e `tarefas`.
3.  Configure as credenciais de acesso ao banco de dados na classe `DatabaseConnector.java` (localizada em `com.sistemarefas.database.DatabaseConnector`):
    ```java
    // Exemplo dentro de DatabaseConnector.java
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sistemarefasdb_javapuro";
    private static final String USER = "seu_usuario_mysql"; // Altere aqui
    private static final String PASS = "sua_senha_mysql";   // Altere aqui
    ```

## 🚀 Como Compilar e Executar

**Compilação (via linha de comando):**
1.  Navegue até o diretório raiz do projeto (onde se encontra a pasta `src`).
2.  Compile os ficheiros Java:
    ```bash
    javac -d out -sourcepath src src/com/sistemarefas/MainApp.java src/com/sistemarefas/model/* src/com/sistemarefas/dao/* src/com/sistemarefas/service/* src/com/sistemarefas/database/* src/com/sistemarefas/exception/* src/com/sistemarefas/ui/*
    ```
    *(Este comando pode precisar de ajustes dependendo da estrutura final dos seus pacotes e se utilizar módulos Java).*
    *Alternativamente, se estiver a usar uma IDE, ela geralmente trata da compilação automaticamente.*

**Execução (via linha de comando):**
1.  Após a compilação bem-sucedida (os ficheiros `.class` estarão na pasta `out`), execute a aplicação:
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
* `com.sistemarefas.ui`: Contém as classes que gerem a interface com o utilizador via linha de comando.

## 🤝 Contribuições
Este é um projeto académico. Contribuições externas não são esperadas neste momento, mas sugestões são bem-vindas.

---
*Este projeto foi desenvolvido para fins educacionais como parte da disciplina de Programação Orientada a Objetos.*
