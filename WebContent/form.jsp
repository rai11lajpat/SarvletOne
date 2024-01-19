<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>form</title>

			<style type="text/css">
				.con{
					width: 45%;
					border: 1px solid black;
					margin: auto;
					padding: 20px;
				}
			</style>
</head>
<body>

	<div class="con">
		<h1 style=text-align:center;>Login form</h1>
		<form action="FormSubmited" method="post">
		<table>
			<tr>
				<td>Enter your name:</td>
				<td><input type="text" name="userName" placeholder="enter here"/></td>
			</tr>
			<tr>
				<td>Enter your Father's name:</td>
				<td><input type="text" name="fName" placeholder="enter here"/></td>
			</tr>
			<tr>
				<td>Select Depart:</td>
				<td><select name="depart">
						<option value="bscs">BS Computer Science</option>
						<option value="bscy">BS Cyber Security</option>
						<option value="bsai">BS Artificial Intelligence</option>
						<option value="bsai">BS Mathamatics</option>					
					</select>
				</td>
			</tr>
			<tr>
				<td>Enter your Roll No:</td>
				<td><input type="text" name="rollNo" placeholder="enter here"/></td>
			</tr>
			<tr>
				<td>Enter your email:</td>
				<td><input type="text" name="email" placeholder="enter here"/></td>
			</tr>
			<tr>
				<td>Select Gender:</td>
				<td><input type="radio" name="gender" value="Male">Male &nbsp;&nbsp; <input type="radio" name="gender" value="female">Female</td>
			</tr>
			<tr>
				<td><label for="image">Select image:</label></td>
  				<td><input type="file" id="image" name="imaga" accept="image/*"></td>
			</tr>
			<tr>
				<td>Enter your Adress:</td>
				<td><textarea name="adr" rows="2"></textarea></td>
			</tr>
			<tr>
				<td style=text-align:center;><input type="checkbox" value="chacked" name="condition"></td>
				<td>Agree terms and condition</td>
			</tr>
			<tr><td></td>
				<td><input type="reset" value="Reset">
					<button type="submit">Submit</button>
				</td>
			</tr>
			</table>
			</form>
	</div>


</body>
</html>