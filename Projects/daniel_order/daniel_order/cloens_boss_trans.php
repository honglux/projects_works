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
	$sub_but = $_POST['sub_but'];
?>

<html>
	<head>
		   <title>Daniel Order</title>
	</head>
	
	<body bgcolor="white">
		
		<?php
			
			$query = "SELECT * FROM rest.rests WHERE rest_id = '".$rest_id."'";
			$result2 = $dbh->query($query);
			if (!$result2) 
			{
				print "execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row2 = $result2->fetch();
			$boss_id = $row2['boss_id'];
			
		?>
		
		<?php
			if($sub_but == 'Yes')
			{
				$excu_query = "DELETE FROM `rest`.`orders` WHERE `rest_id`='".$rest_id."';
							DELETE FROM `rest`.`rest_to_dish` WHERE `rest_id`='".$rest_id."';
							DELETE FROM `rest`.`rests` WHERE `rest_id`='".$rest_id."';";
				$result = $dbh->query($excu_query);
				if (!$result) 
				{
					print "execution error: </br>";
					$error = $dbh->errorInfo();
					print($error[2]);
					exit;
				}
				$row = $result->fetch();
				
				print "<script>
						alert('Success!!');
					</script>";
				header("refresh:1;url=boss.php?boss_id=".$boss_id);
				$dbh = null;
				exit;
				
				
			}
			else if($sub_but == 'No')
			{
				header("Location: rest_mana.php?rest_id=".$rest_id);
				$dbh = null;
				exit;
			}
		?>





	</body>
</html>