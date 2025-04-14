# 🗒️ Notes Makers Testing Project

## Project Overview
Welcome to the **Notes Makers Testing Project**! This document provides a structured overview of the testing strategy, execution, automation, and findings for the Notes Makers web application.

🔗 **Project URL:** [Notes Makers Login Page](https://notes-makers.vercel.app/pages/login)
 ## 🎥 Video Presentation

Watch the complete walkthrough of the Notes Makers Testing Project in this video:
🔗 https://drive.google.com/file/d/1FvXV_FaCLhkT5b7SfR__29E5RH4jt7e-/view?usp=drive_link

> 📌 The video includes:  
> ✅ Test Plan Overview  
> ✅ Test Execution & Results  
> ✅ Bug Reports & Key Findings  
> ✅ Automation Demo using Selenium (Login, Dashboard, Notes, To-Do)

---

## 📌 Table of Contents
1. [📖 Introduction](#introduction)
2. [🎯 Objectives](#objectives)
3. [🔍 Scope](#scope)
4. [📂 Test Deliverables](#test-deliverables)
5. [🛠 Tools Used](#tools-used)
6. [🗓 Testing Schedule](#testing-schedule)
7. [📁 Project Structure](#project-structure)
8. [🤖 Automation Testing](#automation-testing)
9. [📊 Test Summary Report](#test-summary-report)
10. [✅ Approvals](#approvals)

---

## 📖 Introduction
This document outlines the QA process for the **Notes Makers Application**, including **Test Plan**, **Test Scenarios**, **Test Cases**, **Bug Reports**, **Automation Testing**, and a **Test Summary Report**.

✅ **Key Highlights:**
- Manual & Automated Testing (Selenium POM)  
- Responsive UI & Cross-browser Verification  
- Core Functional, UI/UX & Performance Testing  

---

## 🎯 Objectives
✔️ Verify Login, Dashboard, Notes, and To-Do Modules  
✔️ Ensure mobile responsiveness and compatibility  
✔️ Identify bugs and optimize user experience  
✔️ Automate core flows to reduce regression effort

---

## 🔍 Scope

### ✅ What was tested?
- 🔐 Login & Signup workflows  
- 🧭 Dashboard Navigation  
- 📝 Notes (Create, Update, Delete)  
- 📋 To-Do List management  
- ✅ Form validations & responsiveness  

### ❌ Not Covered:
- 🚫 API Testing  
- 🚫 Backend DB validation

---

## 📂 Test Deliverables
📑 **1. Test Plan** – Strategy and scope  
📑 **2. Test Scenarios** – Workflow-based coverage  
📑 **3. Test Cases** – Step-by-step execution details  
🐞 **4. Bug Reports** – Logged issues with screenshots  
📊 **5. Summary Report** – Coverage, results & metrics  
🤖 **6. Automation Scripts** – Selenium-based POM Framework

---

## 🛠 Tools Used
- 📝 Google Docs & Sheets – Documentation  
- 🧪 Selenium + Java + TestNG – Automation Framework  
- 📦 Maven – Build tool  
- 💻 Eclipse – IDE  
- 🐙 GitHub – Version Control  
- 🌍 Browsers: Chrome, Firefox, Edge  

---

## 🗓 Testing Schedule
| 📌 Task                     | 📅 Completion Date |
|-----------------------------|--------------------|
| 📝 Test Plan Created        | 11/04/2025         |
| 🧾 Test Case Design         | 11/04/2025         |
| 🧪 Manual Test Execution    | 11/04/2025         |
| 🐞 Bug Reporting            | 14/04/2025         |
| 📊 Summary Report Submitted | 14/04/2025         |

---

## 📁 Project Structure
```plaintext
├── TestPlan/
│   └── NotesMakers_Test_Plan.md
├── TestScenarios/
│   └── Login_Scenarios.xlsx
├── TestCases/
│   ├── Login_TestCases.xlsx
│   ├── Dashboard_TestCases.xlsx
│   ├── ToDo_TestCases.xlsx
├── Automation/
│   ├── pom.xml
│   ├── src/
│   │   ├── test/
│   │   │   ├── LoginTest.java
│   │   │   ├── DashboardTest.java
│   │   │   ├── NotesTest.java
│   │   │   └── ToDoTest.java
│   │   └── pages/
│   │       ├── LoginPage.java
│   │       ├── DashboardPage.java
│   │       ├── NotesPage.java
│   │       └── ToDoPage.java
├── BugReports/
│   └── NotesMakers_Bug_Report.md
├── SummaryReport/
│   └── NotesMakers_Test_Summary.md
├── README.md
🤖 Automation Testing
🚀 Automation Framework:
The project uses the Page Object Model (POM) design pattern with the following stack:

💻 Selenium WebDriver for UI automation

☕ Java as the core programming language

✅ TestNG for test execution and assertions

🧩 Maven for dependency management

📂 Eclipse IDE for project development

🔧 Automated Modules:

🔐 Login – Valid & invalid login tests, error validations

🧭 Dashboard – UI verification & navigation flow

📝 Notes – Add, edit, delete note scenarios

✅ To-Do – Add, check, uncheck, and remove tasks

📦 Tests are modular and maintainable, with reusable page methods to ensure consistency and reduce code duplication.

📊 Test Summary Report
✅ Test Execution Results
Total Test Cases: 68

✅ Passed: 50

❌ Failed: 18

🔍 Category-wise Breakdown
### 🔍 Category-wise Breakdown

| 📂 **Category**         | 📋 **Executed** | ✅ **Passed** | ❌ **Failed**|
|-------------------------|-----------------|---------------|---------------|
| Functional Testing      | 36              | 28            | 8             |
| Performance Testing     | 3               | 2             | 1             |
| Usability Testing       | 10              | 8             | 2             |
| Compatibility Testing   | 1               | 0             | 1             |
| Security Testing        | 5               | 4             | 1             |
| UI/UX Testing           | 12              | 8             | 4             |

### ⏱️ Performance Metrics

| 📌 **Test Type**         | ⏲️ **Result**     | 🎯 **Expected Limit** |
|--------------------------|--------------------|------------------------|
| Login Page Load          | 3.64 seconds       | < 3 seconds            |
| Add Note Response        | 2.6 seconds        | < 2 seconds            |

✅ Approvals
 Test Plan Approved
 Test Cases Approved
 Bug Reports Reviewed
 Automation Suite Reviewed
 Summary Report Finalized

✅ Conclusion

The Login Page of Notes Makers needs more work to improve the overall user experience.
❌ Form validation isn’t working as expected
⚠ Error messages need to be more clear and user-friendly
🔐 Password recovery option is missing or not working properly
📱 The page doesn’t respond well on mobile devices, and users don’t get clear feedback after login attempts

