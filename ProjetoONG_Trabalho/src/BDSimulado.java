import java.util.ArrayList;

public class BDSimulado {

	ArrayList<Posto> postos;
	ArrayList<ONG> ongs;

	public BDSimulado() {

		// Instanciar atributo ONG
		this.ongs = new ArrayList<>();

		// Instanciar objetos
		ONG ongs1 = new ONG("fomeZero", "Claudio", "Pernambuco", postos);
		ONG ongs2 = new ONG("ComerDeNovo", "Mauro", "São Paulo", postos);
		ONG ongs3 = new ONG("MataFome", "Rodrigo", "Recife", postos);
		ONG ongs4 = new ONG("Refeiçao", "Carlos", "Ceara", postos);
		ONG ongs5 = new ONG("SemFome", "Leandro", "Parana", postos);
		ONG ongs6 = new ONG("QueroComer", "Pedro", "Minas Gerais", postos);

		// colocando ONGs na Lista
		this.ongs.add(ongs1);
		this.ongs.add(ongs2);
		this.ongs.add(ongs3);
		this.ongs.add(ongs4);
		this.ongs.add(ongs5);
		this.ongs.add(ongs6);

	}

	// Questão 2: Retorna Todas as informações de uma ONG apartir do nome
	public ONG getInfoONG(String nomeONG) {
		ONG resultado = null;

		// Percorrer Lista de ONGs
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome().equals(nomeONG)) {
				resultado = this.ongs.get(i);
			}
		}
		return resultado;
	}

	// Questão 3: Retorna o numero de ONG's que existe em determinado
	public int getNumONGPorEstado(String estado) {
		int resultado = 0;
		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getEstado().equals(estado)) {
				resultado += 1;
			}
		}
		return resultado;
	}

	// Questão 4: capacidade de armazenamento de alimentos acima de 'x'
	public ArrayList<Posto> getPostosPorCapacidade(int x) {

		ArrayList<Posto> resultado = new ArrayList<>();
		for (int i = 0; i < postos.size(); i++) {
			if (this.postos.get(i).getCapacidade() > x) {
				resultado.add(this.postos.get(i));
			}
		}
		return resultado;
	}

	// Questão 5: retorna o código dos postos que atendem vegetarianos
	public ArrayList<Posto> getPostosVegetarianos() {

		ArrayList<Posto> resultado = new ArrayList<>();

		for (int i = 0; i < this.postos.size(); i++) {
			if (this.postos.get(i).isVegetariano() == true) {
				resultado.add(this.postos.get(i));
			}
		}
		return resultado;
	}

	public ONG getONGporNome(String nome) {
		ONG resultado = null;

		for (int i = 0; i < this.ongs.size(); i++) {
			if (this.ongs.get(i).getNome().equals(nome)) {
				resultado = this.ongs.get(i);
			}
		}
		return resultado;
	}

}
