import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BDSimulado bds = new BDSimulado();

		// Recupera a lista de ONGS e Postos
		ArrayList<ONG> ongs = bds.getONG();

		for (int i = 0; i < ongs.size(); i++) {
			System.out.println(ongs.get(i));

		}

	}

}
