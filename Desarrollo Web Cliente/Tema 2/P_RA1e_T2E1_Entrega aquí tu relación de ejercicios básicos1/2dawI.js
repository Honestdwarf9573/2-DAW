
function dawI(){
   // Conversión de base octal a decimal y binario
// Se pide al usuario que ingrese un número en base ocho
var numeroOctal = prompt("Ingrese un número en base ocho:");

// Se convierte el número en base octal a su representación en base decimal y se guarda en la variable numeroDecimal
var numeroDecimal = parseInt(numeroOctal, 8);

// Se convierte el número en base decimal a su representación en base binaria y se guarda en la variable numeroBinario
var numeroBinario = numeroDecimal.toString(2);

// Se muestra en pantalla el número convertido a su representación en base decimal
alert("Número en base decimal: " + numeroDecimal);

// Se muestra en pantalla el número convertido a su representación en base binaria
alert("Número en base binaria: " + numeroBinario); 
}