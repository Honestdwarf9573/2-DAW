// Definimos una fecha concreta
var fecha = new Date("2023-10-10");

// Obtenemos el mes y el año de la fecha
var mes = fecha.getMonth() + 1; // Sumamos 1 ya que los meses en JavaScript comienzan en 0 (enero)
var anio = fecha.getFullYear();

// Mostramos el resultado
console.log("El mes es " + mes + " y el año es " + anio);
