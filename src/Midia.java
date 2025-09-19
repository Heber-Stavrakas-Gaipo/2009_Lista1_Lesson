public class Midia {
  public String tipo;
  public String descricao;
  public float valor;
  public boolean status;

  public Midia() {
    tipo = "";
    descricao = "";
    valor = 0.0f;
    status = true;
  }

  public Midia(String tipo, String descricao, float valor) {
    this.tipo = tipo;
    this.descricao = descricao;
    this.valor = valor;
  }

  public void alterarStatus() {
    if (status == true) {
      status = false;
    } else {
      status = true;
    }
  }

  public String retornaDados() {
    return ("Tipo: " + tipo + "\nDescricao: " + descricao + "\nValor: " + valor + "\nStatus: " + (status ? "Midia emprestada" : "Midia disponivel" + "\n"));
  }
}
