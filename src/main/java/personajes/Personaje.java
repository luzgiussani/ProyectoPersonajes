package personajes;

public abstract class Personaje {
    private int salud;

    // Constructor
    public Personaje(int salud) {
        this.salud = salud;
    }

    // Getter para salud
    public int getSalud() {
        return salud;
    }

    // Setter para salud
    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Método abstracto que debe ser implementado por las subclases
    public abstract void entrenar();
}
