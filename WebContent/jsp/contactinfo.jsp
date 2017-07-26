<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>
	<h2>Enter Contact Info</h2>
	<form method="post" commandName="userBean" action="/bank3pages-spring-web/addBankInfo.do" >

		
	
		Address:<br> <input
			type="text" name="address" value=""> <br> City:<br>
			<input type="text" name="city" value=""> <br> State:<br>
			<input type="text" name="state" value=""> <br> Country:<br>
			<input type="text" name="country" value=""> <br> Phone:<br>
			<input type="text" name="phone" value=""> <br> <br>

			<input type="submit" value="Submit">
	</form>

	<p>Click on submit to go to Bank info".</p>

</body>
</html>