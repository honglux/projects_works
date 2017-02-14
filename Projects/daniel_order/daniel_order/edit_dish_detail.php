 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$dish_id=$_GET['dish_id'];
	$rest_id = $_GET['rest_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
	<?php
		$query = "SELECT * FROM rest.dish
				JOIN rest.rest_to_dish USING (dish_id)
				WHERE dish_id = ".$dish_id." and rest_id = ".$rest_id;
		$result = $dbh->query($query);
		if (!$result) 
		{
			print "execution error: </br>";
			$error = $dbh->errorInfo();
			print($error[2]);
			exit;
		}
		$row = $result->fetch();
		$dish_name = $row['dish_name'];
	?>
	
	<font size=5 style="font-family:italic; font-weight:bold;">
		<?php	print $dish_name;	?>
	</font>
	
	<?php
		
		print "<form action='edidisdet_edidis_trans.php?rest_id=".$rest_id."&dish_id=".$dish_id."' method='post'>";
		print "<p>Dish Name: <input type='text' name='dish_name' value='".$dish_name."'> </p>";
		print "<p>Dish Price: $<input type='text' name='dish_price' value='".$row['dish_price']."'> </p>";
		print "<input name='sub_but' type='submit' value='Submit'>	";
		print "<input name='sub_but' type='submit' value='Cancel'>	";
		print "<input name='sub_but' type='submit' value='Delete This Dish!!!'>";
		print "</form>";
		
		
		$dbh = null;
	?>
	
	
	
	

	</body>
</html>