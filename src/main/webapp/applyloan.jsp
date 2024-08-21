<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
  <title>aaply loan</title>
  <link rel="stylesheet" type="text/css" href="apply-loan.css">
</head>
<body>
	<div class="flex-container">


<img src="https://th.bing.com/th/id/OIP.FHtPitpZOf9yuck3ev7m5wAAAA?pid=ImgDet&rs=1" alt="bank logo" >
<h1>Apply Krishi Loan</h1>
</div>

	
	<form id="applyloan" action="Applyloanservlet" method="post">
	
	<div class="account">
	
  
  
  
	
	<div class="id">
		<label for="Name">Name</label>
		<input type="text" id="Name" name="Name" required>
		
	</div>
	<div class="id">
			<label for="Date of birth">D.O.B</label>
		<input type="text" id="Dateof birth" name="dateofbirth" required>
		
	</div>
	<div class="id">
	<label>Gender</label>
	 <select id="gender" name="Gender">
      <option value="M">Male</option>
      <option value="F">Female</option>
      <option value="T">Transgender</option>
      
	 </select>
	</div>
	<div class="id">
	<label for="S/O or D/O">Gaurdian Name</label>
		<input type="text" id="gaurdian" name="gaurdian" required>
	</div>
	<div class="id">
	<label for="Address">Address</label>
		<input type="text" id="Address" name="Address" required>
	</div>
	<div class="id">
	<label for="loan">Amount of Loan requested</label>
		<input type="number" id="number" name="Digit" required>
	</div>
	
	<div class="id">
	<label>Period of payment</label>
	 <select id="period" name="period" required>
      <option value="after 6 mon">After 6 mon</option>
      <option value="after 1 year">After 1 yr</option>
      
      
	 </select>
	</div>
	<div class="id">
	<label>I/We agree to pay the dues along with interest @ 8%per anum</label>
	 <select id="interest" name="interest">
      <option value="Yes">Yes</option>
      <option value="No">No</option>
      
      
	 </select>
	
	
	
	</div>
	<div class="id">
	<label for="gaurentee">Net means of Guarentee with security and additional details and value in Rupees</label>
		<input type="number" id="number" name="Digit" required>
		
	</div>
	
	
	
			<h2>Upload Documents</h2>
				<div class="id">
			<label>Adhar-card</label>
			<input type="file"  id="adhar-input" name="adhar" accept=".pdf,.jpg,.jpeg,.png">
		</div>
		<div class="id">
		<label>Pan-card</label>
			<input type="file"  id="pan-input" name="pan" accept=".pdf,.jpg,.jpeg,.png">
	</div>
	<div class="id">
	<label>Passport</label>
			<input type="file"  id="passport-input" name="pass" accept=".pdf,.jpg,.jpeg,.png">
			</div>
			<div class="id">
				<label>Signature</label>
			<input type="file"  id="Sign-input" name="sign" accept=".pdf,.jpg,.jpeg,.png">
	</div>

		
		 <button type="submit">Submit</button>
	
		</div>	
		</form>	
	</div>
	

	
	
</body>
</html>
	
	
	
	
 