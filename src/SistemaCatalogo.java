import java.util.ArrayList;
import java.util.List;

public class SistemaCatalogo {

    private List<CD> listaCD = new ArrayList<>();
    private List<DVD> listaDVD = new ArrayList<>();
    private List<Revistas> listaRevistas = new ArrayList<>();
    private List<Livro> listaLivros = new ArrayList<>();

    public <T> void addItem(T item) {
        if (item instanceof CD) {
            listaCD.add((CD) item);
        } else if(item instanceof DVD) {
            listaDVD.add((DVD) item);
        } else if(item instanceof Revistas) {
            listaRevistas.add((Revistas) item);
        } else if(item instanceof Livro) {
            listaLivros.add((Livro) item);
        } else {
            System.out.println("Esse catálogo só suporta os seguintes itens: " +
                    "\nCD's, DVD's, Revistas, Livro");
        }
    }

    public <T> void imprimir(String tipo) {
        tipo = tipo.toLowerCase();
        switch (tipo) {
            case "dvd":
                System.out.println("DVD's:");
                listaDVD.forEach(System.out::println);
                System.out.println("\n" + "*".repeat(20));
                break;
            case "cd":
                System.out.println("CD's:");
                listaCD .forEach(System.out::println);
                System.out.println("\n" + "*".repeat(20) + "\n");
                break;
            case "revista":
                System.out.println("Revistas: ");
                listaRevistas.forEach(System.out::println);
                System.out.println("\n" + "*".repeat(20) + "\n");
                break;
            case "livro":
                System.out.println("Livros:");
                listaLivros.forEach(System.out::println);
                System.out.println("\n" + "*".repeat(20) + "\n");
                break;
            default:
                System.out.println("Tipo inválido. \nOpções válidas:" +
                        "'dvd', 'cd', 'revista', 'livro'");
        }
    }

    public <T> void pesquisarPorAutor(String tipo, String autor) {
        tipo = tipo.toLowerCase();
        switch (tipo) {
            case "dvd":
                for (DVD dvd : listaDVD){
                    if (dvd.autores().contains(autor)) {
                        System.out.println(dvd);
                    }
                }
                break;
            case "cd":
                System.out.println("Use outro tipo de pesquisa para pesquisar" +
                        "por CD's");
                break;
            case "revista":
                System.out.println("Use outro tipo de pesquisa para pesquisar" +
                        "por Revistas");
                break;
            case "livro":
                System.out.println("Livros");
                for(Livro livro : listaLivros){
                    if (livro.autores().contains(autor)) {
                        System.out.println(livro);
                    }
                }
                break;
            default:
                System.out.println("Tipo inválido. \nOpções válidas:" +
                        "'dvd', 'cd', 'revista', 'livro'");
        }
    }

    public <T> void pesquisar(String tipo, String pesquisa) {
        tipo = tipo.toLowerCase();
        switch (tipo) {
            case "dvd":
                for (DVD dvd : listaDVD){
                    if (dvd.toString().contains(pesquisa)) {
                        System.out.println(dvd);
                    }
                }
                break;
            case "cd":
                for (CD cd : listaCD) {
                    if (cd.toString().contains(pesquisa)) {
                        System.out.println(cd);
                    }
                }
                break;
            case "revista":
                for (Revistas revista : listaRevistas) {
                    if (revista.toString().contains(pesquisa)) {
                        System.out.println(revista);
                    }
                }
                break;
            case "livro":
                System.out.println("Livros");
                for(Livro livro : listaLivros){
                    if (livro.toString().contains(pesquisa)) {
                        System.out.println(livro);
                    }
                }
                break;
            default:
                System.out.println("Tipo inválido. \nOpções válidas:" +
                        "'dvd', 'cd', 'revista', 'livro'");
        }
    }

    public <T> void consulta(String tipo, String nome) {
        tipo = tipo.toLowerCase();
        switch (tipo){
            case "dvd":
                for (DVD dvd : listaDVD) {
                    if (dvd.name().equalsIgnoreCase(nome)) {
                        System.out.println(dvd);
                    }
                }
                break;
            case "cd":
                for (CD cd : listaCD) {
                    if (cd.name().equalsIgnoreCase(nome)) {
                        System.out.println(cd);
                    }
                }
                break;
            case "revista":
                for (Revistas revista : listaRevistas) {
                    if (revista.name().equalsIgnoreCase(nome)) {
                        System.out.println(revista);
                    }
                }
                break;
            case "livro":
                for (Livro livro : listaLivros) {
                    if(livro.name().equalsIgnoreCase(nome)) {
                        System.out.println(livro);
                    }
                }
                break;
            default:
                System.out.println("Tipo inválido. \nOpções válidas:" +
                        "'dvd', 'cd', 'revista', 'livro'");
        }
    }

}
