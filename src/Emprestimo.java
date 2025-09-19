public class Emprestimo {
  public String data;
  public String cliente;

  public Midia[] midias;

  public Emprestimo(){
    data = "";
    cliente = "";
    midias = new Midia[5];
  }

  public void impressaoDados(){
    System.out.println("--- Dados do Emprestimo ---");
    System.out.println("Data: " + data);
    System.out.println("Cliente: " + cliente);
    for(Midia midia : midias){
      if (midia!=null) {
        System.out.println(midia.retornaDados());
      }
    }
  }
}
