<?php
$numero="654 65 65 65";
$tef_fijo="950 48 10 00";

if(preg_match('/^[6-7]{1}[0-9]{2} [0-9]{2} [0-9]{2} [0-9]{2}$/',$numero)){
    echo"El número de móvil es válido <br>";
}else{
    echo"El número de móvil no es válido <br>";
}

if(preg_match('/^[8-9]{1}[0-9]{2} [0-9]{2} [0-9]{2} [0-9]{2}$/',$tef_fijo)){
    echo"El número fijo es válido <br>";
}else{
    echo"El número fijo no es válido <br>";
}




?>