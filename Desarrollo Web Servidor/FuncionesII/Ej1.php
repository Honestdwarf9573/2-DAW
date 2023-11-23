<?php
function intercambio(&$a, &$b) {
    $temp = $a;
    $a = $b;
    $b = $temp;
}

$a = 3;
$b = 7;

intercambio($a, $b);

// Después de ejecutar la función, $a contendrá el valor 7 y $b contendrá el valor 3

?>