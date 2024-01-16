// Función para calcular las figuras en un número de 4 cifras
function calcularFiguras(numero) {
    var cifras = numero.toString().split('');
    var figuras = {
      doblePareja: 0,
      trio: 0,
      escaleraSimple: 0,
      escaleraCompleta: 0,
      pocker: 0
    };
  
    cifras.forEach(function(cifra, index) {
      // Comprobar doble pareja
      if (cifras.indexOf(cifra) !== index && cifras.lastIndexOf(cifra) !== index) {
        figuras.doblePareja++;
      }
      
      // Comprobar trío
      if (cifras.indexOf(cifra) !== index && cifras.lastIndexOf(cifra) !== index && cifras.lastIndexOf(cifra) !== cifras.indexOf(cifra)) {
        figuras.trio++;
      }
  
      // Comprobar escalera simple
      if (cifras.indexOf((parseInt(cifra) + 1).toString()) !== -1 && cifras.indexOf((parseInt(cifra) + 2).toString()) !== -1) {
        figuras.escaleraSimple++;
      }
  
      // Comprobar escalera completa
      if (cifras.indexOf((parseInt(cifra) + 1).toString()) !== -1 && cifras.indexOf((parseInt(cifra) + 2).toString()) !== -1 && cifras.indexOf((parseInt(cifra) + 3).toString()) !== -1) {
        figuras.escaleraCompleta++;
      }
  
      // Comprobar póker
      if (cifras.indexOf(cifra) !== index && cifras.lastIndexOf(cifra) !== index && cifras.lastIndexOf(cifra) !== cifras.indexOf(cifra) && cifras.lastIndexOf(cifra) !== cifras.indexOf(cifra, cifras.indexOf(cifra) + 1)) {
        figuras.pocker++;
      }
    });
  
    return figuras;
  }
  
  // Función para mostrar las estadísticas
  function mostrarEstadisticas(figuras) {
    var totalFiguras = Object.values(figuras).reduce((a, b) => a + b, 0);
    var porcentajes = {};
  
    for (var figura in figuras) {
      porcentajes[figura] = (figuras[figura] / totalFiguras * 100).toFixed(2);
    }
  
    alert("Estadísticas:\n\nDoble pareja: " + porcentajes.doblePareja + "%\nTrío: " + porcentajes.trio + "%\nEscalera simple: " + porcentajes.escaleraSimple + "%\nEscalera completa: " + porcentajes.escaleraCompleta + "%\nPóker: " + porcentajes.pocker + "%");
  }
  
  // Función para obtener el número de veces que se ha introducido una matrícula correctamente desde la cookie
  function obtenerVecesCorrectas() {
    var vecesCorrectas = parseInt(getCookie("vecesCorrectas"));
    return isNaN(vecesCorrectas) ? 0 : vecesCorrectas;
  }
  
  // Función para establecer el número de veces que se ha introducido una matrícula correctamente en la cookie
  function establecerVecesCorrectas(vecesCorrectas) {
    setCookie("vecesCorrectas", vecesCorrectas.toString(), 365);
  }
  
  // Función auxiliar para obtener el valor de una cookie
  function getCookie(nombre) {
    var nombreCookie = nombre + "=";
    var cookies = document.cookie.split(';');
  
    for(var i = 0; i < cookies.length; i++) {
      var cookie = cookies[i].trim();
      
      if (cookie.indexOf(nombreCookie) === 0) {
        return cookie.substring(nombreCookie.length, cookie.length);
      }
    }
  
    return "";
  }
  
  // Función auxiliar para establecer el valor de una cookie
  function setCookie(nombre, valor, diasExpiracion) {
    var fechaExpiracion = new Date();
    fechaExpiracion.setDate(fechaExpiracion.getDate() + diasExpiracion);
    
    var cookie = nombre + "=" + valor + "; expires=" + fechaExpiracion.toUTCString() + "; path=/";
    
    document.cookie = cookie;
  }
  
  // Obtener número de matrícula del usuario
  var matricula = prompt("Introduce un número de matrícula de cuatro cifras:");
  
  // Validar la matrícula y calcular las figuras
  if (matricula && matricula.length === 4 && !isNaN(matricula)) {
    var figurasCalculadas = calcularFiguras(matricula);
    
    // Mostrar la figura correspondiente
    if (figurasCalculadas.doblePareja > 0) {
      alert("La matrícula representa una doble pareja.");
    } else if (figurasCalculadas.trio > 0) {
      alert("La matrícula representa un trío.");
    } else if (figurasCalculadas.escaleraSimple > 0) {
      alert("La matrícula representa una escalera simple.");
    } else if (figurasCalculadas.escaleraCompleta > 0) {
      alert("La matrícula representa una escalera completa.");
    } else if (figurasCalculadas.pocker > 0) {
      alert("La matrícula representa un póker.");
    } else {
      alert("La matrícula no representa ninguna figura.");
    }
    
    // Mostrar estadísticas y almacenar en la cookie
    mostrarEstadisticas(figurasCalculadas);
    
    var vecesCorrectas = obtenerVecesCorrectas();
    establecerVecesCorrectas(vecesCorrectas + 1);
  } else {
    alert("La matrícula introducida es incorrecta.");
  }
  