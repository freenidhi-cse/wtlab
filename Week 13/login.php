<?php
$con=mysqli_connect('localhost','root','123','myDB');
if(isset($_POST['submit'])){
$name=$_POST['username'];
$password=$_POST['password'];
$sql="SELECT user_name,password from login where user_name='$name' and password='$password'";
$result=mysqli_query($con,$sql);
if(mysqli_num_rows($result)>0)
 {
 header("location: home.php"); }else { echo "login denied"; }}?>
