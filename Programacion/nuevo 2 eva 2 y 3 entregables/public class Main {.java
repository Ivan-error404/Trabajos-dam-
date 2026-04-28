public class Main {
    public static void main(String[] args) {

        // Crear 3 bicicletas nuevas
        Bicicleta bici1 = new Bicicleta("Canyon C11 Ultimate", "Ruta", 7.5, "Negra", 3500, 1500);
        Bicicleta bici2 = new Bicicleta("Orbea MX40", "Montaña", 14.2, "Azul", 650, 300);
        Bicicleta bici3 = new Bicicleta("Lombardo E-Motion", "Eléctrica", 22.8, "Roja", 1800, 900);

        // Mostrar los valores de las 3 bicicletas
        System.out.println("Bicicletas creadas:");
        System.out.println(bici1);
        System.out.println(bici2);
        System.out.println(bici3);

        // Cambiar el nombre de la 1ª bicicleta
        bici1.setNombre("Canyon AeroSpeed Pro");

        // Mostrar el nuevo nombre de la 1ª bicicleta
        System.out.println("\nNuevo nombre de la primera bicicleta:");
        System.out.println(bici1);

        // Mostrar el peso de la 2ª bicicleta
        System.out.println("\nPeso de la segunda bicicleta:");
        System.out.println(bici2.getPeso() + " kg");
    }
}