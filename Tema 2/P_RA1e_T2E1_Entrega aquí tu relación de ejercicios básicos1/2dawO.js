
function dawO(){
   // 2dawO.htm
// Declaración de variables
var numerosIntroducidos = 0;
var producto = 1;

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
    // Si el número es válido, se multiplica por el producto acumulado
    producto *= numero;
  }
}

// Se muestra en pantalla el número de números introducidos (sin contar el 9999)
alert("Número de números introducidos (sin contar el 9999): " + numerosIntroducidos);

// Se muestra en pantalla el producto de los números introducidos (sin contar el 9999)
alert("Producto de los números introducidos (sin contar el 9999): " + producto); 
}