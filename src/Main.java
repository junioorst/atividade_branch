import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SistemaCatalogo meuCatalogo = new SistemaCatalogo();

        meuCatalogo.addItem(new Livro("Senhor dos Anéis", Arrays.asList("J.R.R.", "Tolkien"),
                1925, "Harper Colins"));

        meuCatalogo.addItem(new Revistas("Forbes", "Avon", "Negócios",
                "Revista dedicada a homens que se acham fodas que querem aparecer" +
                        "para outros homens que se acham fodas"));

        meuCatalogo.addItem(new CD("Gauchescas", "Gauchescas", Arrays.asList("Fundo da grota", "Céu azul",
        "Hino do Colorado")));

        meuCatalogo.addItem(new Livro("Gente Pobre", Arrays.asList("Dostoievski"), 1848, "Editora 34"));

//        meuCatalogo.imprimir("livro");
//        meuCatalogo.imprimir("cd");

        //meuCatalogo.pesquisar("Livro", "1925");

        meuCatalogo.consulta("livro", "Senhor dos Anéis");
    }
}