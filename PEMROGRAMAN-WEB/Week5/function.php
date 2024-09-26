<?php

/*function perkenalan(){
    echo "Assalamualaikum, ";
    echo "Perkenalkan, nama saya Seno <br/>";
    echo "Senang berkenalan dengan anda <br/>";
}

// Memanggil fungsi yang sudah dibuat 
perkenalan();
perkenalan();*/


function perkenalan($nama, $salam="Assalamualaikum"){
    echo $salam. " , ";
    echo "Perkenalkan, nama saya " .$nama. "<br/>";
    echo "Senang berkenalan dengan anda <br/>";
}

// Memanggil fungsi yang sudah dibuat
perkenalan("Hamdana","Hallo");

echo"<hr>";

$saya ="Seno";
$ucapanSalam = "Selamat Pagi";

/*memanggil lagi 
perkenalan($saya, $ucapanSalam);*/

// memanggl lagi tanpa mengisi parameter salam
perkenalan($saya);
?>