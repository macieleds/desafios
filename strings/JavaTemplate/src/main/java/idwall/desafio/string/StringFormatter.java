package idwall.desafio.string;

/**
 * Created by Edison Maciel on 04/06/2020.
 */
public abstract class StringFormatter {

	public String texto;
	private int limit = 40;
	private boolean justificar;

    public StringFormatter() {
        this.texto = texto;
    	this.limit = 40;
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
