<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Employee Form</h1>
	<sf:form method="post" action="add" modelAttribute="employee">
		<table>
			<tr>
				<td><sf:label path="id">Employee Id
</sf:label></td>
		
			<td><sf:input path="id" /></td>
			<td><sf:errors path="id" cssStyle="color:red"></sf:errors>
			</td>
				</tr>
		</table>

		<table>
			<tr>
				<td><sf:label path="name">Employee Name </sf:label></td>

				<td><sf:input path="name" /></td>
				<td><sf:errors path="name" cssStyle="color:red"></sf:errors></td>
			</tr>
		</table>

		<table>
			<tr>
				<td><sf:label path="gender">Employee Gender
</sf:label></td>
			
			<td><sf:input path="gender" /></td>
			<td><sf:errors path="gender" cssStyle="color:red"></sf:errors>
			</td>
				</tr>
		</table>

<table>
			<tr>
				<td><sf:label path="age">Employee Age
</sf:label></td>
			
			<td><sf:input path="age" /></td>
			<td><sf:errors path="age" cssStyle="color:red"></sf:errors>
			</td>
				</tr>
		</table>

<table>
			<tr>
				<td><sf:label path="salary">Employee AnuualSalary
</sf:label>
</td>
		
			<td><sf:input path="salary" /></td>
			<td><sf:errors path="salary" cssStyle="color:red"></sf:errors>
			</td>
				</tr>
		</table>
<input type="submit" value="add"/>

	</sf:form>
	

</body>
</html>