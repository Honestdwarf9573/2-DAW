<?php
function media_aritmetica() {
    $numeros = func_get_args();
    $cantidad_numeros = count($numeros);
    $suma = array_sum($numeros);
    $media = $suma / $cantidad_numeros;
    return $media;
}

$media = media_aritmetica(2, 4, 6, 8);

// La variable $media contendrá el valor 5, que es la media aritmética de los números 2, 4, 6 y 8


?>