
function dawH(){
    // Conversión a base 16 y base 5
// Se pide al usuario que ingrese un número entero
var numero = parseInt(prompt("Ingrese un número entero:"));

// Se convierte el número a su representación en base 16 y se guarda en la variable base16
var base16 = numero.toString(16);

// Se convierte el número a su representación en base 5 y se guarda en la variable base5
var base5 = numero.toString(5);

// Se muestra en pantalla el número convertido a base 16
alert("Número en base 16: " + base16);

// Se muestra en pantalla el número convertido a base 5
alert("Número en base 5: " + base5);
}