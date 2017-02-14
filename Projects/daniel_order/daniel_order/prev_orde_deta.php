 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$order_id = $_GET['order_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
	
		<?php
			$query = "SELECT * FROM rest.orders
					JOIN rest.customer USING(customer_id)
					WHERE order_id = ".$order_id;
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
		?>
		
		<h1>Order <?php	print $order_id;	?>:</h1>
		<h2>Ordered By: <?php	print $row['customer_name']?>.</h2>
		
		
		<?php
			$query2 = "SELECT * FROM rest.order_dish
					JOIN rest.dish USING(dish_id)
					WHERE order_id = ".$order_id;
			$result2 = $dbh->query($query2);
			if (!$result2) 
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
			print "<th>Dish</th><th>Amount</th>";
			print "</tr>";
			while($row2 = $result2->fetch())
			{
				if($row2['dish_amount'] == null)
				{
					$dish_amount = 0;
				}
				else {$dish_amount = $row2['dish_amount'];}
				print "\n";
				print "<tr align='middle'>";
				//print "<td>$row[dish_name]</td>";
				print "<td>$row2[dish_name]</td>
						<td>$dish_amount</td>";
				print "</tr>";
			}
			print "</table>";
		?>
		
		<?php
			$query3 = "SELECT * FROM rest.orders
					WHERE order_id = ".$order_id;
			$result3 = $dbh->query($query3);
			if (!$result3) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row3 = $result3->fetch();
			
			print "<br>";
			
			print "<form action='prev_order.php?rest_id=".$row3['rest_id']."' method='post'>
					<input type='submit' value='Back'>
				</form>";
		?>

		





	</body>
</html>