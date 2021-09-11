<?php
$servername = "localhost";
$username = "root";
$password = "123";
$dbname = "myDB";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
 die("Connection failed: " . $conn->connect_error);
}
$sql = "DROP TABLE Registration";
$conn->query($sql);
$sql = "CREATE TABLE Registration(id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,name VARCHAR(30) NOT NULL, Phone_no int(30) NOT NULL, email VARCHAR(50), gender varchar(20))";


if ($conn->query($sql) === TRUE) {
 echo "Table Registration created successfully";
} else {
 echo "Error creating table: " . $conn->error;
} 
$conn->close();
?>