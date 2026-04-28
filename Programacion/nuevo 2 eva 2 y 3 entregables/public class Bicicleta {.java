public class Bicicleta {
    private String nombre;
    private String tipo;
    private double peso;
    private String color;
    private double precioDeVenta;
    private double costeDeCompra;

    public Bicicleta(String nombre, String tipo, double peso, String color,
                     double precioDeVenta, double costeDeCompra) {
        this.nombre = nombre;
        this.tipo = tipo;
        setPeso(peso); // Ahora lanzará error si es inválido
        this.color = color;
        this.precioDeVenta = precioDeVenta;
        this.costeDeCompra = costeDeCompra;
    }

    public double calcularBeneficio() {
        return this.precioDeVenta - this.costeDeCompra;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            // Esto detiene la creación del objeto si el dato es basura
            throw new IllegalArgumentException("Error: El peso (" + peso + ") debe ser mayor a 0.");
        }
    }

    // Recuerda agregar los setters para precioDeVenta y costeDeCompra 
    // validando que no sean negativos.

    @Override
    public String toString() {
        return String.format("Bicicleta: %s [%s] - Color: %s - Precio: %.2f€ - Beneficio: %.2f€", 
                             nombre, tipo, color, precioDeVenta, calcularBeneficio());
    }
}