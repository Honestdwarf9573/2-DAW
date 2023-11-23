<?php
function textoEnNegrita($texto) {
    return "<b>$texto</b>";
}
$texto = "Hola, mundo!";
$textoNegrita = textoEnNegrita($texto);
echo $textoNegrita;

?>