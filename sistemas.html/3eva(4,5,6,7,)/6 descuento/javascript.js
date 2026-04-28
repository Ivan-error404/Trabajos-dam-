function calcularDescuento() {
    let descuento = 0.20;
    let precioOriginal = parseFloat(prompt("Ingrese el precio original:"));

    let precioDescuento = precioOriginal * (1 - descuento);

    alert("El precio con descuento es: " + precioDescuento.toFixed(2));
}
