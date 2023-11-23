<?php
$numero=27;
echo"Tengo ".$numero." años";

echo "Soy Pepito";

$cadena="Esto es una cadena";

$subcadena=substr($cadena, 0,4);

echo $subcadena;

$subcadena2=substr_replace($cadena,"ALBERTO_PUTERO",5,6);

echo $subcadena2;


$subcadena=str_replace($cadena,0,4,"EStas");
echo $subcadena;
?>



