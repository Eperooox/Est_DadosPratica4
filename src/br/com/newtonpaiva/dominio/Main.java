package br.com.newtonpaiva.dominio;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);
        arvore.inserir(3);
        arvore.inserir(7);
        arvore.inserir(12);

        System.out.println("Pesquisa In-Ordem:");
        PesquisaArvore.pesquisaInOrdem(arvore.getRaiz());

        System.out.println("\nPesquisa Pré-Ordem:");
        PesquisaArvore.pesquisaPreOrdem(arvore.getRaiz());

        System.out.println("\nPesquisa Pós-Ordem:");
        PesquisaArvore.pesquisaPosOrdem(arvore.getRaiz());

        int valorProcurado = 7;
        boolean encontrado = arvore.pesquisar(valorProcurado);
        System.out.println("Valor " + valorProcurado + " encontrado na árvore: " + encontrado);
        System.out.println("raiz " + arvore.getRaiz().valor);
    }
}