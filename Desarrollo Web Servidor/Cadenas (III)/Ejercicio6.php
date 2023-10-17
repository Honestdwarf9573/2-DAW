$cadena = " ... Hola a todos ... ";

// Eliminar espacios y puntos anteriores al texto
$cadena = ltrim($cadena, " .");

// Eliminar espacios y puntos posteriores al texto
$cadena = rtrim($cadena, " .");

// Eliminar espacios y puntos anteriores y posteriores al texto
$cadena = trim($cadena, " .");

echo $cadena;
