package main.br.com.s2it.questao9;


public class Questao9 {
	
	private BinaryTree tree;

    public Questao9(BinaryTree tree) {
        this.tree = tree;
    }

    //Soma a raiz com seus nos subsequentes
    public int somaNosERaiz() {
        return soma(tree);
    }
    
    //Soma somente os nos subsequentes sem contar a raiz
    public int somaSomenteNosSubsequentes() {
    	int raiz = tree.getValor();
        return soma(tree) - raiz;
    }
	
	
    //Metodo recursivo para soma da arvore binaria
	private int soma(BinaryTree tree) {

        if (tree == null) {
            return 0;
        }

        return tree.getValor() + soma(tree.getLeft()) + soma(tree.getRight());
    }
	

}
