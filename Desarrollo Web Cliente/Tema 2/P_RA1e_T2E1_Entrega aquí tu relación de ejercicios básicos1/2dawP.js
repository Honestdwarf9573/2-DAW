
function dawP(){
    // 2dawP.htm
// Declaración de variable para almacenar la suma de los múltiplos de 23
var sumaMultiplos23 = 0;

// Ciclo for que itera desde 1 hasta 999
for (var i = 1; i < 1000; i++) {
  // Se verifica si el número actual es múltiplo de 23
  if (i % 23 === 0) {
    // Si es múltiplo de 23, se imprime en el documento
    document.write(i + "<br>");
    // Se suma el número al acumulador de la suma de los múltiplos de 23
    sumaMultiplos23 += i;
  }
}

// Se imprime en el documento la suma de todos los múltiplos de 23
document.write("La suma de todos los múltiplos de 23 es: " + sumaMultiplos23);
}