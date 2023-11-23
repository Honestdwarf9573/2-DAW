
function dawL(){
    // 2dawL.htm
// Declaración de variable que controla el ciclo while
var volverEmpezar = true;

// Ciclo while que se ejecuta mientras la variable volverEmpezar sea verdadera
while (volverEmpezar) {
  // Se pide al usuario que ingrese dos números positivos menores de 57
  var numero1 = parseInt(prompt("Ingrese el primer número positivo menor de 57:"));
  var numero2 = parseInt(prompt("Ingrese el segundo número positivo menor de 57:"));

  // Si los números ingresados cumplen con los requisitos, se calcula su producto y se muestra en pantalla
  if (numero1 > 0 && numero1 < 57 && numero2 > 0 && numero2 < 57) {
    var producto = numero1 * numero2;
    alert("El producto de los dos números es: " + producto);
  } else {
    // Si los números ingresados no cumplen con los requisitos, se muestra un mensaje de error
    alert("Los números ingresados no cumplen con los requisitos.");
  }
  
  // Se pregunta al usuario si desea volver a empezar y se convierte su respuesta a minúsculas
  var respuesta = prompt("¿Desea volver a empezar? (Sí/No)").toLowerCase();
  
  // Si la respuesta es "no", se cambia el valor de la variable volverEmpezar a falso para salir del ciclo while
  if (respuesta === "no") {
    volverEmpezar = false;
  }
}
}