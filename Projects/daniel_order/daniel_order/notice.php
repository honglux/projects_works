 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	$boss_id = $_GET['boss_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		<?php
			$query2 = "SELECT * FROM rest.boss WHERE boss_id = ".$boss_id;
			$result = $dbh->query($query2);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$boss_name = $row['boss_name'];
		?>
		<h1>Welcome!!!  <?php print $boss_name; ?>!!!</h1>
		<h2>Please take these orders!</h2>
		<?php
			$query = "SELECT * FROM rest.orders
					JOIN rest.rests USING(rest_id)
					WHERE boss_id = ".$boss_id." and statu = 'SUN'";
		?>
		<?php
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$counter = 0;
			print "<table style='width:30%' border = 1>";
			print "<tr>";
			print "<th>Order ID</th><th>Restaurant</th>";
			print "</tr>";
			while($row = $result->fetch())
			{
				$order_id = $row['order_id'];
				//$counter = $counter + 1;
				print "\n";
				print "<tr align='middle'>";
				print "<td>".$order_id."</td>
						<td>".$row['rest_name']."</td>
						<td>
						
						<form action='order_view.php?order_id=".$order_id."' method='post'>
							<input type='submit' value='View'>
						</form>";

				print "</td>";
				print "</tr>";
			}
			print "</table>";
			$dbh = null;
		?>
		<br>
		<?php
			//print $boss_id."boss_id```";
			print "<form action='noti_boss_trans.php?boss_id=".$boss_id."' method='post'>
						<input type='submit' value='I AM DONE!'>
					</form>";
		?>
	
		





	</body>
</html>