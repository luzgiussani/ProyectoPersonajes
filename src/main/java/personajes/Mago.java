package personajes;

public class Mago extends Personaje {
    private String magia;

    // Constructor
    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }

    // Getter para magia
    public String getMagia() {
        return magia;
    }

    // Setter para magia
    public void setMagia(String magia) {
        this.magia = magia;
    }

    // Implementación del método entrenar
    @Override
    public void entrenar() {
        // No hace nada
    }
}
