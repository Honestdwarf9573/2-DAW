<?php
function mostrarInformacion($pais, $capital = "Madrid", $habitantes = "muchos") {
    echo "La capital de $pais es $capital y tiene $habitantes habitantes.";
}

function calcularSegundos($dias) {
    $segundos = $dias * 24 * 60 * 60;
    return $segundos;
}

function escribirEncabezado($titulo) {
    echo "<html>\n";
    echo "<head>\n";
    echo "<title>$titulo</title>\n";
    echo "</head>\n";
    echo "<body>\n";
}

mostrarInformacion("España");
mostrarInformacion("Portugal", "Lisboa");
mostrarInformacion("Francia", "Paris", "6.000.000");

?>