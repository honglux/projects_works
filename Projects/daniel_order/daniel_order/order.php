 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$sum_price = 0;
	$order_id = $_GET['order_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		<?php
			$query3 = "SELECT * FROM rest.orders JOIN rest.rests USING(rest_id) WHERE order_id = ".$order_id;
			$result = $dbh->query($query3);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$rest_name = $row['rest_name'];
			$rest_id = $row['rest_id'];
		?>
		<p>
		<font size=6>
		<font style="font-family:Cursive">
			<?php
				print $rest_name;
			?>
		</font>
		&nbsp open time: <?php	print $row['open_time']	?>:00 ---- <?php	print $row['close_time']	?>:00
		</font>
		
		</p>
		
		<h2>Order some dishes here:<h2>
		
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
					WHERE res_to_dis.rest_id = ".$rest_id.";";
			$query = $query.$rest_id;
		?>
		
		
		
		<font size="4">	
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
				print "<th>Dish</th><th>Price</th>";
				print "</tr>";
				while($row = $result->fetch())
				{
					if($row['dish_amount'] == null)
					{
						$dish_amount = 0;
					}
					else {$dish_amount = $row['dish_amount'];}
					print "\n";
					print "<tr align='middle'>";
					//print "<td>$row[dish_name]</td>";
					print "<td>$row[dish_name]</td>
							<td>$$row[dish_price]</td>
							<td>
							
							<form action='order_trans.php?dish_order_id=".$row['dish_id']."&order_id=".$order_id."' method='post'>
								<input name='add_or_del' type='submit' value='-'>
								".$dish_amount."
								<input name='add_or_del' type='submit' value='+'>
							</form>";

					print "</td>";
					print "</tr>";
				}
				print "</table>";
				
			?>
			
			
			<!--<p id="total_price">Total Price: 0</p>-->
			
			<?php
				print "<hr> Total price: ";
				/*
				$query2 = "SELECT * FROM rest.order_dish
						JOIN rest.rest_to_dish USING(dish_id)
						WHERE rest_id = ".$rest_id;
				$result = $dbh->query($query2);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				*/
				
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
				print "<form action='order_back_trans.php?order_id=".$order_id."' method='POST'>
					<input name='sub_but' type='submit' value='submit'>
					<input name='sub_but' type='submit' value='clear'>
					<input name='sub_but' type='submit' value='back'>
				</form>";
			?>
			
		</font>



	</body>
</html>