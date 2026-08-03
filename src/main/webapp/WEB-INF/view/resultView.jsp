<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <link>
</head>
<body>
    <div class="result-card">

        <div class="emoji">
            🎉🎂🎊
        </div>

        <h1>Congratulations!</h1>

        <p>Your Age is</p>

        <div class="age-number">
            ${age}
        </div>

        <span>Years Old</span>
<br>
<button
        type="submit"
        value="Calculate Again"
        class="custom-btn"
        onclick="window.location.href='${pageContext.request.contextPath}/';">
    Calculate Again
</button>
<%--        <a href="${pageContext.request.contextPath}/"--%>
<%--           class="btn btn-light mt-4">--%>
<%--            Calculate Again--%>
<%--        </a>--%>
    </div>
</body>
</html>
