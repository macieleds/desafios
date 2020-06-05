package idwall.desafio.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edison Maciel on 04/06/2020.
 */
public class IdwallFormatter extends StringFormatter {

    /**
     * Should format as described in the challenge
     *
     * @param text
     * @return
     */
	
    @Override
    public String justificarTexto(String texto, int caracteresPorLinha, boolean justificar) {
    	String[] textoQuebra = texto.replaceAll("\\s+", " ").split("\\s+");
		List<String> linha = new ArrayList<String>();

		for (int i = 0; i < textoQuebra.length; i++) {
			String textoLinha = textoQuebra[i];
			int caracteresLinha = linha.stream().mapToInt(str -> str.length()).sum() + linha.size() - 1;
			if (caracteresLinha + 1 + textoLinha.length() >= caracteresPorLinha) {
				int resto = caracteresPorLinha - caracteresLinha;

				if (justificar)
					for (int u = 0; u < resto; u++) {
						int index = (linha.size() > 1) ? u % (linha.size() - 1) : u % (linha.size());
						linha.set(index, linha.get(index).concat(" "));
					}
				System.out.println(String.join(" ", linha));
				linha.clear();
			}
			linha.add(textoLinha);
		}

		if (linha.size() > 0) {
			int caracteresLinha = linha.stream().mapToInt(str -> str.length()).sum() + linha.size() - 1;
			int resto = caracteresPorLinha - caracteresLinha;
			if (justificar)
				for (int u = 0; u < resto; u++) {
					int index = (linha.size() > 1) ? u % (linha.size() - 1) : u % (linha.size());
					linha.set(index, linha.get(index).concat(" "));
				}
			System.out.println(String.join(" ", linha));
		}
		return texto;
    }

}
