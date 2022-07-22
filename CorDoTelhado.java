import java.util.Scanner;
public class CorDoTelhado {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite a cor do telhado que você deseja pintar: ");
	String corDoTelhado = scan.nextLine();	  
	    
	   Casa casa = new Casa();
	   
	   casa.setCorDoTelhado(corDoTelhado);
	   casa.validade(corDoTelhado);
	   System.out.println(casa.validade(corDoTelhado));
	       	    
	    
	   
	    
	}
}

