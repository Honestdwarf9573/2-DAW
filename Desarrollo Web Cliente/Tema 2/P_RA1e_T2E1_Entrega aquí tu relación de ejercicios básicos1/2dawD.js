function mostrarOperaciones() {
    // Pedimos al usuario que ingrese un número
    var numero = parseFloat(prompt("Ingrese un número:"));
    
    // Verificamos si el número ingresado es válido
    if (isNaN(numero)) {
      alert("Por favor, ingrese un número válido.");
      return;
    }
    
    // Realizamos las operaciones y las mostramos al usuario
    var doble = numero * 2;
    var triple = numero * 3;
    var cuadruple = numero * 4;
    
    alert("El doble de " + numero + " es " + doble);
    alert("El triple de " + numero + " es " + triple);
    alert("El cuádruple de " + numero + " es " + cuadruple);
  }
  