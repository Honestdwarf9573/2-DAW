<?php
function semisuma($num1, $num2) {
    $suma = $num1 + $num2;
    $semisuma = $suma / 2;
    return $semisuma;
}

$num1 = 10;
$num2 = 20;
$semisuma = semisuma($num1, $num2);
echo "La semisuma de $num1 y $num2 es: $semisuma";

?>