
function dawN(){
    // 2dawN.htm
// Declaración de variables
var numerosIntroducidos = 0;
var suma = 0;

// Ciclo while que se ejecuta mientras la condición sea verdadera
while (true) {
  // Se pide al usuario que ingrese un número
  var numero = parseInt(prompt("Ingrese un número:"));

  // Si el número ingresado es igual a 9999, se sale del ciclo while con la instrucción break
  if (numero === 9999) {
    break;
  }

  // Se incrementa el contador de números introducidos
  numerosIntroducidos++;
  
  // Se verifica si el número ingresado es un valor numérico válido
  if (numero !== NaN) {
    // Si el número es válido, se agrega a la suma acumulada
    suma += numero;
  }
}

// Se muestra en pantalla el número de números introducidos (sin contar el 9999)
alert("Número de números introducidos (sin contar el 9999): " + numerosIntroducidos);

// Se muestra en pantalla la suma de los números introducidos (sin contar el 9999)
alert("Suma de los números introducidos (sin contar el 9999): " + suma);
}