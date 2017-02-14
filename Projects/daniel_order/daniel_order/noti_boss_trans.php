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
			$query = "SELECT * FROM rest.orders
					JOIN rest.rests USING(rest_id)
					WHERE boss_id = ".$boss_id;
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
				if($row['statu']=="SUN")
				{
					//print "entered!!";
					print "<script>
								alert('Please finish all the notifications!');
							</script>";
					header("refresh:1;url=notice.php?boss_id=".$boss_id);
					$dbh = null;
					exit;
				}
			}
			header("Location: boss.php?boss_id=".$boss_id);
			$dbh = null;
			exit;
		?>
	</body>
</html>