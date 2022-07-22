
public class Casa {

	
	private String corDoTelhado;
	
	public String getCorDoTelhado() {
		return corDoTelhado;
	}
		

	public void setCorDoTelhado(String cor) {
		if (cor.equals("preto") 
				|| cor.equals("cinza") 
				|| cor.equals("vermelho") 
				|| cor.equals("azul")
				|| cor.equals("verde") 
				|| cor.equals("laranja") 
				|| cor.equals("amarelo") 
				|| cor.equals("branco")) {
			corDoTelhado = cor;
			System.out.println("A cor escolhida por você para pintar o telhado foi " + cor);
			
		} else {
			
			System.out.println("Cor Inválida!");
		}		
	}
	
	public boolean validade(String cor){
		
		if(cor.equals("preto")
		        || cor.equals("cinza") 
				|| cor.equals("vermelho") 
				|| cor.equals("azul")
				|| cor.equals("verde") 
				|| cor.equals("laranja") 
				|| cor.equals("amarelo") 
				|| cor.equals("branco")) {
			
			return true;
						
		}else{
						
			return false;	
}
		
}
	
}
	

