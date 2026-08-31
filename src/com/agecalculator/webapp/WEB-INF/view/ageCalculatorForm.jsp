<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Age Calculator</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css">
    </head>
    <body>
        <form action="resultView">
            <input type="text" placeholder="Year of Birth (e.g. 2000)" name="yearParam" required>
            <input type="text" placeholder="Month of Birth (1-12)" name="monthParam" required>
            <input type="text" placeholder="Day of Birth (1-31)" name="dayParam" required>

            <button type="submit" class="custom-btn">
                Calculate My Age
            </button>
        </form>
    </body>
</html>
