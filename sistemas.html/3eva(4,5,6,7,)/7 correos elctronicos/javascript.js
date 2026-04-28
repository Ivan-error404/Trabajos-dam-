function crearCorreo() {
    let nombre = prompt("Ingrese el nombre:");
    let apellido = prompt("Ingrese el apellido:");

    let correo = nombre.charAt(0).toLowerCase() + "." +
                 apellido.toLowerCase() + "@medac.com";

    let contrasena = nombre.charAt(0).toUpperCase() +
                     nombre.charAt(1).toLowerCase() +
                     apellido.charAt(0).toLowerCase() +
                     apellido.charAt(1).toLowerCase() +
                     nombre.length + "_" +
                     apellido.charAt(apellido.length - 1).toLowerCase();

    let mensaje = "Correo generado: " + correo +
                  "\nContraseña: " + contrasena;

    document.getElementById("resultado").innerText = mensaje;
    console.log(mensaje);
}