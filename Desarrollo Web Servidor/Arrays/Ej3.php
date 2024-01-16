<?php
<?php
$colores = array(
    "fuertes" => array("Rojo" => "FF0000", "Verde" => "00FF00", "Azul" => "0000FF"),
    "suaves" => array("Rosa" => "FE9ABC", "Amarillo" => "FDF189", "Malva" => "BC8F8F")
);
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tabla de colores</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }
        
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>Colores fuertes</th>
            <?php foreach ($colores["fuertes"] as $color => $codigo): ?>
                <td style="background-color: <?php echo $codigo; ?>"><?php echo "$color:$codigo"; ?></td>
            <?php endforeach; ?>
        </tr>
        <tr>
            <th>Colores suaves</th>
            <?php foreach ($colores["suaves"] as $color => $codigo): ?>
                <td style="background-color: <?php echo $codigo; ?>"><?php echo "$color:$codigo"; ?></td>
            <?php endforeach; ?>
        </tr>
    </table>
</body>
</html>


<th>Colores Fuertes:</th>
<?php
foreach ($colores["fuertes"] as $color => $codigo): 
?>
    <td style="background-color: 
    <?php echo $codigo; ?>">

    <?php echo "$color:$codigo"; ?>
    </td>

<?php endforeach; ?>

/*
<?php
$colores = array(
    "fuertes" => array("Rojo" => "FF0000", "Verde" => "00FF00", "Azul" => "0000FF"),
    "suaves" => array("Rosa" => "FE9ABC", "Amarillo" => "FDF189", "Malva" => "BC8F8F")
);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tabla de colores</title>
    <style>
        .rojos{
            background-color: #FF0000;
        }
        .verdes {
            background-color: #00FF00;
        }
        .azules {
            background-color: #0000FF;
        }
        .suaves {
            background-color: #FE9ABC;
        }
        .amarillos {
            background-color: #FDF189;
        }
        .malvas {
            background-color: #BC8F8F;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>Colores Fuertes:</th>
            <?php foreach($colores["fuertes"] as $color => $codigo): ?>
                <td class="<?php echo strtolower($color); ?>"><?php echo "$color: $codigo"; ?></td>
            <?php endforeach; ?>
        </tr>
        <tr>
            <th>Colores Simples:</th>
            <td class="suaves">Rosa: FE9ABC</td>
            <td class="suaves">Amarillo: FDF189</td>
            <td class="suaves">Malva: BC8F8F</td>
        </tr>
    </table>
</body>
</html>









*/