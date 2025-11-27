# 🌟🚗 **SELF-DRIVING CAR CONTROL SYSTEM** 🚗🌟

### *A Smart Java Web Platform for Autonomous Vehicle Monitoring & Route Optimization*

---

## ✨ **Overview**

Welcome to the **Self-Driving Car Control System**, a powerful Java-based web application designed for **autonomous vehicle management**, **route planning**, and **multi-role user control**.
Built using **Servlets, JSP, JDBC, MySQL**, and powered by **Dijkstra’s Algorithm**.

---

# 🎯 **PROJECT FEATURES**

## 👑 **ADMIN PANEL**

* 🚘 Manage Vehicles
* 👨‍✈️ Manage Drivers
* 🛠️ Manage Technicians
* 📊 View Entire System Analytics

---

## 👨‍✈️ **DRIVER DASHBOARD**

* 📍 Track Assigned Vehicle
* 🛣️ View Assigned Route
* 🔄 Update Vehicle Live Location

---

## 🛠️ **TECHNICIAN PANEL**

* ⚙️ Update Vehicle Status
* 📝 Add & View Maintenance Logs

---

# 🛠️ **TECH STACK**

## 💻 **Programming**

* ⭐ **Java**
* ⭐ **Servlets**
* ⭐ **JSP**
* ⭐ **JDBC**

## 🗄️ **Database**

* 🐬 **MySQL**

## 🌐 **Server**

* 🚀 **Apache Tomcat 9+**

## 🧱 **Build Tool**

* 🔧 **Maven**

## 🧮 **Algorithm**

* 📍 **Dijkstra's Shortest Path Algorithm**

---

# 📦 **PROJECT STRUCTURE**

```
SelfDrivingControlSystem/
├── src/
│   └── main/
│       └── java/com/sdcs/
│           ├── auth/           → Login & Authentication
│           ├── model/          → User, Admin, Driver, Technician, Vehicle
│           ├── service/        → Database Services
│           ├── algo/           → Dijkstra Algorithm
│           ├── servlet/        → Servlets
│           └── db/             → DBHelper for JDBC
└── webapp/
    ├── pages/                  → JSP User Interface
    ├── css/                    → Stylesheets
    ├── js/                     → Javascript Files
    └── WEB-INF/                → Configuration Files
```

---

# 🗄️ **DATABASE SCHEMA**

### 👤 **users**

| id | username | password | role |

### 🚘 **vehicles**

| id | vehicle_number | status | current_lat | current_lng |

### 🛣️ **routes**

| id | from_node | to_node | weight |

---

# 🚀 **HOW TO RUN THE PROJECT**

## 1️⃣ **Clone the Repository**

```bash
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem
```

## 2️⃣ **Open in IDE**

Use **IntelliJ IDEA** or **Eclipse** → *Open as Maven Project*

## 3️⃣ **Create Database**

```sql
CREATE DATABASE self_driving;
```

## 4️⃣ **Configure Database**

Update `DBHelper.java` with:

* 🔗 host
* 👤 username
* 🔐 password

## 5️⃣ **Deploy**

Run the project on **Apache Tomcat 9+**

## 6️⃣ **Access in Browser**

👉 `http://localhost:8080/SelfDrivingControlSystem`

---

# 💡 **OOP CONCEPTS IMPLEMENTED**

* 🧬 **Inheritance** → Base `User` class → Admin, Driver, Technician
* 🔁 **Polymorphism** → Different role-based behaviors
* 📑 **Interfaces** → For trackable and updatable entities
* 🧩 **Abstract Classes** → Encapsulating shared logic

---

# 🧵 **MULTITHREADING FEATURE**

A background worker thread:

* 🔄 Updates vehicle GPS in real time
* 📡 Maintains live vehicle status

---

# 🗺️ **ROUTE PLANNING**

Implements **Dijkstra’s Algorithm** to generate the **shortest & most efficient route** between nodes.

---

# 👥 **TEAM MEMBERS**

* ⭐ **Sumit Maurya**
* ⭐ **Alok**
* ⭐ **Praveer Shukla**

---

# 📄 **LICENSE**

This project is built **for educational and academic purposes**.

---
