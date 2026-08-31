# Task 5: User Profile Management System (Spring MVC)

## 📌 Overview
This task implements a full **User Profile Registration System** using Spring MVC. It demonstrates Spring Form tag libraries (`<form:form>`, `<form:input>`), two-way model binding with `@ModelAttribute`, and `@DateTimeFormat` date parsing.

---

## 🎯 Learning Objectives
- Implementing two-way form data binding with `@ModelAttribute`.
- Parsing formatted dates using `@DateTimeFormat(pattern = "yyyy-MM-dd")`.
- Utilizing Spring MVC form tag libraries (`taglib prefix="form"`).
- Designing modern responsive UI views using Bootstrap 5 and custom dark glassmorphism CSS.

---

## 🏗️ Architecture & Directory Structure

```
src/com/profile/
├── model/
│   └── ProfileModel.java              # Java Bean holding firstName, lastName, email, city, dateOfBirth
├── controller/
│   └── ProfileController.java         # Handles / (form) and /submitProfileForm (data view)
└── webapp/
    ├── WEB-INF/
    │   ├── application-context.xml    # Spring MVC view resolver & component scanning
    │   ├── web.xml                    # DispatcherServlet web deployment descriptor
    │   └── view/
    │       ├── profileForm.jsp        # Registration form with Spring form tags
    │       └── profileData.jsp        # Summary table displaying submitted profile details
    └── resources/
        └── css/
            ├── style.css              # Custom responsive dark-mode styling
            └── bootstrap.min.css      # Bootstrap 5 framework stylesheet
```

---

## 🌐 Endpoints & Flow

```
User GET / ────────────────► ProfileController.showProfileForm() ────► profileForm.jsp (empty form)
                                      │
                         (User submits filled profile data)
                                      ▼
User POST /submitProfileForm ──► ProfileController.submitProfileForm() ──► profileData.jsp (summary table)
```

---

## ▶️ Deployment & Testing
1. Deploy the web module in Tomcat.
2. Open `http://localhost:8080/` in a browser.
3. Fill in the profile fields (First Name, Last Name, Email, City, Date of Birth).
4. Submit the form to review the formatted profile data table.
