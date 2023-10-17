$cadena = "Hola mundo";
if (preg_match("/[aeiou]/i", $cadena)) {
    echo "La cadena contiene al menos una vocal.";
} else {
    echo "La cadena no contiene vocales.";
}
