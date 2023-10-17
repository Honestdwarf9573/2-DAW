$frase = "No me gusta usar +*[] en cadenas";
$caracteresEspeciales = "/[^a-zA-Z\s]/";
$fraseEscapada = preg_replace($caracteresEspeciales, "#", $frase);
echo $fraseEscapada; // Imprime: No me gusta usar ###### en cadenas

$fraseOriginal = str_replace("#", "", $fraseEscapada);
echo $fraseOriginal; // Imprime: No me gusta usar en cadenas
