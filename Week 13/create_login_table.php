<?php
$servername = "localhost";
$username = "root";
$password = "123";
$dbname = "myDB";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
 die("Connection failed: " . $conn->connect_error);
}
$sql = "DROP TABLE login";
$conn->query($sql);
$sql = "CREATE TABLE login(id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY, user_name VARCHAR(30) NOT NULL, password VARCHAR(30) NOT NULL)";
$conn->query($sql);
$sql="INSERT INTO login VALUES ('','nice','nice')";

if ($conn->query($sql) === TRUE) {
 echo "Table MyGuests created successfully";
} else {
 echo "Error creating table: " . $conn->error;
} 
$conn->close();
?>