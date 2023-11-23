<?php
function cuadrado($numero) {
    return pow($numero, 2);
}
function cubo($numero) {
    return pow($numero, 3);
}
$numero = 5;
$cuadrado = cuadrado($numero);
$cubo = cubo($numero);
echo "El cuadrado de $numero es: $cuadrado <br>";
echo "El cubo de $numero es: $cubo";

?>