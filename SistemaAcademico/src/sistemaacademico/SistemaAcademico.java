/*
 * Sistema de Gestão Acadêmica 
 */
package sistemaacademico;

import java.util.ArrayList;

/**
 * @author Wanderley de Souza Alencar
 */
public class SistemaAcademico {
        //
        // Aqui estão sendo declarados objetos das principais classes.
        // Evidentemente cada equipe utilizará somente alguns deles para 
        // implementar sua porção do sistema. 
        //
        // Todos os objetos foram declarados como sendo ArrayList e, portanto, 
        // ao finalizar uma execução da aplicação todos os dados serão perdidos
        //
        // 
        // Observação: Exclua as declarações que não necessitar...
        //
        //
       
        private static ArrayList <Turmas>  turmasCad;
        // Atributos auxiliares...
        //
     
        
        
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
    	
    	try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
    	
    	Teste window = new Teste();
		window.getFrmTurmas().setVisible(true);
     
       
  
    }
    
}
