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
	//$edit = $_POST['edit'];

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
		<br>
		<br>
		<br>
		<br>
		<center>
			<font size="6">Are you sure you want to close this restaurant:</font>
			<br>
			<font size="6" style="font-family:Cursive"><?php	print $rest;	?>?</font>
		</center>
		<br>
		<br>
		<br>
		<center>
			<?php
				print "<form action='cloens_boss_trans.php?rest_id=".$rest_id."' method='post'>
						<input name='sub_but' type='submit' style='width:80px;height:40px;' value='Yes'>";
				print "&nbsp &nbsp &nbsp &nbsp";
				print "<input name='sub_but' type='submit' style='width:80px;height:40px;' value='No'>
					</form>";
			?> 
		</center>
		





	</body>
</html>