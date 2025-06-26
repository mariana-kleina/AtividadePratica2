# Atividade Prática 2 - Sistema de Gerenciamento de Pokémons

Este repositório contém um sistema de console para gerenciar e catalogar diferentes tipos de Pokémons. Desenvolvido em Java, este projeto serve como uma atividade prática para aplicar e consolidar conceitos de **Programação Orientada a Objetos (POO)**, com destaque para **herança**, **polimorfismo** e a organização de classes para gerenciar dados.

### Sobre o Projeto

O sistema simula uma "Pokestore" onde é possível cadastrar, buscar, listar, editar e remover Pokémons. Ele modela Pokémons de diferentes tipos (Água, Fogo, Grama) utilizando herança a partir de uma classe base `Pokemon`, permitindo a adição de atributos e comportamentos específicos para cada tipo. A interação é totalmente baseada em um menu de console, proporcionando uma experiência de usuário simples e direta.

### Funcionalidades Principais

* **Cadastrar Pokémon:** Permite adicionar novos Pokémons, especificando seu nome, tipo (Água, Fogo, Grama) e nível. O sistema cria instâncias específicas para cada tipo.
* **Buscar Pokémon:** Encontra e exibe os detalhes de um Pokémon pelo seu nome.
* **Listar Pokémons por Tipo:** Exibe listas filtradas de Pokémons de Água, Fogo ou Grama.
* **Listar Todos os Pokémons:** Apresenta uma lista completa de todos os Pokémons cadastrados.
* **Remover Pokémon:** Exclui um Pokémon do cadastro pelo nome.
* **Excluir Todos os Pokémons:** Limpa completamente o cadastro.
* **Editar Pokémon:** Permite atualizar o nome, tipo e nível de um Pokémon existente.

### Estrutura do Projeto (Classes Principais)

* `Pokemon.java`: Classe base que define as propriedades comuns de um Pokémon (nome, tipo, nível).
* `PokemonAgua.java`: Estende `Pokemon`, adicionando a propriedade `podeNadar`.
* `PokemonFogo.java`: Estende `Pokemon`, adicionando a propriedade `temperaturaChamas`.
* `PokemonGrama.java`: Estende `Pokemon`, adicionando a propriedade `tamanhoFolhas`.
* `CadastroPokemons.java`: Classe estática que gerencia a lista de Pokémons, oferecendo métodos para adicionar, buscar, listar, excluir e editar.
* `SistemaPokemon.java`: Implementa a interface de usuário baseada em console, interagindo com a classe `CadastroPokemons`.
* `Console.java`: Classe utilitária para facilitar a leitura de entradas do usuário (inteiros e strings) via `Scanner`.
* `Main.java`: Contém o método `main` para iniciar a execução do sistema.

### Tecnologias Utilizadas

* **Linguagem:** Java
* **Estruturas de Dados:** `ArrayList` para armazenar a coleção de Pokémons.
* **Entrada/Saída:** `Scanner` para interação com o console.

### Como Executar o Projeto

Para rodar este projeto em sua máquina local, siga os passos abaixo:

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) instalado (versão 8 ou superior recomendada).
2.  **Clonar o Repositório:**
    ```bash
    git clone [https://github.com/mariana-kleina/AtividadePratica2.git](https://github.com/mariana-kleina/AtividadePratica2.git)
    cd AtividadePratica2
    ```
3.  **Compilar o Projeto:** Navegue até o diretório onde os arquivos `.java` estão localizados (geralmente na raiz do projeto ou em uma pasta `src`) e compile-os:
    ```bash
    javac *.java
    ```
    *Se estiver usando um IDE (Eclipse, IntelliJ):* Abra o projeto diretamente no IDE e ele cuidará da compilação.
4.  **Executar o Projeto:** A partir do diretório onde os arquivos `.class` foram gerados:
    ```bash
    java Main
    ```
    *Se estiver usando um IDE:* Execute a classe `Main.java`.

### O que este projeto demonstra:

* Minha capacidade de aplicar **Programação Orientada a Objetos** com herança e polimorfismo para modelar entidades complexas.
* Habilidade em desenvolver sistemas de **gerenciamento de dados (CRUD)** em Java.
* Competência em criar interfaces de usuário interativas baseadas em console.
* Organização de código em classes bem definidas com responsabilidades claras.
