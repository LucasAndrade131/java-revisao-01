import java.util.ArrayList;

public class Principal {

	
	public static void main(String[] args) {
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		
		
		Pessoa pessoa1 = new Pessoa("Akemi", 18);
		Pessoa pessoa2 = new Pessoa("Rodrigo", 30);
		Pessoa pessoa3 = new Pessoa("Caroline", 35);

		listaPessoas.add(pessoa1);
		listaPessoas.add(pessoa2);
		listaPessoas.add(pessoa3);
		
		
		System.out.println("Tamanho da lista: " + listaPessoas.size());
		
		System.out.println("Primeira Pessoa: " + listaPessoas.get(0));
		
		
		System.out.println("Lista de Pessoas:");
		for (Pessoa pessoa : listaPessoas) {
		    System.out.println(pessoa);
		}
	}
	
}
