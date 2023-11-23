<?php
//Ir cambiando de valor modo del 1 al 4 para testear
$modo = 4;
$cad1 = "Hola";
$cad2 = "Holo";
//Genero un switch
switch ($modo) {
//Si la comparacion de cadena 1 y cadena 2 es menor que la comparacion de cadena 2 y cadena 1
//Se da el primer caso si no el contrario
    case 1:
        if (strcmp($cad1, $cad2)) {
            echo $cad1 . " es menor que " . $cad2;
        } else {
            echo $cad2 . " es menor que " . $cad1;
        }
        break;

//Si la comparacion entre cadena 1 y cadena 2 es igual a la comparacion entre cadena 2 y cadena 1
//Se da el primer caso, si no el contrario
    case 2:
        $cad1 = "Hola";
        $cad2 = "hola";
        if (strcasecmp($cad1, $cad2) ) {
            echo $cad1 . " es igual que " . $cad2;
        } else {
            echo $cad1 . " no es igual que " . $cad2;
        }
        break;
//Si la comparacion natural entre cadena 1 y cadena 2 es menor que cadena 2 y cadena 1
//Se da el primer caso, si no el contrario
    case 3:
        $cad1 = "Hola9";
        $cad2 = "Hola10";
        if (strnatcasecmp($cad1, $cad2) ) {
            echo $cad1 . " es menor que " . $cad2;
        } else {
            echo $cad2 . " es menor que " . $cad1;
        }
        break;
//Si la comparacion numerica de los 4 primeros caracteres entre cadena 1 y cadena dos es igual a la comparacion numerica de cadena2 y cadena1
//Se da el primer caso si no el contrario
    case 4:
        $cad1 = "Hola9";
        $cad2 = "Hola10";
        $ncaracteres=4;
        if (strncmp($cad1, $cad2,4)) {
            echo $cad1 . " es igual que " . $cad2;
        } else {
            echo $cad1 . " no es igual que " . $cad2;
        }
        break;

}

?>