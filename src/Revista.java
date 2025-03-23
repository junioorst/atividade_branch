public class Revista {
    private int id;
    private String nome;
    private String dataAquisicao;
    private String autor;
    private int anoPublicacao;
    private int volume;
    private String editora;
    private String assunto;

    public Revista(int id, String nome, String dataAquisicao, String autor, int anoPublicacao, int volume, String editora, String assunto) {
        this.id = id;
        this.nome = nome;
        this.dataAquisicao = dataAquisicao;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.volume = volume;
        this.editora = editora;
        this.assunto = assunto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }
}