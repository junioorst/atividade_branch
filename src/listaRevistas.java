import java.util.ArrayList;

public class listaRevistas {
    private ArrayList<Revista> listaRevistas;
    private int index;

    public listaRevistas() {
        this.listaRevistas = new ArrayList<>();
        this.index = 0;
    }

    public boolean adicionaRevista(Revista revista) {
        Revista aux = consultaRevistaPorNome(revista.getNome());
        if (aux != null) {
            return false;
        }
        return listaRevistas.add(revista);
    }

    public Revista consultaRevistaPorNome(String nome) {
        for (int i = 0; i < listaRevistas.size(); i++) {
            Revista aux = listaRevistas.get(i);
            if (aux.getNome().equalsIgnoreCase(nome))
                return aux;
        }
        return null;
    }

    public Revista consultaRevistaPorAssunto(String assunto) {
        for (int i = 0; i < listaRevistas.size(); i++) {
            Revista aux = listaRevistas.get(i);
            if (aux.getAssunto().equalsIgnoreCase(assunto))
                return aux;
        }
        return null;
    }

    public void mostrarRevistas () {
        System.out.println("REVISTAS CADASTRADAS:");
        for (int i = 0; i < listaRevistas.size(); i++) {
            Revista aux = listaRevistas.get(i);
            System.out.println(aux.getNome() + " - " + aux.getAutor() + " - " + aux.getAnoPublicacao());
        }
    }


}
