<?php
$dias = array("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo");

// Bucle foreach
foreach ($dias as $indice => $valor) {
    echo "Índice: $indice, Valor: $valor\n";
}

// Bucle for
for ($i = 0; $i < count($dias); $i++) {
    echo "Índice: $i, Valor: " . $dias[$i] . "\n";
}


?>