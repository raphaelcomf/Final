package sistemaacademico;
/**
 *
 * @author Caio Santos, Guilherme Estevam, Gustavo Nunes, Kevin Moura, Natanel Alves, Rafael Diniz.
 * Nome: Coisa
 * Objetivo: Representa um objeto inanimado ("coisa")
 */

public abstract class Coisa {
    int                             codigo;
    String                          nomeAbreviado;
    String                          nomeCompleto;
    
    public abstract void cadastrar();
    public abstract int alterar (int codigo);
    public abstract void consultar (int codigo);
    public abstract void excluir (int codigo);
    
  public int getCodigo() {
    return codigo;
  }
  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }
  public String getNomeAbreviado() {
    return nomeAbreviado;
  }
  public void setNomeAbreviado(String nomeAbreviado) {
    this.nomeAbreviado = nomeAbreviado;
  }
  public String getNomeCompleto() {
    return nomeCompleto;
  }
  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }
}
    