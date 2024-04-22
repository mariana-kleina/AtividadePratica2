import java.util.ArrayList;
import java.util.List;

public class CadastroPokemons {
    private static List<Pokemon> listaPokemons = new ArrayList<>();

    public static void cadastrar(Pokemon pokemon) {
        listaPokemons.add(pokemon);
    }

    public static List<Pokemon> getListaPokemons() {
        return listaPokemons;
    }

    public static List<Pokemon> getPokemonsAgua() {
        List<Pokemon> tempList = new ArrayList<>();
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon instanceof PokemonAgua) {
                tempList.add(pokemon);
            }
        }
        return tempList;
    }

    public static List<Pokemon> getPokemonsFogo() {
        List<Pokemon> tempList = new ArrayList<>();
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon instanceof PokemonFogo) {
                tempList.add(pokemon);
            }
        }
        return tempList;
    }

    public static List<Pokemon> getPokemonsGrama() {
        List<Pokemon> tempList = new ArrayList<>();
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon instanceof PokemonGrama) {
                tempList.add(pokemon);
            }
        }
        return tempList;
    }

    public static boolean excluir(String nomePokemon) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nomePokemon)) {
                listaPokemons.remove(pokemon);
                return true;
            }
        }
        return false;
    }

    public static void excluirTodos() {
        listaPokemons.clear();
    }

    public static boolean editarPokemon(String nomeAntigo, String novoNome, String novoTipo, int novoNivel) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nomeAntigo)) {
                pokemon.setNome(novoNome);
                pokemon.setTipo(novoTipo);
                pokemon.setNivel(novoNivel);
                return true;
            }
        }
        return false;
    }

    public static Pokemon buscarPokemon(String nomePokemon) {
        for (Pokemon pokemon : listaPokemons) {
            if (pokemon.getNome().equalsIgnoreCase(nomePokemon)) {
                return pokemon;
            }
        }
        return null;
    }
}
