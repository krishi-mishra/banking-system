<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ACCOUNT OPENING</title>
<link rel="stylesheet" type="text/css" href="open-account.css">
</head>
<body>
<div class="flex-container">


<img src="https://th.bing.com/th/id/OIP.FHtPitpZOf9yuck3ev7m5wAAAA?pid=ImgDet&rs=1" alt="bank logo" >
<h1>Krishi Bank</h1>
</div>
	<h2>Account Opening</h2>
	
	<div class="float-container">

		<div class="account">
			<form action="SaveaccountServlet" method="post">
				<h2>Saving account</h2>
				<input type="hidden" value = "SavingAccount" name="formName">
				<div class="id">
					<label for="Name">Name</label> <input type="text" id="Name"
						name="Name" required>

				</div>
				<div class="id">
					<label for="Date of birth">D.O.B</label> <input type="text"
						id="Dateofbirth" name="dateofbirth" required>

				</div>
				<div class="id">
					<label>Gender</label> <select id="gender" name="Gender">
						<option value="M">Male</option>
						<option value="F">Female</option>
						<option value="T">Transgender</option>

					</select>
				</div>
				<div class="id">
					<label for="S/O or D/O">Gaurdian Name</label> <input type="text"
						id="GaurdianName" name="gaurdianname" required>
				</div>
				<div class="id">
					<label for="Address">Address</label> <input type="text"
						id="Address" name="Address" required>
				</div>
				<div class="id">
					<label for="saving account balance">Initial Deposit</label> <input
						type="text" id="savingAccountBalance" name="savingAccountBalance"
						required>
				</div>
				<div class="upload">
					<h2>Upload Documents</h2>
					<label>Adhar-card</label> <input type="file" id="adhar-input"
						name="adhar" accept=".pdf,.jpg,.jpeg,.png">
				</div>
				<div class="upload">
					<label>Pan-card</label> <input type="file" id="pan-input"
						name="pan" accept=".pdf,.jpg,.jpeg,.png">
				</div>
				<div class="upload">
					<label>Passport</label> <input type="file" id="passport-input"
						name="pass" accept=".pdf,.jpg,.jpeg,.png">
				</div>
				<label>Signature</label> <input type="file" id="Sign-input"
					name="sign" accept=".pdf,.jpg,.jpeg,.png">



				<button type="submit">Submit</button>
			</form>
		</div>



		<div class="fixed">
			<form action="SaveaccountServlet" method="post">
				<h2>Fixed Deposit</h2>
				<input type="hidden" value = "FixedAccount" name="formName">

				<div class="id">
					<label for="Name">Name</label> <input type="text" id="Name"
						name="Name" required>

				</div>
				<div class="id">
					<label for="Date of birth">D.O.B</label> <input type="text"
						id="Dateof birth" name="dateofbirth" required>

				</div>
				<div class="id">
					<label>Gender</label> <select id="gender" name="Gender">
						<option value="M">Male</option>
						<option value="F">Female</option>
						<option value="T">Transgender</option>

					</select>
				</div>
				<div class="id">
					<label for="S/O or D/O">Gaurdian Name</label> <input type="text"
						id="S/O or D/O" name="gaurdianname" required>
				</div>
				<div class="id">
					<label for="Address">Address</label> <input type="text"
						id="Address" name="Address" required>
				</div>
				<div class="id">
					<label for="fixed deposit ammount">Deposit Amount</label> <input
						type="text" id="fixedDepositAmount" name="fixedDepositAmount"
						required>
				</div>
				<div class="id">
					<label for="fixed deposit term">Tenure</label> <select id="term"
						name="tenure" required>
						<option value="1">1 year</option>
						<option value="2">2 years</option>
						<option value="3">3 years</option>
						<option value="4">4 years</option>
						<option value="5">5 years</option>
						<option value="6">6 years</option>
						<option value="7">7 years</option>
						<option value="8">8 years</option>
						<option value="9">9 years</option>
						<option value="10">10 years</option>
					</select>

				</div>
				<div class="upload">
					<h2>Upload Documents</h2>
					<label>Adhar-card</label> <input type="file" id="adhar-input"
						name="adhar" accept=".pdf,.jpg,.jpeg,.png">
				</div>
				<div class="upload">
					<label>Pan-card</label> <input type="file" id="pan-input"
						name="pan" accept=".pdf,.jpg,.jpeg,.png">
				</div>
				<div class="upload">
					<label>Passport</label> <input type="file" id="passport-input"
						name="pass" accept=".pdf,.jpg,.jpeg,.png">
				</div>
				<label>Signature</label> <input type="file" id="Sign-input"
					name="sign" accept=".pdf,.jpg,.jpeg,.png">

				<button type="submit">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>


