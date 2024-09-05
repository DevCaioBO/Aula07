package principal;

//import entidade.Animal;
import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		Vaca vaca = new Vaca();
		
		System.out.println(cachorro.emitirSom());
		System.out.println(gato.emitirSom());
		System.out.println(vaca.emitirSom());

	}

}
