$email = "ejemplo@dominio.com";
$email = strtolower($email);
list($usuario, $dominio) = explode("@", $email);
echo "Usuario: " . $usuario . "<br>";
echo "Dominio: " . $dominio;
