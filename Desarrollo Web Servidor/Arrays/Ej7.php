<?php
$valores = array();
for ($i = 0; $i < 10; $i++) {
    $valores[] = rand(1, 10);
}

$conteo_valores = array_count_values($valores);
$num_valores_2 = isset($conteo_valores[2]) ? $conteo_valores[2] : 0;

echo "El número de valores iguales a 2 es: $num_valores_2\n";

?>