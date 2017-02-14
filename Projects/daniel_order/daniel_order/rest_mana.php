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
		
		<?php
			$query = "SELECT * FROM rest.rests WHERE rest_id = ".$rest_id;
			$result = $dbh->query($query);
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
		
		<h1>Welcome!!</h1>
		<P ><font size="5">This is your restaurant: <font style="font-family:Cursive">	<?php print $rest;?>	</font>.</font></P>
		<p><font size="4">You want to?<font></p>
		<br>
		

		
		<?php
			print "<form action='resman_trans.php?rest_id=".$rest_id."' method='post'>
						<input name='edit' type='submit' value='Edit dishes'>
						<input name='edit' type='submit' value='Edit this resturant'>
						<input name='edit' type='submit' value='See previous orders'>
						<input name='edit' type='submit' value='Close this restaurant!'>
						<input name='edit' type='submit' value='Back'>
					</form>";
			$dbh = null;
		?>
		





	</body>
</html>