// Sobrescribiendo una variable global
var nombre = "Juan";
console.log(nombre); 

function cambiarNombre() {
  nombre = "María";
}

cambiarNombre();
console.log(nombre); 

// Sobrescribiendo una función global
function saludar() {
  console.log("Hola");
}

saludar(); 

function saludarEnIngles() {
  console.log("Hi");
}

saludar = saludarEnIngles;
saludar(); 
