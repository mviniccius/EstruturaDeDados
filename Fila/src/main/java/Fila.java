import java.util.Scanner;

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
class FilaEstatica{
    private Inteiro[] fila;
    private int frente;
    private int tras;
    private int tamanho;
    
    //construtor da fila
    public FilaEstatica(int tamanho){
        fila = new Inteiro[tamanho];
        frente = 0;
        tras = 0;
        this.tamanho = tamanho;
    }
    
    public boolean filaVazia(){
        boolean resp;
        
        if(frente == tras){
            resp = true;
        }else
            resp = false;
        
        return resp;
    }
    
    
    public boolean filaCheia(){
        boolean resp;
        
        resp = ((tras + 1) % tamanho) == (frente % tamanho);
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

public class Fila{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int menu;
        
        
        do{
            System.out.println("Escolha"); 
            System.out.println("____________");
            
            menu = scanner.nextInt();
            
            switch(menu){
                case 0 -> {
                }
                           
                
                case 1 -> System.out.println("Entrou 1");
                default -> System.out.println("Opcao ivalida");
        }
            
        }while(menu != 0);
        
        System.out.println("saiu");
        
    }
}
