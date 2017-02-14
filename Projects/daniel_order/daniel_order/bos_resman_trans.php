 <?php

	include('database.txt');

	try 
	{	
		$dbh = new PDO('mysql:host='.$server.';port='.$port.';dbname='.$dbname, $user, $pass);
	} catch (PDOException $e) {
		print $e->getMessage();
		exit;
	} 
	
	$rest_name = $_POST['rest'];
	$sub_but = $_POST['sub_but'];
	$boss_id2 = $_GET['boss_id'];

?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>

	<body bgcolor="white">
		
		<?php
			$query = "SELECT * FROM rest.rests WHERE rest_name = "."'$rest_name'";
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$rest_id = $row['rest_id'];
			$boss_id = $row['boss_id'];
		?>
		
		<?php
			if($sub_but == 'Submit')
			{
				header("Location: rest_mana.php?rest_id=".$rest_id);
				$dbh=null;
				exit;
			}
			else if($sub_but == 'I want to edit my information')
			{
				header("Location: boss_info_chang.php?boss_id=".$boss_id);
				$dbh=null;
				exit;
			}
			else if($sub_but == 'Open a new restaurant!')
			{
				header("Location: new_rest.php?boss_id=".$boss_id2);
				$dbh=null;
				exit;
			}
			else if($sub_but == 'Log out!')
			{
				header("Location: index.php");
				$dbh=null;
				exit;
			}
			
		?>
		





	</body>
</html>