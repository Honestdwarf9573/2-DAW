<?php
$colores = array(
    "fuertes" => array("Rojo" => "FF0000", "Verde" => "00FF00", "Azul" => "0000FF"),
    "suaves" => array("Rosa" => "FE9ABC", "Amarillo" => "FDF189", "Malva" => "BC8F8F")
);

if (in_array("FF88CC", $colores, true)) {
    echo "El color FF88CC se encuentra en el array.\n";
} else {
    echo "El color FF88CC no se encuentra en el array.\n";
}

if (in_array("FF0000", $colores, true)) {
    echo "El color FF0000 se encuentra en el array.\n";
} else {
    echo "El color FF0000 no se encuentra en el array.\n";
}


?>