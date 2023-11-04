
function dawF(){
// Cálculo de la longitud de una circunferencia y el área del círculo
// Se pide al usuario que ingrese el radio de la circunferencia
var radio = parseFloat(prompt("Ingrese el radio de la circunferencia:"));

// Se calcula la longitud de la circunferencia utilizando la fórmula 2 * pi * radio
var longitud = 2 * Math.PI * radio;

// Se calcula el área del círculo utilizando la fórmula pi * radio al cuadrado
var area = Math.PI * Math.pow(radio, 2);

// Se muestra un mensaje en pantalla con los resultados redondeados a dos decimales utilizando el método "toFixed()"
alert("La longitud de la circunferencia es: " + longitud.toFixed(2));
alert("El área del círculo es: " + area.toFixed(2));
}