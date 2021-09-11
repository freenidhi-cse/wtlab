<?php
$link = mysqli_connect("localhost", "root", "123", "myDB");
// Check connection
if($link === false){
 die("ERROR: Could not connect. " . mysqli_connect_error());
}
// Attempt update query execution
$sql = "UPDATE registration SET email='xyz@abcdmail.com' WHERE id=1";
if(mysqli_query($link, $sql)){
 echo "Records were updated successfully.";
} else {
 echo "ERROR: Could not able to execute $sql. " . mysqli_error($link);}
// Close connection
mysqli_close($link);
?>