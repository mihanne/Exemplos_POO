package questao3;

public abstract class Projeto {
    private String nomeProjeto;
    private String descricao;
    private String endereco;
    private String dataInicio;
    private String dataFIm;

    public Projeto(String nomeProjeto,
                   String descricao, String endereco,
                   String dataInicio, String dataFIm) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataFIm = dataFIm;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFIm() {
        return dataFIm;
    }

    public void setDataFIm(String dataFIm) {
        this.dataFIm = dataFIm;
    }

    public abstract boolean validaProjeto();

    public abstract String imprimeProjeto();
}
