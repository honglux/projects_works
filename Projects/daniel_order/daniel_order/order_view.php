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
	$sum_price = 0;
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		
		<?php
			$query2 = "SELECT * FROM rest.orders JOIN rest.rests USING(rest_id) WHERE order_id = ".$order_id;
			$result = $dbh->query($query2);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$rest_id = $row['rest_id'];
			$rest = $row['rest_name'];
		?>
		<h1>Order ID: <?php print $order_id; ?>.	Restaurant: <?php print $rest; ?></h1>
		<?php
			$query = "SELECT *
					FROM rest.rest_to_dish res_to_dis
					JOIN rest.dish dis USING(dish_id)
					LEFT JOIN
					(SELECT dish_id,dish_amount
					FROM rest.orders 
					JOIN rest.order_dish USING(order_id)
					WHERE order_id = ".$order_id.") ord_dis
					USING (dish_id)
					WHERE res_to_dis.rest_id = ".$rest_id." and dish_amount > 0";
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
			print "<table style='width:30%' border = 1>";
			print "<tr>";
			print "<th>Dish Name</th><th>Dish Price</th><th>Dish Amount</th>";
			print "</tr>";
			While($row = $result->fetch())
			{
				if($row['dish_amount'] == null)
				{
					$dish_amount = 0;
				}
				else {$dish_amount = $row['dish_amount'];}
				print "\n";
				print "<tr align='middle'>";
				print "<td>".$row['dish_name']."</td>
						<td>$".$row['dish_price']."</td>
						<td>".$dish_amount."</td>";
						
				print "</tr>";
			}
			print "</table>";
		?>
		<?php
		print "<br>";
		print "Total Price: ";
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			
			while($row = $result->fetch())
			{
				//print "one row";
				if($row['dish_amount'] == null)
				{
					$dish_amount = 0;
				}
				else {$dish_amount = $row['dish_amount'];}
				$sum_price = $sum_price + (float)$row['dish_price']*(float)$dish_amount;
			}
			print "$".$sum_price;
			$dbh = null;
		?>
		<br>
		<br>
		<?php
			print "<form action='ordvie_noti_trans.php?order_id=".$order_id."' method='post'>
				<input name='sub_but' type='submit' value='I GOT IT!'>
				<input name='sub_but' type='submit' value='back'>
			</form>";
		?>

	</body>
</html>