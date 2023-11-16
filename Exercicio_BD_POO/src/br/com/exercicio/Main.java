package br.com.exercicio;

import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        //inserir dados
        String id_isbn, nm_titulo,cod_excluir,buscaTitulo ;
        int id_categoria, id_editora;
        Double vl_preco, buscaValor;

        id_isbn = JOptionPane.showInputDialog("Digite ISBN");
        nm_titulo = JOptionPane.showInputDialog("Digite titulo");
        id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da categoria"));
        id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo da editora"));
        vl_preco =  Double.parseDouble(JOptionPane.showInputDialog("Digite preco do livro"));
        Inserir inserir = new Inserir(id_isbn,id_categoria, id_editora, nm_titulo, vl_preco);

        //Exclduir
        cod_excluir = JOptionPane.showInputDialog("Digite ISBN para Excluir");
        Excluir excluir = new Excluir(cod_excluir);


        //Consulta titulo
        Consulta busca = new Consulta();
        buscaTitulo = JOptionPane.showInputDialog("Digite Titutlo para buscar");
        busca.BuscaTitulo(buscaTitulo);

        //Consulta por valor
        buscaValor =Double.parseDouble( JOptionPane.showInputDialog("Digite Titutlo para buscar"));
        busca.BuscaValor(buscaValor);

    }


}
