<?php
$alumnos = array("Alumno1", "Alumno2", "Alumno3", "Alumno4", "Alumno5");

// Mostrar los 3 primeros alumnos
$primeros_alumnos = array_slice($alumnos, 0, 3);
echo "Los primeros alumnos son: " . implode(", ", $primeros_alumnos) . "\n";

// Mostrar los 2 últimos alumnos
$ultimos_alumnos = array_splice($alumnos, -2);
echo "Los últimos alumnos son: " . implode(", ", $ultimos_alumnos) . "\n";
?>