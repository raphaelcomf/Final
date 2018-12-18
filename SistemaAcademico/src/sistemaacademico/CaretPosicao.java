package sistemaacademico;

/**
*
* @author Caio Santos, Guilherme Estevam, Gustavo Nunes, Kevin Moura, Natanel Alves, Rafael Diniz.
* Nome: CaretPosicao
* Objetivo: "Setar" o cursor no ínicio para digitação nas TextFields
*/
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.text.JTextComponent;

public class CaretPosicao extends FocusAdapter {
	
	public void focusGained(FocusEvent e) {
		 JTextComponent comp = (JTextComponent) e.getSource();           
         comp.setCaretPosition(0);
	}

}
