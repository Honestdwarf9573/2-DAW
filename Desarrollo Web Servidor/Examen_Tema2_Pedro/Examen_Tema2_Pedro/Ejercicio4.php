<?php
$cad = "Hola que tal";
$n = 2;


switch ($n) {
    case 1:
        echo substr($cad,0,4);
        break;

    case 2:
        echo substr($cad,5,3);
        break;

    case 3:
        echo substr($cad,9,3);
        break;


}
?>