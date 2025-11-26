# 🚗 **Self-Driving Car Control System**

A robust **Java Web Application** designed to manage **self-driving vehicles**, **users**, and **route planning** using **Servlets, JSP, JDBC, MySQL**, and **Dijkstra’s Algorithm**.

---

## 🎯 **Project Overview**

This system supports multiple **user roles**, each with different permissions:

### 👑 **Admin**

* Manage vehicles
* Manage drivers
* Manage technicians
* View full system data

### 👨‍✈️ **Driver**

* Track assigned vehicle
* View assigned route
* Update vehicle location

### 🛠️ **Technician**

* Update vehicle status
* Add maintenance logs

---

## 🛠️ **Technologies Used**

### 💻 **Programming**

* **Java**
* **Servlets**
* **JSP**
* **JDBC**

### 🗄️ **Database**

* **MySQL**

### 🌐 **Server**

* **Apache Tomcat 9+**

### 🧱 **Build Tool**

* **Maven**

### 🧮 **Algorithm**

* **Dijkstra’s Shortest Path Algorithm**

---

## 📦 **Project Structure**

✨ *Clean and professional folder structure (like your friend's repo)*

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
    ├── pages/                  → JSP UI
    ├── css/                    → Styling
    ├── js/                     → Scripts
    └── WEB-INF/                → Config files
```

---

## 🗄️ **Database Schema**

### 👤 **users**

| id | username | password | role |

### 🚘 **vehicles**

| id | vehicle_number | status | current_lat | current_lng |

### 🛣️ **routes**

| id | from_node | to_node | weight |

---

## 🚀 **How to Run the Project**

### 1️⃣ **Clone Repository**

```bash
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem
```

### 2️⃣ **Import Project**

Open as **Maven Project** in IntelliJ IDEA or Eclipse.

### 3️⃣ **Create Database**

```sql
CREATE DATABASE self_driving;
```

### 4️⃣ **Configure Database**

Update `DBHelper.java` with:

* host
* username
* password

### 5️⃣ **Run the Project**

Deploy on **Apache Tomcat 9+**.

### 6️⃣ **Open in Browser**

```
http://localhost:8080/SelfDrivingControlSystem
```

---

## 💡 **OOP Concepts Used**

* **Inheritance** → Base `User` class extended by Admin, Driver, Technician
* **Polymorphism** → Different implementations of user actions
* **Interfaces** → For trackable updates
* **Abstract classes** → Shared logic and behavior

---

## 🧵 **Multithreading Feature**

Background thread that:

* Refreshes vehicle GPS position
* Updates live status

---

## 📍 **Route Planning**

Implements **Dijkstra’s Algorithm** to compute optimal and shortest routes.

---

## 👥 **Team Members**

* **Sumit Maurya**
* **Alok**
* **Praveer Shukla**

---

## 📄 **License**

This project is intended **for educational purposes only**.

---

