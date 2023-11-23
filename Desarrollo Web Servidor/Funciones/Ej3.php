<?php
function calcularSegundos($dias) {
    $segundos = $dias * 24 * 60 * 60;
    return $segundos;
}

$numeroDias = 10;
$segundos = calcularSegundos($numeroDias);
echo "El número de segundos en $numeroDias días es: $segundos";


?>