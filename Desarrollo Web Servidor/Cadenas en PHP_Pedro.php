<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
<?php
$palabra1 = "casa";
$palabra2 = "mesa";

if (strcasecmp(substr($palabra1, -3), substr($palabra2, -3)) == 0) {
    echo "Las palabras riman.";
} elseif (strcasecmp(substr($palabra1, -2), substr($palabra2, -2)) == 0) {
    echo "Las palabras riman un poco.";
} else {
    echo "Las palabras no riman.";
}
?>


</body>
</html>

