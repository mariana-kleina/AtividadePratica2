import java.util.List;

public class SistemaPokemon {
    private static void exibirMenu() {
        System.out.println("\n=== Menu da Pokestore ===");
        System.out.println("1. Cadastrar Pokémon");
        System.out.println("2. Buscar Pokémon");
        System.out.println("3. Listar Pokémons de Água");
        System.out.println("4. Listar Pokémons de Fogo");
        System.out.println("5. Listar Pokémons de Grama");
        System.out.println("6. Listar todos os Pokémons");
        System.out.println("7. Remover Pokémon");
        System.out.println("8. Excluir todos os Pokémons");
        System.out.println("9. Editar Pokémon");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção:");
    }

    private static void verificarOpcao(int op) {
        String nomePokemon;
        int nivel;

        switch (op) {
            case 1:
                System.out.print("\nInforme o nome do Pokémon: ");
                nomePokemon = Console.lerString();
                System.out.print("Informe o tipo (Água, Fogo, Grama): ");
                String tipo = Console.lerString();
                System.out.print("Informe o nível: ");
                nivel = Console.lerInt();
                cadastrarPokemon(nomePokemon, tipo, nivel);
                break;
            case 2:
                System.out.print("\nInforme o nome do Pokémon: ");
                nomePokemon = Console.lerString();
                buscarPokemon(nomePokemon);
                break;
            case 3:
                listarPokemons(CadastroPokemons.getPokemonsAgua());
                break;
            case 4:
                listarPokemons(CadastroPokemons.getPokemonsFogo());
                break;
            case 5:
                listarPokemons(CadastroPokemons.getPokemonsGrama());
                break;
            case 6:
                listarPokemons(CadastroPokemons.getListaPokemons());
                break;
            case 7:
                System.out.print("\nInforme o nome do Pokémon: ");
                nomePokemon = Console.lerString();
                removerPokemon(nomePokemon);
                break;
            case 8:
                excluirTodosPokemons();
                break;
            case 9:
                System.out.print("\nInforme o nome do Pokémon que deseja editar: ");
                String nomeAntigo = Console.lerString();
                System.out.print("Informe o novo nome: ");
                String novoNome = Console.lerString();
                System.out.print("Informe o novo tipo: ");
                String novoTipo = Console.lerString();
                System.out.print("Informe o novo nível: ");
                int novoNivel = Console.lerInt();
                editarPokemon(nomeAntigo, novoNome, novoTipo, novoNivel);
                break;
            case 0:
                System.out.println("\nSaindo da Pokestore...");
                break;
            default:
                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

        System.out.println();
    }

    private static void cadastrarPokemon(String nome, String tipo, int nivel) {
        switch (tipo.toLowerCase()) {
            case "agua":
                PokemonAgua agua = new PokemonAgua(nome, nivel, true);
                CadastroPokemons.cadastrar(agua);
                System.out.println("\nPokémon de Água cadastrado com sucesso!");
                break;
            case "fogo":
                PokemonFogo fogo = new PokemonFogo(nome, nivel, 100);
                CadastroPokemons.cadastrar(fogo);
                System.out.println("\nPokémon de Fogo cadastrado com sucesso!");
                break;
            case "grama":
                PokemonGrama grama = new PokemonGrama(nome, nivel, 50);
                CadastroPokemons.cadastrar(grama);
                System.out.println("\nPokémon de Grama cadastrado com sucesso!");
                break;
            default:
                System.out.println("\nTipo de Pokémon inválido.");
                break;
        }
    }

    private static void buscarPokemon(String nomePokemon) {
        boolean encontrado = false;
        for (Pokemon pokemon : CadastroPokemons.getListaPokemons()) {
            if (pokemon.getNome().equalsIgnoreCase(nomePokemon)) {
                encontrado = true;
                System.out.println("\nPokémon encontrado:");
                System.out.println(pokemon);
                break;
            }
        }

        if (!encontrado) {
            System.out.println("\nPokémon não encontrado no cadastro.");
        }
    }

    private static void listarPokemons(List<Pokemon> pokemons) {
        if (pokemons.isEmpty()) {
            System.out.println("Não há Pokémons cadastrados.");
        } else {
            System.out.println("\nLista de Pokémons:");
            for (Pokemon pokemon : pokemons) {
                System.out.println(pokemon);
            }
        }
    }

    private static void removerPokemon(String nomePokemon) {
        if (CadastroPokemons.excluir(nomePokemon)) {
            System.out.println("\nPokémon removido com sucesso!");
        } else {
            System.out.println("\nPokémon não encontrado no cadastro.");
        }
    }

    private static void excluirTodosPokemons() {
        CadastroPokemons.excluirTodos();
        System.out.println("\nTodos os Pokémons foram excluídos.");
    }

    private static void editarPokemon(String nomeAntigo, String novoNome, String novoTipo, int novoNivel) {
        boolean editado = CadastroPokemons.editarPokemon(nomeAntigo, novoNome, novoTipo, novoNivel);
        if (editado) {
            System.out.println("\nPokémon editado com sucesso!");
        } else {
            System.out.println("\nPokémon não encontrado no cadastro.");
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }

    public static void main(String[] args) {
        executar();
    }
}
