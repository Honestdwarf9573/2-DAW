$cadena = "vamos al o'Brian";
$cadenaEscapada = addslashes($cadena);
echo $cadenaEscapada; // Imprime: vamos al o\'Brian

$cadenaOriginal = stripslashes($cadenaEscapada);
echo $cadenaOriginal; // Imprime: vamos al o'Brian
