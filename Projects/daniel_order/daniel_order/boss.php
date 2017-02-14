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
			$query = "SELECT * FROM rest.boss WHERE boss_id=".$boss_id;
			$result = $dbh->query($query);
			if (!$result) 
			{
				print "1 execution error: </br>";
				$error = $dbh->errorInfo();
				print($error[2]);
				exit;
			}
			$row = $result->fetch();
			$boss_name = $row['boss_name'];
		?>
		<h1>Welcome!!! <?php print $boss_name; ?>!!!</h1>
		<h2>Choose a restaurant to edit.</h2>
		
		<?php
			$query2 = "SELECT * FROM rest.rests WHERE boss_id=".$boss_id;
		?>
		
		<font size="5">
			<select name='rest' form="select">
				<?php
				
					$result = $dbh->query($query2);

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
					
					//$dbh = null;
				?>
			</select>
			
			<br>
			<br>
			
			<?php
				print "<form action='bos_resman_trans.php?boss_id=".$boss_id."' method='post' id='select'>";
				print "<input name='sub_but' type='submit' value='Submit'>";
				print "&nbsp";
				print "<input name='sub_but' type='submit' value='I want to edit my information'>";
				print "&nbsp";
				print "<input name='sub_but' type='submit' value='Open a new restaurant!'>";
				print "&nbsp";
				print "<input name='sub_but' type='submit' value='Log out!'>";
				print "</form>";
				$dbh=null;
			?>
			
		</font>

		





	</body>
</html>