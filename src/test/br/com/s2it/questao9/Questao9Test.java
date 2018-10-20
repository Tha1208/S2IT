package test.br.com.s2it.questao9;

import org.junit.Assert;
import org.junit.Test;

import main.br.com.s2it.questao9.BinaryTree;
import main.br.com.s2it.questao9.Questao9;

public class Questao9Test {

	@Test
	public void test() {
		int resultado1 = 10;
		int resultado2 = 9;
		BinaryTree tree = new BinaryTree();
		tree.setValor(1); 
		BinaryTree noA = new BinaryTree();
		noA.setValor(7);
		BinaryTree noB = new BinaryTree();
		noB.setValor(2);
		
		tree.setRight(noA);
		tree.setLeft(noB);
		
        Questao9 questao9 = new Questao9(tree);
        Assert.assertEquals(resultado1, questao9.somaNosERaiz());
        Assert.assertEquals(resultado2, questao9.somaSomenteNosSubsequentes());

	}

}
