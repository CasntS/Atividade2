//Criação da classe Personagem
class Personagem {
  // Atributos da classe Personagem
  String nome;
  String tipo;
  int nivel;
  protected int id;

  // Construtor da classe Personagem
  public Personagem(int ID) {
    this.id = ID;
    this.nome = "indefinido";
    this.tipo = "indefinido";
    this.nivel = 0;
  }

  // Imprime os dados do Personagem na tela
  public void imprimeDados() {
    System.out.println("Personagem do tipo " + this.tipo + " com ID = " + this.id);
    System.out.println("Possui nivel " + this.nivel + " e se chama " + this.nome);
  }
}
