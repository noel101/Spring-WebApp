<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<body>

	<form method="post" commandName="userBean" action="/bank3pages-spring-web/displaySuccess.do">
		
		</font> Bank name:<br> <input type="text" name="bankName" value="">
		<br> Account #:<br> <input type="text" name="accountNumber"
			value=""> <br> SSN:<br> <input type="text"
			name="ssn" value=""> <br> <br> <input type="submit"
			value="Submit">
	</form>

	<p>Click on submit".</p>

</body>
</html>