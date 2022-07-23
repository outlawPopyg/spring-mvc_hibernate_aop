<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee info</title>
</head>
<body>
    <h2>Employee info</h2>
    <form:form action="saveEmployee" modelAttribute="employee">
        <form:hidden path="id" />
        <div>Name: <form:input path="name" /></div>
        <div>Surname <form:input path="surname" /></div>
        <div>Department <form:input path="department"/></div>
        <div>Salary <form:input path="salary" /></div>

        <div><button>save</button></div>
    </form:form>
</body>
</html>
