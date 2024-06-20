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
