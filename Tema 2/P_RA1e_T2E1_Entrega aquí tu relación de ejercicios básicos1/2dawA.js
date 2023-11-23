function restarNumeros() {
    // Pedimos al usuario que ingrese los números a restar
    var numero1 = parseFloat(prompt("Ingrese el primer número:"));
    var numero2 = parseFloat(prompt("Ingrese el segundo número:"));
    
    // Verificamos si los números ingresados son válidos
    if (isNaN(numero1) || isNaN(numero2)) {
      alert("Por favor, ingrese números válidos.");
      return;
    }
    
    // Realizamos la resta y mostramos el resultado al usuario
    var resultado = numero1 - numero2;
    alert("El resultado de la resta es: " + resultado);
  }
 