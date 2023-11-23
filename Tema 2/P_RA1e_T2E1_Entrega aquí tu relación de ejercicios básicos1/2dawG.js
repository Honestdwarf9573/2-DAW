
function dawG(){
    // Contadores
// Se pide al usuario que ingrese un número
var numero = parseInt(prompt("Ingrese un número:"));

// Se realizan operaciones de contador utilizando el número ingresado
// Se suma 5 al número ingresado y se guarda en la variable contador1
var contador1 = numero + 5;

// Se suma 21 al número ingresado y se guarda en la variable contador2
var contador2 = numero + 21;

// Se resta 4 al número ingresado y se guarda en la variable contador3
var contador3 = numero - 4;

// Se muestra en pantalla el número ingresado por el usuario
alert(numero);

// Se muestra en pantalla los valores de los contadores, separados por tabulaciones
alert(contador1 + "\t" + contador2 + "\t" + contador3);
}