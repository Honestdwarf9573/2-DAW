<?php
$colores = array(
    "fuertes" => array("Rojo" => "FF0000", "Verde" => "00FF00", "Azul" => "0000FF"),
    "suaves" => array("Rosa" => "FE9ABC", "Amarillo" => "FDF189", "Malva" => "BC8F8F")
);

foreach ($colores as $tipo => $colores_tipo) {
    echo "Colores $tipo: ";
    foreach ($colores_tipo as $color => $codigo) {
        echo "$color:$codigo ";
    }
    echo "\n";
}


?>