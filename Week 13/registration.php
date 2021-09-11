<?php
$link = mysqli_connect("localhost", "root", "123", "myDB");
// Check connection
if($link === false){
 die("ERROR: Could not connect. " . mysqli_connect_error());
}
//Fetching values form html
$name = mysqli_real_escape_string($link, $_REQUEST['first_name']);
$phone_no = mysqli_real_escape_string($link, $_REQUEST['phone_no']);
$email = mysqli_real_escape_string($link, $_REQUEST['email']);
$gender = mysqli_real_escape_string($link, $_REQUEST['gender']); 

// attempt insert query execution
$sql = "INSERT INTO registration VALUES ('','$name', '$phone_no', 
'$email','$gender')";
if(mysqli_query($link, $sql)){
 echo "Records added successfully.";
} else{
 echo "ERROR: Could not able to execute $sql. " . mysqli_error($link);
}
// close connection
mysqli_close($link);
?>