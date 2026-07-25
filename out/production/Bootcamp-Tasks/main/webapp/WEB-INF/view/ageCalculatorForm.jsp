<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Age Calculator</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
    </head>
    <body>
        <form action="resultView" >
            <input type="text" placeholder="year of birth" name="yearParam" required>
            <input type="text" placeholder="month of Birth" name="monthParam" required>
            <input type="text" placeholder="day of Birth" name="dayParam" required>

<%--            <input type="submit"  value="Calculate my age" class="alert-warning">--%>
            <button type="submit" class="custom-btn">
                Calculate My Age
            </button>
        </form>
    </body>
</html>
