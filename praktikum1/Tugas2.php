<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menghitung Luas</title>
</head>
<body>
    <h2> Menghitung Luas Lingkaran </h2>

<?php
$jari_jari = 7;
$pi = 3.4;

$luas = 2 * $pi * pow($jari_jari, 2);

echo "jari-jari lingkran = " .$jari_jari. "<br>";
echo "luas lingkaran = " .($luas);
?>    
</body>
</html>