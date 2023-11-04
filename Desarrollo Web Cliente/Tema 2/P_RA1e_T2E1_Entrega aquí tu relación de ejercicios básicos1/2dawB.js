function dividirNumeros() {
    // Pedimos al usuario que ingrese los números a dividir
    var numero1 = parseFloat(prompt("Ingrese el dividendo:"));
    var numero2 = parseFloat(prompt("Ingrese el divisor:"));
    
    // Verificamos si los números ingresados son válidos
    if (isNaN(numero1) || isNaN(numero2)) {
      alert("Por favor, ingrese números válidos.");
      return;
    }
    
    // Verificamos si el divisor es cero
    if (numero2 === 0) {
      alert("No se puede dividir entre cero.");
      return;
    }
    
    // Realizamos la división y mostramos el resultado al usuario
    var resultado = numero1 / numero2;
    alert("El resultado de la división es: " + resultado);
  }
  