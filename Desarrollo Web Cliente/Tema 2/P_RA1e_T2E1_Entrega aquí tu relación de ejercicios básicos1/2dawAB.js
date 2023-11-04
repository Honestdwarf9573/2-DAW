function restarTextos() {
    // Pedimos al usuario que ingrese los textos a restar
    var texto1 = prompt("Ingrese el primer texto:");
    var texto2 = prompt("Ingrese el segundo texto:");
    
    // Intentamos restar los textos (esto dará como resultado NaN)
    var resultado = texto1 - texto2;
    
    // Verificamos si el resultado es NaN y lo mostramos al usuario
    if (isNaN(resultado)) {
      alert("No se pueden restar textos.");
    } else {
      alert("El resultado de la resta es: " + resultado);
    }
  }
  