<?php

$arrayNumeros = array(1, 2, 3, 4, 5);
$arrayNumeros = ordenarSegun($arrayNumeros, 4);

function ordenarSegun($array, $numero)
{
    switch ($numero) {
        case 1:
            asort($array);
            break;
        case 2:
            arsort($array);
            break;
        case 3:
            ksort($array);
            break;
        case 4:
            krsort($array);
            break;
        default:
            echo "Parametro incorrecto";
            break;
    }

    return $array;
}

foreach ($arrayNumeros as $valor) {
    echo $valor . ' ';
}

?>