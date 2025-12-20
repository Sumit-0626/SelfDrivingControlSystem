# 🚗 Self-Driving Car Control System

**A Smart Java Web Platform for Vehicle Monitoring & Route Optimization**

---

## 🌟 Overview

The **Self-Driving Car Control System** is a Java-based web application designed to manage and monitor autonomous vehicles.
It supports multiple user roles, optimized route planning, live vehicle tracking, and system analytics.

The application is built using **Java, Servlets, JSP, JDBC, MySQL**, and **Dijkstra’s Shortest Path Algorithm**.

---

## 🎯 Key Features

### 👑 Admin Panel

* Manage vehicles, drivers, and technicians
* View system analytics (total and active vehicles)
* Monitor system activity logs

### 👨‍✈️ Driver Dashboard

* View assigned vehicle
* Track live vehicle location
* View optimized routes
* Update vehicle GPS location

### 🛠️ Technician Panel

* Update vehicle status (Active / Maintenance / Inactive)
* Add and view maintenance logs

---

## ⭐ New Features (Review 2)

* **Activity Log System**
  Logs actions such as login, vehicle updates, and route changes

* **Vehicle Status Color Indicators (GUI)**

  * 🟢 Active
  * 🟡 Maintenance
  * 🔴 Inactive

* **Admin Dashboard Counters**

  * Total vehicles
  * Active vehicles

* **Data Validation**

  * Client-side validation using JavaScript
  * Server-side validation using Java utility classes

* **Error Handling**

  * Proper try-catch blocks
  * User-friendly error pages

* **Simulated Dynamic Re-Routing**

  * Route recalculation when traffic is detected (simulated data)

---

## 🛠️ Tech Stack

### 💻 Programming

* Java
* Servlets
* JSP
* JDBC

### 🗄️ Database

* MySQL

### 🌐 Server

* Apache Tomcat 9+

### 🧱 Build Tool

* Maven

### 🧮 Algorithm

* Dijkstra’s Shortest Path Algorithm

---

## 📦 Project Structure

```
SelfDrivingControlSystem/
├── src/
│   └── main/
│       └── java/com/sdcs/
│           ├── auth/        → Authentication & Login
│           ├── model/       → User, Vehicle, Driver, Technician
│           ├── service/     → Business Logic & Logs
│           ├── algo/        → Route Algorithms
│           ├── servlet/     → Servlets
│           ├── util/        → Validation Utilities
│           └── db/          → DBHelper (JDBC)
└── webapp/
    ├── pages/               → JSP Pages
    ├── css/                 → Stylesheets
    ├── js/                  → JavaScript
    └── WEB-INF/             → Configuration Files
```

---

## 🗄️ Database Schema (MySQL)

### 👤 Users Table

| id | username | password | role |

### 🚘 Vehicles Table

| id | vehicle_number | status | current_lat | current_lng |

### 🛣️ Routes Table

| id | from_node | to_node | weight |

### 📋 Activity Logs Table

| id | message | log_time |

---

## 🚀 How to Run the Project

### 1️⃣ Clone the Repository

```
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem
```

### 2️⃣ Open in IDE

* IntelliJ IDEA or Eclipse
* Open as a Maven Project

### 3️⃣ Create Database

```sql
CREATE DATABASE self_driving;
```

### 4️⃣ Configure Database

Update `DBHelper.java` with:

* Database host
* Username
* Password

### 5️⃣ Deploy

* Run the project on **Apache Tomcat 9+**

### 6️⃣ Access the Application

```
http://localhost:8080/SelfDrivingControlSystem
```

---

## 💡 OOP Concepts Used

* **Inheritance** – Base `User` → `Admin`, `Driver`, `Technician`
* **Polymorphism** – Role-based behavior
* **Interfaces** – Trackable and updatable entities
* **Abstract Classes** – Shared business logic

---

## 🧵 Multithreading

* Background thread updates vehicle GPS
* Maintains live vehicle status

---

## 🗺️ Route Planning

* Uses **Dijkstra’s Algorithm**
* Finds shortest and most efficient route
* Supports dynamic re-routing (simulated traffic)

---

## 👥 Team Members

* ⭐ Sumit Maurya
* ⭐ Alok
* ⭐ Praveer Shukla

---

## 📄 License

This project is developed for **educational and academic purposes only**.

---
