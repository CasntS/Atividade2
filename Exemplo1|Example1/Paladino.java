// Criação da classe Paladino e herda a classe Personagem
class Paladino extends Personagem {
  // Atributos da classe Paladino
  int cura;
  int mana;

  // Construtor da classe Paladino compactada
  public Paladino(int ID, String nome, int cura, int mana) {
    super(ID);
    this.tipo = "paladino";
    this.nome = nome;
    this.cura = cura;
    this.mana = mana;
  }

  // Habilidade "Curar" do Paladino
  public void cura() {
    this.imprimeDados();
    System.out.println(
        "O Paladino vai curar-se em " + this.cura + " pontos de vida, gastando " + this.mana + " pontos de mana.");
  }
}
