<?php
$correo="pedro.gonzalezjimenez.smr@gmail.com";
//Dividimos correo a partir del @
$correo=explode("@",$correo);
//Decimos que usuario es pedro.gonzalezjimenez.smr
//Y decimos que el dominio es gmail.com
$usuario=$correo[0];
$dominio=$correo[1];

//Imprimimos el nombre del usuario y su dominio
echo"El nombre de usuario es ".$usuario." y su dominio es ".$dominio;

?>