/*
 * Sistema de Gestão Acadêmica 

 */
package sistemaacademico;

import java.util.ArrayList;

/**
 * @author Caio Santos, Guilherme Estevam, Gustavo Nunes, Kevin Moura, Natanel Alves, Rafael Diniz.
 * Nome: SistemaAcademico
 * Objetivo: Responsável por gerar o Sistema Academico como um todo
 */
public class SistemaAcademico {
      
    
    public static void main(String[] args) { 
    	
    	try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
    	
    	GUI window = new GUI();
		window.getFrmTurmas().setVisible(true);
     
       
  
    }
    
}
