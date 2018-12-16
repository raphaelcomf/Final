package sistemaacademico;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Turmas
* Objetivo...: Representar uma turma da instituição de ensino.
* Observacoes:
*/
public class Turmas extends Coisa {
    int                             capacidade;
    int                             ano;
    int                             semestre;
    int                             curso;
    static ArrayList <Turmas>  turmasCad = new ArrayList<>();

  
  
    public Turmas (int curso, int semestre, int codigo, String nomeCompleto, String nomeAbreviado, int ano, int capacidade) {
      this.codigo = codigo;
      this.nomeAbreviado = nomeAbreviado;
      this.nomeCompleto = nomeCompleto;
      this.capacidade = capacidade;
      this.ano = ano;
      this.semestre = semestre;
      this.curso = curso;
    }
    

    public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public int getSemestre() {
    return semestre;
  }

  public void setSemestre(int semestre) {
    this.semestre = semestre;
  }

  public int getCurso() {
    return curso;
  }

  public void setCurso(int curso) {
    this.curso = curso;
  }


  public ArrayList<Turmas> getTurmasCad() {
    return turmasCad;
  }
  
  public void setTurmasCad(ArrayList<Turmas> turmasCad) {
    this.turmasCad = turmasCad;
  }
  
    public void addTurmas (Turmas T){
        turmasCad.add(T);
    }
  
  
  
  
  
  
  
  @Override
    public void cadastrar() {
    // Verificando se o codigo e unico.
     int i;
    
     if (turmasCad.size() == 0)  {
       // Se ha 0 turmas cadastradas nao ha necessidade de verificar.
       turmasCad.add( this );
     }
     else {
     turmasCad.add( this );
     int aux = turmasCad.size();
    for (i = 0; i < aux - 1; i++ ) {
      if (turmasCad.get( i ).getCodigo() == turmasCad.get( aux -1 ).getCodigo()) {
        JOptionPane.showMessageDialog( null, "Codigo ja utilizado." );
        turmasCad.remove( aux - 1 );
        return;
      }
    }
     }
    }
  
   public int retornar () {
     return turmasCad.size();
   }

    @Override
    public int alterar(int codigo) {
       int i;
       if (turmasCad.size() == 1) {
         return 1;
       }
       else {   
       for (i = 0; i < turmasCad.size(); i++ ) {
         if (turmasCad.get( i ).getCodigo() == codigo) {
           JOptionPane.showMessageDialog( null, "Codigo ja utilizado." );
           return 0;
         }
       }
      }
       return 1;
    }

    @Override
    public void consultar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}