// Variables para almacenar las estadísticas
var dobleParejaTotal = 0;
var trioTotal = 0;
var escaleraSimpleTotal = 0;
var escaleraCompletaTotal = 0;
var pokerTotal = 0;

// Función para calcular las figuras en un número de 4 cifras
// Función para calcular las figuras en un número de 4 cifras
// Función para calcular las figuras en un número de 4 cifras
function calcularFiguras(numero) {
    var cifras = numero.toString().split('').sort();
    var doblePareja = false;
    var trio = false;
    var escaleraSimple = false;
    var escaleraCompleta = false;
    var poker = false;

    // Comprobar poker
    if (cifras[0] == cifras[1] && cifras[1] == cifras[2] && cifras[2] == cifras[3]) {
        poker = true;
    }

    // Comprobar escalera completa
    else if (cifras[1] - cifras[0] == 1 && cifras[2] - cifras[1] == 1 && cifras[3] - cifras[2] == 1) {
        escaleraCompleta = true;
    }

    // Comprobar trío
    else if ((cifras[0] == cifras[1] && cifras[1] == cifras[2]) || (cifras[1] == cifras[2] && cifras[2] == cifras[3])) {
        trio = true;
    }

    // Comprobar escalera simple
    else if ((cifras[1] - cifras[0] == 1 && cifras[2] - cifras[1] == 1) || (cifras[2] - cifras[1] == 1 && cifras[3] - cifras[2] == 1)) {
        escaleraSimple = true;
    }

    // Comprobar doble pareja
    else if ((cifras[0] == cifras[1] && cifras[2] == cifras[3]) || (cifras[1] == cifras[2] && cifras[2] == cifras[3])) {
        doblePareja = true;
    }

    return [doblePareja, trio, escaleraSimple, escaleraCompleta, poker];
}



// Función para manejar el click del botón calcular
function handleClick() {
    var numero = document.getElementById('numero').value;
    if (numero.length !== 4 || isNaN(numero)) {
        alert('Introduce un número de 4 cifras.');
    } else {
        // Aumentar el contador y mostrarlo
        var contador = parseInt(localStorage.getItem('contador')) || 0;
        contador++;
        localStorage.setItem('contador', contador);
        var vecesIntroducido = document.getElementById('vecesIntroducido');
        vecesIntroducido.innerHTML = '<p>Número de veces que se ha introducido una matrícula correctamente: ' + contador + '</p>';

        // Calcular y mostrar las figuras
        var figuras = calcularFiguras(numero);
        var resultado = document.getElementById('resultado');
        resultado.innerHTML = '<h2>Figuras encontradas</h2>';
        resultado.innerHTML += '<p>Doble pareja: ' + (figuras[0] ? 'Sí' : 'No') + '</p>';
        resultado.innerHTML += '<p>Trío: ' + (figuras[1] ? 'Sí' : 'No') + '</p>';
        resultado.innerHTML += '<p>Escalera simple: ' + (figuras[2] ? 'Sí' : 'No') + '</p>';
        resultado.innerHTML += '<p>Escalera completa: ' + (figuras[3] ? 'Sí' : 'No') + '</p>';
        resultado.innerHTML += '<p>Poker: ' + (figuras[4] ? 'Sí' : 'No') + '</p>';

        // Actualizar las estadísticas
        if (figuras[0]) dobleParejaTotal++;
        if (figuras[1]) trioTotal++;
        if (figuras[2]) escaleraSimpleTotal++;
        if (figuras[3]) escaleraCompletaTotal++;
        if (figuras[4]) pokerTotal++;

        // Mostrar las estadísticas en una ventana secundaria
        var estadisticasVentana = window.open("", "Estadísticas", "width=400,height=400");
        estadisticasVentana.document.write('<h2>Estadísticas</h2>');
        estadisticasVentana.document.write('<p>Doble pareja: ' + dobleParejaTotal + '</p>');
        estadisticasVentana.document.write('<p>Trío: ' + trioTotal + '</p>');
        estadisticasVentana.document.write('<p>Escalera simple: ' + escaleraSimpleTotal + '</p>');
        estadisticasVentana.document.write('<p>Escalera completa: ' + escaleraCompletaTotal + '</p>');
        estadisticasVentana.document.write('<p>Poker: ' + pokerTotal + '</p>');

        // Cerrar la ventana de estadísticas después de 10 segundos
        setTimeout(function() {
            estadisticasVentana.close();
        }, 10000);
    }
}
