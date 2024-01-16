// Obtenemos el botón de generar a través de su ID
const botonGenerar = document.getElementById('generate-btn');

// Obtenemos el botón de reiniciar a través de su ID
const botonReiniciar = document.getElementById('reset-btn');

// Obtenemos el div del discurso a través de su ID
const divDiscurso = document.getElementById('speech');

// Obtenemos el div del contador a través de su ID
const divContador = document.getElementById('count');

// Definimos las columnas de frases para el generador de discursos
let columna1 = ["Queridos compañeros", "Por otra parte,y dados los condicionamientos actuales", "Asimismo", "Sin embargo no hemos de olvidar que", "De igual manera", "La práctica de la vida cotidiana prueba que", "No es indispensable argumentar el peso y la significación de estos problemas ya que", "Las experiencias ricas y diversas muestran que", "El afán de organización, pero sobre todo", "Los superiores principios ideológicos, condicionan que", "Incluso, bien pudiéramos atrevernos a sugerir que", "Es obvio señalar que", "Pero pecaríamos de insinceros si soslayásemos que", "Y además, quedaríamos inmersos en la más abyecta de las estulticias si no fueramos consacientes de que", "Por último, y como definitivo elemento esclarecedor, cabe añadir que"];
let columna2 = ["la realización de las premisas del programa", "la complejidad de los estudios de los dirigentes", "el aumento constante, en cantidad y en extensión, de nuestra actividad", "la estructura actual de la organización", "el nuevo modelo de actividad de la organización,", "el desarrollo continuo de distintas formas de actividad", "nuestra actividad de información y propaganda", "el reforzamiento y desarrollo de las estructuras", "la consulta con los numerosos militantes", "el inicio de la acción general de formación de las actitudes", "un relanzamiento específico de todos los sectores implicados", "la superación de experiencias periclitadas", "una aplicación indiscriminada de los factores confluyentes", "la condición sine qua non rectora del proceso", "el proceso consensuado de unas y otras aplicaciones concurrentes"];
let columna3 = ["nos obliga a un exhaustivo análisis", "cumple un rol escencial en la formación", "exige la precisión y la determinación", "ayuda a la preparación y a la realización", "garantiza la participación de un grupo importante en la formación", "cumple deberes importantes en la determinación", "facilita la creación", "obstaculiza la apreciación de la importancia", "ofrece un ensayo interesante de verificación", "implica el proceso de reestructuración y modernización", "habrá de significar un auténtico y eficaz punto de partida", "permite en todo caso explicitar las razones fundamentales", "asegura, en todo caso, un proceso muy sensible de inversión", "radica en una elaboración cuidadosa y sistemática de las estrategias adecuadas", "deriva de una indirecta incidencia superadora"];
let columna4 = ["de las condiciones financieras y administrativas existentes.", "de las directivas de desarrollo para el futuro.", "del sistema de participación general.", "de las actitudes de los miembros hacia sus deberes ineludibles.", "de las nuevas proposiciones.", "de las direcciones educativas en el sentido del progreso.", "del sistema de formación de cuadros que corresponda a las necesidades.", "de las condiciones de las actividades apropiadas.", "del modelo de desarrollo.", "de las formas de acción.", "de las básicas premisas adoptadas.", "de toda una casuística de amplio espectro.", "de los elementos generadores.", "para configurar una interface amigable y coadyuvante a la reingeniería del sistema.", "de toda una serie de criterios ideológicamente sistematizados en un frente común de actuación regeneradora."];

// Creamos copias de las columnas originales para poder reiniciar el generador de discursos
let columnaOriginal1 = [...columna1];
let columnaOriginal2 = [...columna2];
let columnaOriginal3 = [...columna3];
let columnaOriginal4 = [...columna4];
// Añadimos los eventos a los botones
botonGenerar.addEventListener('click', generarDiscurso);
botonReiniciar.addEventListener('click', reiniciarDiscurso);

// Función para generar el discurso
function generarDiscurso() {
  let frase1, frase2, frase3, frase4;

  // Comprobamos que cada columna tenga al menos una frase disponible
  if (columna1.length > 0) {
    const indice1 = Math.floor(Math.random() * columna1.length);
    frase1 = columna1[indice1];
    columna1.splice(indice1, 1);
  } else {
    frase1 = '';
  }

  if (columna2.length > 0) {
    const indice2 = Math.floor(Math.random() * columna2.length);
    frase2 = columna2[indice2];
    columna2.splice(indice2, 1);
  } else {
    frase2 = '';
  }

  if (columna3.length > 0) {
    const indice3 = Math.floor(Math.random() * columna3.length);
    frase3 = columna3[indice3];
    columna3.splice(indice3, 1);
  } else {
    frase3 = '';
  }

  if (columna4.length > 0) {
    const indice4 = Math.floor(Math.random() * columna4.length);
    frase4 = columna4[indice4];
    columna4.splice(indice4, 1);
  } else {
    frase4 = '';
  }

  // Si todas las columnas están vacías, mostramos un mensaje de error
  if (frase1 === '' && frase2 === '' && frase3 === '' && frase4 === '') {
    alert('No hay más frases disponibles.');
    return;
  }

  // Generamos el discurso y lo mostramos en el div correspondiente
  const discurso = `${frase1} ${frase2} ${frase3} ${frase4}\n`;
  divDiscurso.textContent += discurso + '\n';

  // Actualizamos el contador de frases
  let contador = obtenerCookie('contador');
  contador = contador ? parseInt(contador) + 1 : 1;
  establecerCookie('contador', contador, 7);

  // Mostramos el número de veces que se ha pulsado el botón
  divContador.textContent = `Has pulsado el botón ${contador} veces.`;
}
// Función para reiniciar el generador de discursos
function reiniciarDiscurso() {
  // Restauramos las columnas a su estado original
  columna1 = [...columnaOriginal1];
  columna2 = [...columnaOriginal2];
  columna3 = [...columnaOriginal3];
  columna4 = [...columnaOriginal4];

  // Limpiamos el div del discurso
  divDiscurso.textContent = '';

  // Mostramos un mensaje indicando que las frases se han reiniciado
  alert('Las frases se han reiniciado.');
}
// Función para obtener una cookie
function obtenerCookie(nombre) {
  // Obtenemos todas las cookies
  const cookies = document.cookie.split(';');

  // Buscamos la cookie con el nombre especificado
  for (let i = 0; i < cookies.length; i++) {
    const cookie = cookies[i].trim();
    if (cookie.startsWith(nombre + '=')) {
      // Si encontramos la cookie, devolvemos su valor
      return cookie.substring(nombre.length + 1);
    }
  }

  // Si no encontramos la cookie, devolvemos null
  return null;
}


// Función para establecer una cookie
function establecerCookie(nombre, valor, dias) {
  // Creamos una fecha de expiración para la cookie
  const fecha = new Date();
  fecha.setTime(fecha.getTime() + (dias * 24 * 60 * 60 * 1000));
  const expira = `expires=${fecha.toUTCString()}`;

  // Establecemos la cookie
  document.cookie = `${nombre}=${valor};${expira};path=/`;
}
