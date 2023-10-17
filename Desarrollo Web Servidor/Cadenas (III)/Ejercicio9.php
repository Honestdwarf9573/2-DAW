$cadena = "Esta es una cadena de ejemplo";
$vocales = array("e", "i", "o", "u", "E", "I", "O", "U");
$cadenaEscapada = str_replace($vocales, "#", $cadena);
echo $cadenaEscapada; // Imprime: Ast# s #n# c#nd# d# #j#mpl#

$cadenaOriginal = str_replace("#", "a", $cadenaEscapada);
echo $cadenaOriginal; // Imprime: Esta es una cadena de ejemplo
