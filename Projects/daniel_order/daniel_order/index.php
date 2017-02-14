 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">

		<h1>Welcome to Deniel Order:</h1>

		
		<h2>Please show who you are:</h2>
		
		<?php
			$query = "SELECT * FROM rest.user;";
		?>
		
		<select name='user_name' form="select">	
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
					print "<option value=".$row['user_name'].">".$row['user_name']."</option>";
				}
				
				$dbh = null;
			?>
		</select>
		
		<br>
		<br>
		<form action="login_trans.php" method="POST" id="select">
			<input name='sub_but' type="submit" value="Submit">
			<input name='sub_but' type="submit" value="New User!!">
		</form>
		






	</body>
</html>