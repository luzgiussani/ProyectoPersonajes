package personajes;

public class Espadachin extends Personaje {
    private int ataque;

    // Constructor
    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    // Getter para ataque
    public int getAtaque() {
        return ataque;
    }

    // Setter para ataque
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    // Implementación del método entrenar
    @Override
    public void entrenar() {
        this.ataque += 10;
    }
}
