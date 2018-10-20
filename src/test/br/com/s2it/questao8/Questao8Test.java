package test.br.com.s2it.questao8;

import org.junit.Assert;
import org.junit.Test;

import main.br.com.s2it.questao8.Questao8;

public class Questao8Test {

	@Test
	 public void CriarCMaiorUmMilhao() {
        int c = -1;
        Integer a = 10256;
        Integer b = 512;       
        Questao8 resultado = new Questao8();
        Assert.assertEquals(c, resultado.criarC(a, b));
    }


    @Test
    public void CriarCMenorUmMilhao() {
    	int c = 150122;
        Integer a = 102;
        Integer b = 512;
        Questao8 resultado = new Questao8();
        Assert.assertEquals(c, resultado.criarC(a, b));

    }

}
