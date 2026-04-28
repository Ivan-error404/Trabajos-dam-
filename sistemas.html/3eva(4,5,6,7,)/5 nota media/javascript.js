let a = parseFloat(prompt("Introduce tu primera nota:"));
let b = parseFloat(prompt("Introduce tu segunda nota:"));
let c = parseFloat(prompt("Introduce tu tercera nota:"));

let total = (a + b + c) / 3;

console.log(total);

let mensaje = "Nota media: " + total.toFixed(2);

if (total >= 5) {
    mensaje += " — Aprobado";
} else {
    mensaje += " — Suspendido";
}

document.getElementById("resultado").innerText = mensaje;

console.log(mensaje);
