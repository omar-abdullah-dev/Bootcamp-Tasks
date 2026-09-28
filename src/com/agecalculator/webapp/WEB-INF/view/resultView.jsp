<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Result</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
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
        <br><br>
        <button
            type="button"
            class="custom-btn"
            onclick="window.location.href='${pageContext.request.contextPath}/';">
            Calculate Again
        </button>
    </div>
</body>
</html>
