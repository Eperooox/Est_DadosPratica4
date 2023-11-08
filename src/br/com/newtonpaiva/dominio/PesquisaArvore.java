package br.com.newtonpaiva.dominio;

public class PesquisaArvore
{
    public static void pesquisaInOrdem(No node)
    {
        if (node != null)
        {
            pesquisaInOrdem(node.esquerda);
            System.out.print(node.valor + " ");
            pesquisaInOrdem(node.direita);
        }
    }

    public static void pesquisaPreOrdem(No node)
    {
        if (node != null)
        {
            System.out.print(node.valor + " ");
            pesquisaPreOrdem(node.esquerda);
            pesquisaPreOrdem(node.direita);
        }
    }

    public static void pesquisaPosOrdem(No node)
    {
        if (node != null)
        {
            pesquisaPosOrdem(node.esquerda);
            pesquisaPosOrdem(node.direita);
            System.out.print(node.valor + " ");
        }
    }
}

