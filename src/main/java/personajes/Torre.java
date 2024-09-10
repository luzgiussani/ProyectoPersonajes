package personajes;

public class Torre extends Personaje {
    private int nivel;

    // Constructor
    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    // Getter para nivel
    public int getNivel() {
        return nivel;
    }

    // Setter para nivel
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Implementación del método entrenar
    @Override
    public void entrenar() {
        this.nivel += 1;
    }
}
