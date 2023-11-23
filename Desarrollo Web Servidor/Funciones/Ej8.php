<?php
function sumatorio($numero) {
    $sumatorio = 0;
    for ($i = 1; $i < $numero; $i++) {
        $sumatorio += $i;
    }
    return $sumatorio;
}

$numero = 10;
$sumatorio = sumatorio($numero);
echo "El sumatorio de $numero es: $sumatorio";

?>