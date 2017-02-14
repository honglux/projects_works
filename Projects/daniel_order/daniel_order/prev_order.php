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
			$result2 = $dbh->query($query2);
			if (!$result2) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row2 = $result2->fetch()
			
		?>
	
		<h1>Here is <font style="font-family:Cursive"><?php print $row2['rest_name'];?></font>'s order history: </h1>
		
		<?php
			$query = "SELECT * FROM rest.orders 
					JOIN rest.customer USING(customer_id)
					WHERE rest_id = ".$rest_id." and statu = 'N'";
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			print "<table style='width:30%' border = 1>";
			print "<tr>";
			print "<th>Order ID</th><th>Custumer</th>";
			print "</tr>";
			while($row = $result->fetch())
			{
				print "\n";
				print "<tr align='middle'>";
				print "<td>$row[order_id]</td>
						<td>$row[customer_name]</td>
						<td>
						
						<form action='prev_orde_deta.php?order_id=".$row['order_id']."' method='post'>
							<input type='submit' value='View'>
						</form>";

				print "</td>";
				print "</tr>";
			}
			print "</table>";
		?>
		
		<?php
		print "<br>";
			print "<form action='rest_mana.php?rest_id=".$rest_id."' method='post'>
					<input type='submit' value='Back'>
				</form>";
		?>
		





	</body>
</html>