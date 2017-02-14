 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$rest_id = $_GET['rest_id'];
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
	<h2>Add A Dish Here:</h2>
	
	<?php
		
		print "<form action='adddis_edidis_trans.php?rest_id=".$rest_id."' method='post'>";
		print "<p>Dish Name: <input type='text' name='dish_name' value=''> </p>";
		print "<p>Dish Price: $<input type='text' name='dish_price' value=''> </p>";
		print "<input name='sub_but' type='submit' value='Submit'>	";
		print "<input name='sub_but' type='submit' value='Cancel'>	";
		print "</form>";
		
		
		$dbh = null;
	?>
	
	
	

	</body>
</html>