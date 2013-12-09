package br.com.ia;

/**
 * 
 * @author anderson.gomes
 *
 */

public class No {
	
	No casoSim;
	No casoNao;
	int id;
	String valor;
	
	No(int id){
		this.id = id;
		this.casoSim=null;    
        this.casoNao=null;
        this.valor=null;
	}
	
	public No(String valor, int id){
		this.valor = valor;
		this.id = id;
	}
	
}
