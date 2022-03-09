
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
				
		if (idade >= 18 || quantidadePessoas >=2) {	
			System.out.println("você tem mais de 18 anos");
			System.out.println("seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}

}