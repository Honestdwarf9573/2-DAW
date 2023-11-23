<?php
$paises_capitales = array(
    "España" => "Madrid",
    "Francia" => "París",
    "Alemania" => "Berlín",
    // Agregar más países y capitales aquí...
);

// Mostrar frase para cada país y capital
foreach ($paises_capitales as $pais => $capital) {
    echo "La capital de $pais es $capital.\n";
}

// Ordenar por nombre del país
ksort($paises_capitales);
echo "\nOrdenado por nombre del país:\n";
foreach ($paises_capitales as $pais => $capital) {
    echo "$pais: $capital\n";
}

// Ordenar por nombre de la capital
asort($paises_capitales);
echo "\nOrdenado por nombre de la capital:\n";
foreach ($paises_capitales as $pais => $capital) {
    echo "$pais: $capital\n";
}


?>