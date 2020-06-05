package idwall.desafio.string;

/**
 * Created by Edison Maciel on 04/06/2020.
 */
public abstract class StringFormatter {

	private String texto;
	private int caracteresPorLinha;
	private boolean justificar;

    public StringFormatter() {
        this.texto = texto;
    	this.caracteresPorLinha = caracteresPorLinha;
    	this.justificar = justificar;
        
    }

    /**
     * It receives a text and should return it formatted
     *
     * @param text
     * @return
     */
    
	public String justificarTexto(String texto, int caracteresPorLinha, boolean justificar) {
		return texto;
		
	}
}
