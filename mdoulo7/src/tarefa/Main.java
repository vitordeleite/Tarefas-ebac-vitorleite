package tarefa;
/**
 * teste dos paramentros da classe Cliente 
 */
public class Main {
	public static void main(String[]args) {
		Cliente clie = new Cliente();
		
	clie.setNome("marcos");
	clie.setTelefone("31000000");
	System.out.println("Seu nome é:");
	System.out.println(clie.getNome());
	System.out.println("e seu telefone:");
	System.out.println(clie.getTelefone());
				
	}

}
