package sistemaacademico;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.text.JTextComponent;

public class CaretPosicao extends FocusAdapter {
	
	public void focusGained(FocusEvent e) {
		 JTextComponent comp = (JTextComponent) e.getSource();           
         comp.setCaretPosition(0);
	}

}
