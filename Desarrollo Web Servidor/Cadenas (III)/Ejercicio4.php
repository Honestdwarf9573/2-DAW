$cadena1 = "Hola 9";
$cadena2 = "Hola 10";

// Comparación de toda la cadena
if ($cadena1 < $cadena2) {
    echo "La cadena 1 es menor.";
} elseif ($cadena1 > $cadena2) {
    echo "La cadena 2 es menor.";
} else {
    echo "Las cadenas son iguales.";
}

// Comparación de los 5 primeros caracteres
$cadena1_5 = substr($cadena1, 0, 5);
$cadena2_5 = substr($cadena2, 0, 5);

if ($cadena1_5 < $cadena2_5) {
    echo "La cadena 1 (primeros 5 caracteres) es menor.";
} elseif ($cadena1_5 > $cadena2_5) {
    echo "La cadena 2 (primeros 5 caracteres) es menor.";
} else {
    echo "Los primeros 5 caracteres de las cadenas son iguales.";
}
