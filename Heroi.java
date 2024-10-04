public class Heroi {
  
  private String nome;
  private int idade;
  private String tipo;

  public Heroi(String nome, int idade, String tipo) {
     this.nome = nome;
     this.idade = idade;
     this.tipo = tipo;
  }

  public void atacar() {
    String ataque;	
   
    switch(tipo.toLowerCase()) { // coloca em letras minúsculas o tipo para garantir que irá encontrar
    	case "mago":
           ataque = "magia";
   	   break;
	case "guerreiro":
	   ataque = "espada";
	   break;
	case "monge":
	   ataque = "artes marciais";
	   break;
	case "ninja":
	   ataque = "shuriken";
	   break;
	default:
	   ataque = "Ataque desconhecido";
	   break;	   
    }
    
    System.out.println("O " + tipo + " atacou usando " + ataque);
  }  

  public static void main(String[] args) {
    Heroi mago = new Heroi("Alakazam", 83, "mago");
    Heroi guerreiro = new Heroi("Knight", 47, "guerreiro");
    Heroi monge = new Heroi("Shaolin", 62, "monge");
    Heroi ninja = new Heroi("Ling", 37, "ninja");

    mago.atacar();
    guerreiro.atacar();
    monge.atacar();
    ninja.atacar();
  }
}
