import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		BDSimulado bds = new BDSimulado();

		// Recupera a lista de ONGS e Postos
		ArrayList<ONG> ongs = bds.getOngs();

		// Adiciona Postos as ONGS
		bds.addPostosONG("fome", 112, 2312312, true, false, true);
		bds.addPostosONG("QueroComer", 111, 50000, false, false, false);
		bds.addPostosONG("QueroComer", 112, 3221, true, true, false);
		bds.addPostosONG("QueroComer", 113, 83921, true, true, false);
		bds.addPostosONG("QueroComer", 114, 33221, false, true, false);
		bds.addPostosONG("SemFome", 111, 22122, true, true, true);
		bds.addPostosONG("Refeicao", 111, 553312, false, false, false);
		bds.addPostosONG("MataFome", 111, 221231, false, false, false);
		bds.addPostosONG("fomeZero", 111, 882912, true, false, false);
		bds.addPostosONG("ComerDeNovo", 111, 21231, true, true, false);

		for (int i = 0; i < ongs.size(); i++) {
			System.out.println(ongs.get(i));

		}

		System.out.println("-------------------------------\n");

		ONG ong = bds.getONGporNome("QueroComer");
		System.out.println(ong);

	}

}
