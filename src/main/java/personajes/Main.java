package personajes;

public class Main {
    public static void main(String[] args) {
        Espadachin espadachin = new Espadachin(100, 50);
        Torre torre = new Torre(200, 10);
        Mago mago = new Mago(150, "Fuego");

        System.out.println("Espadachin - Salud: " + espadachin.getSalud() + ", Ataque: " + espadachin.getAtaque());
        espadachin.entrenar();
        System.out.println("Espadachin después de entrenar - Ataque: " + espadachin.getAtaque());

        System.out.println("Torre - Salud: " + torre.getSalud() + ", Nivel: " + torre.getNivel());
        torre.entrenar();
        System.out.println("Torre después de entrenar - Nivel: " + torre.getNivel());

        System.out.println("Mago - Salud: " + mago.getSalud() + ", Magia: " + mago.getMagia());
        mago.entrenar(); // No hace nada
    }
}
