<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%> 
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
  </head>
  <body>
    <h1>Register</h1>

    <springform:form method="POST" commandName="spitter">
      First Name: <springform:input path="firstName" /><br/>
        <springform:errors path="firstName"></springform:errors><br>
      Last Name: <springform:input path="lastName" /><br/>
        <springform:errors path="lastName"></springform:errors><br>
      Email: <springform:input path="email" /><br/>
        <springform:errors path="email"></springform:errors><br>
      Username: <springform:input path="username" /><br/>
        <springform:errors path="username"></springform:errors><br>
      Password: <springform:password path="password" /><br/>
        <springform:errors path="password"></springform:errors><br>
      <input type="submit" value="Register" />
    </springform:form>
  </body>
</html>
