<?php
$pila = array("cinco" => 5, "uno" => 1, "cuatro" => 4, "dos" => 2, "tres" => 3);

// Ordenar por valores ascendente (asort)
asort($pila);
echo "Orden ascendente por valores:\n";
print_r($pila);

// Ordenar por valores descendente (arsort)
arsort($pila);
echo "\nOrden descendente por valores:\n";
print_r($pila);

// Ordenar por claves ascendente (ksort)
ksort($pila);
echo "\nOrden ascendente por claves:\n";
print_r($pila);

// Ordenar por valores ascendente (sort)
sort($pila);
echo "\nOrden ascendente por valores:\n";
print_r($pila);

// Ordenar por valores descendente (rsort)
rsort($pila);
echo "\nOrden descendente por valores:\n";
print_r($pila);

?>