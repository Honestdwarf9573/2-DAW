<?php

function eliminarPalabra($cadena, $posicion)
{
    $palabras = explode(' ', $cadena);
    $parteAntes = array_slice($palabras, 0, $posicion);
    $parteDespues = array_slice($palabras, $posicion + 1);
    $nuevaCadena = implode(' ', array_merge($parteAntes, $parteDespues));
    return $nuevaCadena;
}
$cadena = "Tengo la camisa negra, como negra tengo el alma";
echo(eliminarPalabra($cadena, 5));
?>

