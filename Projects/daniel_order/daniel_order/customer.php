 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	$customer_id = $_GET['cust_id']
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">

		<h1>Welcome!!! 		
		<?php
			$query2 = "SELECT * FROM rest.customer
					JOIN rest.user USING(user_id)
					WHERE customer_id = ";
			$query2 = $query2."'".$customer_id."'";
			$result2 = $dbh->query($query2);
			$row2 = $result2->fetch();
			print $row2['customer_name'];
		?>
		</h1>
		<h2>Choose a restaurant you want to pre-order.<h2>

		
		<?php
			$query = "SELECT * FROM rest.rests;"
		?>
		
		
		
		<font size="5">
			<select name='rest' form="select">	
				<?php
				
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
						print "<option value=".$row['rest_name'].">".$row['rest_name']."</option>";
					}
					
					$dbh = null;
				?>
			</select>
			<br>
			<br>
			<?php
				print "<form action='cust_order_trans.php?cust_id=".$customer_id."' method='post' id='select'>";
				print "<input name='sub_but' type='submit' value='submit'>";
				print "&nbsp";
				print "<input name='sub_but' type='submit' value='I want to change my information!'>";
				print "&nbsp";
				print "<input name='sub_but' type='submit' value='Log out!'>";
				print "</form>";
			?>
			
		</font>



	</body>
</html>