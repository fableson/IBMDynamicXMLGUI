<?php
// xmlgui form # 1
// this page is expecting
// fname
// lname
// gender
// age


$filename = "/writeablepathforyourdatawhichissecureokyouhavebeenwarned/datafile.txt";


$f = fopen($filename,"a");
fprintf($f,"Data received @ ".date(DATE_RFC822));
fprintf($f,"\n");
//fprintf($f,print_r($_POST,true));
fprintf($f,'First Name:['.$_POST['fname'].']');
fprintf($f,"\n");
fprintf($f,'Last Name:['.$_POST['lname'].']');
fprintf($f,"\n");
fprintf($f,'Gender:['.$_POST['gender'].']');
fprintf($f,"\n");
fprintf($f,'Age:['.$_POST['age'].']');
fprintf($f,"\n");
fclose($f);
print "SUCCESS";
?>

