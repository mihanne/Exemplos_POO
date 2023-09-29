package questao3;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao,
                                String endereco, String dataInicio, String dataFIm, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFIm);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public boolean validaProjeto() {
        if (getDataFIm() == "")
            return true;
        else
            return false;
    }

    @Override
    public String imprimeProjeto() {
        return "Nome: " + getNomeProjeto()
                + "\n Descrição: " + getDescricao()
                + "\n Data inicio: " + getDataInicio()
                + "\n Data fim: " + getDataFIm()
                + "\n Descrição ALimento: " + getDescAlimento()
                + "\n Quantidade: " + getQtde();

    }
}
