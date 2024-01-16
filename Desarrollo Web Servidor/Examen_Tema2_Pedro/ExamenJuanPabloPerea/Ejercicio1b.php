<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $arrayVoca = array(
        "Miku" => array("cyan" => array("leek" => "sega")),
        "Luka" => array("rose" => "tako"),
        "Rin" => "yellow",
        "Len" => "",
        "Kaito" => array("blue" => "ice cream")
    );

    recorre($arrayVoca);

    function recorre($array)
    {
        if (!is_array($array)) {
            echo $array;
            echo ("<br>");
        } else {
            foreach ($array as $item => $valor) {
                echo "$item ";
                echo "-->";
                recorre($valor);
            }
        }
    }
    ?>

</body>

</html>