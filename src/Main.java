import java.util.*;

public class Main {
    public static void main(String[] args) {
        Revista r1 = new Revista(101, "Java Programming", "12/05", "Ana Souza", 2023, 1, "Casa do Código", "Tecnologia");
        Revista r2 = new Revista(202, "Ciência da Computação", "15/06", "Carlos Pereira", 2022, 2, "Editora Acadêmica", "Ciência");
        Revista r3 = new Revista(303, "Mundo Digital", "10/08", "Beatriz Lima", 2024, 4, "TechEdit", "Inovação");

        listaRevistas lista = new listaRevistas();

        lista.adicionaRevista(r1);
        lista.adicionaRevista(r2);
        lista.adicionaRevista(r3);

        lista.mostrarRevistas();

        Scanner input = new Scanner(System.in);
        System.out.println("\nDigite o assunto da revista: ");
        String assunto = input.nextLine();

        Revista revista = lista.consultaRevistaPorAssunto(assunto);
        if (revista != null) {
            System.out.println("A revista com o assunto [" + assunto + "] foi encontrada na lista e seu título é [" + revista.getNome() + "]");
        } else {
            System.out.println("Não foi possível localizar uma revista com esse assunto!");
        }
    }
}