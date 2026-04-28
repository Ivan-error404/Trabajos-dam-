
let precio = prompt("Introduce el precio:"); 

let total = Number(precio) * 1.21; 

document.getElementById("resultado").innerText = "El precio final con IVA es: " + total.toFixed(2);

console.log("El precio final con IVA es: " + total.toFixed(2)); 
//Fin