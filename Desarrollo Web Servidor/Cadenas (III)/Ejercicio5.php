$cadena = "Esta es una cadena de ejemplo";
$vocales = array("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
foreach ($vocales as $vocal) {
    $cadena = str_replace($vocal, strtoupper($vocal), $cadena);
    $cadena = str_replace(strtoupper($vocal), strtolower($vocal), $cadena);
}
echo $cadena;
