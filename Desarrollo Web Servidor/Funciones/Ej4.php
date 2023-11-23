<?php
function escribirEncabezado($titulo) {
    echo "<!DOCTYPE html>\n";
    echo "<html>\n";
    echo "<head>\n";
    echo "<title>$titulo</title>\n";
    echo "</head>\n";
    echo "<body>\n";
}

escribirEncabezado("Título de la página");


?>