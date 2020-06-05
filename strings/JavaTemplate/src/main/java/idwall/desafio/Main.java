package idwall.desafio;

import idwall.desafio.string.IdwallFormatter;
import idwall.desafio.string.StringFormatter;

/**
 * Created by Edison Maciel on 04/06/2020.
 */
public class Main {
	

    private static final String DEFAULT_INPUT_TEXT = "In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.\r\n" + 
    		"\r\n" + 
    		"And God said, \"Let there be light,\" and there was light. God saw that the light was good, and he separated the light from the darkness. God called the light \"day,\" and the darkness he called \"night.\" And there was evening, and there was morning - the first day.";
    private static final int PARAM_VALUE = 40;
    private static final boolean JUSTIFY_VALUE = true;
    
    public static void main(String[] args) {
    	
        String text = DEFAULT_INPUT_TEXT;
        int param = PARAM_VALUE;
        boolean justify = JUSTIFY_VALUE;

        // Print input data
        System.out.println("Inputs: " + text + "\n");

        // Run IdwallFormatter
        final StringFormatter sf = new IdwallFormatter();
        sf.justificarTexto(text, param, justify);

    }
}
