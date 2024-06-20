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

// Classe principal Main
public class Main {
  public static void main(String[] args) {
    // Saída de dados e execução do código inteiro
    System.out.println("Atividade de produção - Cassio Santos Lima\n");

    // Criação do Personagem: Personagem e execução
    System.out.println("Criando o Personagem...");
    Personagem p = new Personagem(1);
    p.imprimeDados();
    System.out.println("Personagem Criado!\n");

    // Criação do Personagem: Dragao e execução
    System.out.println("Criando o Dragão Hades...");
    Dragao d1 = new Dragao(2, "Hades");
    d1.atuar(0);
    System.out.println("Personagem Criado!\n");

    // Criação do Personagem: Paladino e execução
    System.out.println("Criando o Paladino Manuel...");
    Paladino p1 = new Paladino(3, "Manuel", 50, 100);
    p1.cura();
    System.out.println("Personagem Criado!\n");

    // Saída Final
    System.out.println("Fim do código!");
  }
}
