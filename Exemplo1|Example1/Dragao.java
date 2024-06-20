// Criação da classe Dragao e herda a classe Personagem
class Dragao extends Personagem {
  // Atributos da classe Dragao
  int peso;
  int atividade;
  boolean ocupado;

  // Construtor da classe Dragao
  public Dragao(int ID) {
    super(ID);
    this.tipo = "dragao";
    this.nome = "indefinido";
    this.atividade = 0;
    this.ocupado = false;
  }

  // Sobrecarga do construtor da classe Dragao
  public Dragao(int ID, String nome) {
    super(ID);
    this.tipo = "dragao";
    this.nome = nome;
    this.atividade = 0;
    this.ocupado = false;
  }

  // Habilidade "Atuar" do Dragao
  public void atuar(int codigo) {
    this.imprimeDados();
    System.out.println("Vai executar uma atividade do tipo " + codigo);
  }
}
