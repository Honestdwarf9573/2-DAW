function calcularDiasVividos() {
    // Pedimos al usuario que ingrese su nombre y edad
    var nombre = prompt("Ingrese su nombre:");
    var edad = parseInt(prompt("Ingrese su edad:"));
    
    // Verificamos si la edad ingresada es válida
    if (isNaN(edad)) {
      alert("Por favor, ingrese una edad válida.");
      return;
    }
    
    // Calculamos los días vividos y mostramos el resultado al usuario
    var diasVividos = edad * 365;
    alert(nombre + ", has vivido aproximadamente " + diasVividos + " días.");
  }
  