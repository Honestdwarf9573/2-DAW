
function dawK(){
    // 2dawK.htm
// Declaración de variables
var farenheit, celsius;
var s = "";

// Bucle for que recorre los valores de -20 a 120 en incrementos de 10
for (var i = -2; i <= 12; i++) {
  // Se calcula la temperatura en grados Celsius multiplicando el índice del bucle por 10
  celsius = 10 * i;
  
  // Se calcula la temperatura en grados Farenheit utilizando la fórmula correspondiente
  farenheit = 32 + (celsius * 9) / 5;
  
  // Se va concatenando una cadena de texto que incluye las temperaturas en ambas escalas
  s = s + "C= " + celsius + " F= " + farenheit + "\n";
  
  // Si la temperatura es igual a 0, se agrega un mensaje indicando que es el punto de congelación del agua
  if (celsius == 0) {
    s = s + "Punto de congelación del Agua\n";
  }
  
  // Si la temperatura es igual a 100, se agrega un mensaje indicando que es el punto de ebullición del agua
  if (celsius == 100) {
    s = s + "Punto de ebullición del Agua\n";
  }
}

// Se muestra en pantalla la cadena de texto resultante
alert(s);
}