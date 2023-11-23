<?php
//Formato se toquetea para ir comprobando el ejercicio
$formato = 4;
$numero = 12;
//Un switch y comprobamos cada uno con print f y sus respectivos porcentajes
//Para que salga como pide el ejercicio
switch ($formato) {
    case 1:
        printf ("El valor pasado es %d  en decimal \n ", $numero );
        break;
    case 2:
        printf ("El valor pasado es %x  en hexadecimal \n ", $numero );

        break;

    case 3:
        printf ("El valor pasado es %X  en Hexadecimal \n ", $numero );

        break;
    case 4:
        printf ("El valor pasado es %o  en octal \n ", $numero );

        break;

    case 5:
        printf ("El valor pasado es %e  en notacion exponencial \n ", $numero );

        break;
    case 6:
        printf ("El valor pasado es %b  en binario \n ", $numero );

        break;
        //Cuando se pasa imprime formato incorrecto
    default:
        echo"Formato incorrecto!!!";
    break;


}




?>