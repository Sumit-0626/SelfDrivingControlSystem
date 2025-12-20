🌟🚗 SELF-DRIVING CAR CONTROL SYSTEM 🚗🌟
A Smart Java Web Platform for Vehicle Monitoring & Route Optimization
✨ Overview

The Self-Driving Car Control System is a Java-based web application for managing autonomous vehicles.
It supports multiple user roles, route planning, live vehicle tracking, and system analytics.
The project is built using Java, Servlets, JSP, JDBC, MySQL, and Dijkstra’s Algorithm.

🎯 Key Features
👑 Admin Panel

Manage Vehicles, Drivers, and Technicians

View system analytics (total & active vehicles)

Monitor system activity logs

👨‍✈️ Driver Dashboard

View assigned vehicle

Track live vehicle location

View optimized route

Update vehicle GPS location

🛠️ Technician Panel

Update vehicle status (Active / Maintenance / Inactive)

Add and view maintenance logs

⭐ New Features Added (Review 2)

✅ Activity Log System

Logs important actions like login, vehicle updates, and route changes

✅ Vehicle Status Color Indicator (GUI)

🟢 Active

🟡 Maintenance

🔴 Inactive

✅ Admin Dashboard Counters

Total vehicles

Active vehicles

✅ Data Validation

Client-side validation using JavaScript

Server-side validation using Java utility classes

✅ Error Handling

Proper try-catch blocks

User-friendly error pages

✅ Simulated Dynamic Re-Routing

Route recalculation when traffic is detected (simulated data)

🛠️ Tech Stack
💻 Programming

Java

Servlets

JSP

JDBC

🗄️ Database

MySQL

🌐 Server

Apache Tomcat 9+

🧱 Build Tool

Maven

🧮 Algorithm

Dijkstra’s Shortest Path Algorithm

📦 Project Structure
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
    └── WEB-INF/             → Config Files

🗄️ Database Schema (MySQL)
👤 users

| id | username | password | role |

🚘 vehicles

| id | vehicle_number | status | current_lat | current_lng |

🛣️ routes

| id | from_node | to_node | weight |

📋 activity_logs

| id | message | log_time |

🚀 How to Run the Project
1️⃣ Clone Repository
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem

2️⃣ Open in IDE

IntelliJ IDEA or Eclipse

Open as Maven Project

3️⃣ Create Database
CREATE DATABASE self_driving;

4️⃣ Configure Database

Update DBHelper.java with:

Host

Username

Password

5️⃣ Deploy

Run on Apache Tomcat 9+

6️⃣ Access Application
http://localhost:8080/SelfDrivingControlSystem

💡 OOP Concepts Used

Inheritance → Base User → Admin, Driver, Technician

Polymorphism → Role-based behavior

Interfaces → Trackable & updatable entities

Abstract Classes → Shared logic

🧵 Multithreading

Background thread updates vehicle GPS

Maintains live vehicle status

🗺️ Route Planning

Uses Dijkstra’s Algorithm

Finds shortest and efficient route

Supports dynamic re-routing (simulated traffic)

👥 Team Members

⭐ Sumit Maurya

⭐ Alok

⭐ Praveer Shukla

📄 License

This project is developed for educational and academic purposes.
