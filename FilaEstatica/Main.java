//item para guardar dentro da Fila

class Inteiro{
	
	private int valor;
	
	public Inteiro(int valor) {
		this.valor = valor;
	}
	public Inteiro() {
		valor = 0;
	}
	
	
	public void imprimir() {
		System.out.println("Valor -> " + valor);
	}
	
}

//criando minha fila estatica
class Fila{
	private Inteiro[] fila; //fila de inteiro
	private int frente;
	private int tras;
	private int tamanho;
	
	public Fila(int tamanho) {
		fila = new Inteiro[tamanho];
		frente = 0;
		tras = 0;
		this.tamanho = tamanho;
	}
	
	public boolean filaVazia(){
		boolean resp;
		
		if(frente == tras) {
			resp = true;
		}else
			resp = false;
		
		return resp;
	}
	
	public boolean filaCheia() {
		boolean resp;
		
		if(((tras + 1) % tamanho) == (frente % tamanho)) { //metodo usado para fazer uma fila circular com isso voce fica com uma posicao a menos no vetor
			resp = true;
		}else
			resp = false;
		
		return resp;		
	
	}
	
	public void enfileirar(Inteiro novo) throws Exception{
		int posicao;
		
		if(!filaCheia()) {
			posicao = tras % tamanho;
			fila[posicao] = novo;
			tras++;
		}else
			throw new Exception("Fila cheia");
			
	}
	
	public Inteiro desenfileirar()throws Exception{
		
		Inteiro saiu;
		int posicao;
		
		if(! filaVazia()) {
			posicao = frente % tamanho;
			saiu = fila[posicao];
			frente++;
			return saiu;
		}else
			throw new Exception("Fila vazia");
		
	}
	
	public void imprimir() throws Exception{
		
		int posicao;
		int i;
		
		
		if(! filaVazia()) {
			System.out.println("Fila atual");
			
			for(i = frente; i < tras; i++) {
				posicao = i % tamanho;
				System.out.print("Posicao: " + posicao + ": ");
				fila[posicao].imprimir();
			}
		}
	}
}

public class Main {

	public static void main(String[] args) {
		
		Inteiro num;
		num = new Inteiro(1);
		
		num.imprimir();
	
	}

}



