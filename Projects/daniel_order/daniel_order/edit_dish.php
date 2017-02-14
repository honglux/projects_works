 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	//$boss_id=$_GET['boss_id'];
	$rest_id = $_GET['rest_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
	<?php
		$query2 = "SELECT * FROM rest.rests WHERE rest_id = ".$rest_id;
		$result = $dbh->query($query2);
		if (!$result) 
		{
			print "execution error: </br>";
			$error = $dbh->errorInfo();
			print($error[2]);
			exit;
		}
		$row = $result->fetch();
		$rest = $row['rest_name'];
	?>
	
	<font size=5 style="font-family:Cursive">
		<?php	print $rest;	?>
	</font>
	<br>
	<br>
	<font size=4>Edit the dishes here:</font>
	<br>
	<br>
	<?php
		$query = "SELECT * FROM rest.rest_to_dish
				JOIN rest.dish USING (dish_id)
				WHERE rest_id = ".$rest_id;
		$result = $dbh->query($query);
		if (!$result) 
		{
			print "execution error: </br>";
			$error = $dbh->errorInfo();
			print($error[2]);
			exit;
		}
	?>
	<?php
		print "<table style='width:30%' border = 1>";
		print "<tr>";
		print "<th>Dish</th><th>Price</th>";
		print "</tr>";
		while($row = $result->fetch())
		{
			print "\n";
			print "<tr align='middle'>";
			//print "<td>$row[dish_name]</td>";
			print "<td>$row[dish_name]</td>
					<td>$row[dish_price]</td>
					<td>
					<form action='edit_dish_detail.php?rest_id=".$rest_id."&dish_id=".$row['dish_id']."' method='post'>
						<input type='submit' value='edit'>
					</form>";
			print "</td>";
			print "</tr>";
		}
		print "</table>";
		
	?>
	
	<br>
	
	<?php
		print "<form action='add_dish.php?rest_id=".$rest_id."' method='post'>
				<input type='submit' value='Add a New Dish!'>
			</form>";
		
		/*
		$query3 = "SELECT * FROM rest.rests WHERE rest_id = ".$rest_id;
		$result2 = $dbh->query($query3);
		if (!$result2) 
		{
			print "execution error: </br>";
			$error = $dbh->errorInfo();
			print($error[2]);
			exit;
		}
		$row2 = $result2->fetch();
		*/
		
		print "<form action='rest_mana.php?rest_id=".$rest_id."' method='post'>
				<input type='submit' value='Back'>
			</form>";
		$dbh = null;
	?>
	


	</body>
</html>