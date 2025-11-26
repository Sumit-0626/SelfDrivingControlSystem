🚗 Self-Driving Car Control System

A Java web application that manages self-driving vehicle data, users, and route planning.
It uses Servlets, JSP, JDBC, MySQL, OOP concepts, and Dijkstra’s Algorithm.

🎯 Project Overview

The system provides different user roles:

Admin

Manage vehicles

Manage drivers

Manage technicians

View system data

Driver

Track assigned vehicle

View route

Update vehicle location

Technician

Update vehicle status

Maintenance logs

🛠️ Technologies Used

Programming

Java

Servlets

JSP

JDBC

Database

MySQL

Server

Apache Tomcat 9+

Build Tool

Maven

Algorithm

Dijkstra Shortest Path

📦 Project Structure

✨ This is the clean style you want (like your friend)

SelfDrivingControlSystem/
├── src/
│   └── main/
│       └── java/com/sdcs/
│           ├── auth/           → Login and Authentication
│           ├── model/          → User, Admin, Driver, Technician, Vehicle
│           ├── service/        → Database Services
│           ├── algo/           → Dijkstra Algorithm
│           ├── servlet/        → Servlets
│           └── db/             → DBHelper for JDBC
└── webapp/
    ├── pages/                  → JSP UI
    ├── css/                    → Style
    ├── js/                     → Script
    └── WEB-INF/                → Config files

🗄️ Database Tables
users

| id | username | password | role |

vehicles

| id | vehicle_number | status | current_lat | current_lng |

routes

| id | from_node | to_node | weight |

🚀 How to Run
1️⃣ Clone
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem

2️⃣ Import project

Open as Maven Project in IntelliJ or Eclipse.

3️⃣ Create database
CREATE DATABASE self_driving;

4️⃣ Configure DB

In DBHelper.java

host

username

password

5️⃣ Run

Deploy to Apache Tomcat 9

6️⃣ Access
http://localhost:8080/SelfDrivingControlSystem

💡 OOP Concepts

Inheritance → Base User class → Admin/Driver/Technician

Polymorphism → Different user actions

Interfaces → Trackable updates

Abstract Classes → Common behavior

🧵 Multithreading

A background updater:

Refreshes vehicle GPS position

Updates live status

📍 Route Planning

Uses Dijkstra Algorithm to calculate shortest paths.

👥 Team Members

Sumit Maurya

Alok

Praveer Shukla

📄 License

This project is for educational use.
