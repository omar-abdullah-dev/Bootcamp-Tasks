<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Profile Form</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div class="page-shell">
    <div class="profile-card form-card">
        <p class="eyebrow">User Profile</p>
        <h1>Enter Your Details</h1>
        <p class="profile-subtitle">Fill in the fields below to create your profile.</p>

        <form:form action="submitProfileForm" modelAttribute="profileModel" method="post" class="profile-form">
            <form:input path="firstName" type="text" placeholder="First Name" cssClass="profile-field" required="required"/>
            <form:input path="lastName" type="text" placeholder="Last Name" cssClass="profile-field" required="required"/>
            <form:input path="email" type="email" placeholder="Email Address" cssClass="profile-field" required="required"/>
            <form:input path="city" type="text" placeholder="City" cssClass="profile-field" required="required"/>
            <form:input path="dateOfBirth" type="date" cssClass="profile-field" required="required"/>

            <div class="form-actions">
                <input type="submit" value="Submit Profile" class="custom-btn">
            </div>
        </form:form>
    </div>
</div>
</body>
</html>
