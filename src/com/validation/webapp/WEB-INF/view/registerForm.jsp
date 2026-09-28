<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Registration</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <style>
        .error {
            color: #ff6b6b;
            font-size: 0.85rem;
            margin-top: -8px;
            margin-bottom: 6px;
            display: block;
            text-align: left;
        }
    </style>
</head>
<body>
<div class="page-shell">
    <div class="profile-card form-card">
        <p class="eyebrow">Registration</p>
        <h1>Register Employee</h1>
        <p class="profile-subtitle">Fill in the fields below to register a new employee.</p>

        <f:form modelAttribute="employee" action="registerEmployee" method="post" class="profile-form">
            <f:input path="username" type="text" placeholder="Username" cssClass="profile-field"/>
            <f:errors cssClass="error" path="username"/>

            <f:input path="email" type="email" placeholder="Email Address" cssClass="profile-field"/>
            <f:errors cssClass="error" path="email"/>

            <f:input path="password" type="password" placeholder="Password (min 6 characters)" cssClass="profile-field"/>
            <f:errors cssClass="error" path="password"/>

            <f:input path="confirmPassword" type="password" placeholder="Confirm Password" cssClass="profile-field"/>
            <f:errors cssClass="error" path="confirmPassword"/>

            <div class="form-actions">
                <input type="submit" value="Register Now" class="custom-btn">
            </div>
        </f:form>
    </div>
</div>
</body>
</html>
