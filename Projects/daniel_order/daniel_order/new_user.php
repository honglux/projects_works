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
	
		<h1>Enter your information here:</h1>

		<p>
		You are: 
		<select name='cust_boss' form="select">	
			<option value="customer">customer</option>
			<option value="boss">boss</option>
		</select>
		</p>
			
		<form action='newuse_trans.php' method='post' id='select'>
		
		<p>Your user name(account name): <input type='text' name='user_name' value=''> </p>
		<p>Your name: <input type='text' name='user_real_name' value=''> </p>
		<p>Your address: <input type='text' name='user_address' value=''> </p>
		<p>Your age: <input type='text' name='user_age' value=''> </p>
		<p>Your gender: <input type='text' name='user_gender' value=''> </p>
		<p>Your SSN: <input type='text' name='user_ssn' value=''> </p>
		

		
		<input name='sub_but' type='submit' value='Submit'>
		<input name='sub_but' type='submit' value='Cancel'>
		
		</form>

	
	
	
	

	</body>
</html>