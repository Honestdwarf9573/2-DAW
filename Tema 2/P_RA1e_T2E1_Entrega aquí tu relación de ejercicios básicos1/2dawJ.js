
function dawJ(){
    // Conversión a una base específica
// Se pide al usuario que ingrese un número entero
var numero = parseInt(prompt("Ingrese un número entero:"));

// Se pide al usuario que ingrese la base deseada para la conversión
var base = parseInt(prompt("Ingrese la base deseada:"));

// Se convierte el número a su representación en la base deseada y se guarda en la variable numeroBase
var numeroBase = numero.toString(base);

// Se muestra en pantalla el número convertido a la base deseada
alert("Número en base " + base + ": " + numeroBase);
}