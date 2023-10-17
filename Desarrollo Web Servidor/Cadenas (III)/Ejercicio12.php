$cadena = "192.168.0.1";
if (filter_var($cadena, FILTER_VALIDATE_IP)) {
    echo "La cadena contiene una dirección IP válida.";
} else {
    echo "La cadena no contiene una dirección IP válida.";
}
