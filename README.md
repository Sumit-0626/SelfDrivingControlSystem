🚗 Self-Driving Car Control System

A Java Web Application using Servlets, JSP, JDBC, MySQL, OOP, and Dijkstra’s Algorithm.

📌 Project Overview

This system manages and controls different parts of a Self-Driving Car:

✔️ User login (Admin / Driver / Technician)

✔️ Vehicle management

✔️ Driver management

✔️ Real-time vehicle location updates

✔️ Route planning using Dijkstra’s Shortest Path Algorithm

✔️ JDBC + MySQL database

✔️ OOP design

✔️ Multithreading for vehicle updates

🛠️ Technologies Used
Backend

Java (JDK 8+)

Servlet + JSP

JDBC

OOP (Inheritance, Polymorphism, Interfaces, Abstraction)

Multithreading

Dijkstra Shortest Path Algorithm

Database

MySQL

Build Tool

Maven

Server

Apache Tomcat 9+

📂 Project Structure
src/
 └── main/
      └── java/com/sdcs/
            ├── auth/        (Login / Authentication)
            ├── model/       (User, Admin, Driver, Technician, Vehicle)
            ├── service/     (Database services)
            ├── algo/        (Dijkstra Algorithm)
            ├── servlet/     (All Servlets)
            └── db/          (DBHelper for JDBC)

🗄️ Database Tables
users

| id | username | password | role |

vehicles

| id | vehicle_number | status | current_lat | current_lng |

routes

| id | from_node | to_node | weight |

🚀 How to Run
1️⃣ Clone the repo
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem

2️⃣ Import Project

Open in IntelliJ or Eclipse as a Maven project.

3️⃣ Create MySQL Database
CREATE DATABASE self_driving;


Then import your SQL tables.

4️⃣ Configure DB

In DBHelper.java, set:

host

username

password

5️⃣ Run on Tomcat

Deploy to Apache Tomcat 9.

6️⃣ Open in Browser
http://localhost:8080/SelfDrivingControlSystem

🧠 OOP Concepts Used
🔹 Polymorphism

Different user types: Admin, Driver, Technician.

🔹 Inheritance

All extend the base abstract User class.

🔹 Interface

Trackable interface for vehicle location updates.

🔹 Abstract Class

User is an abstract base class.

⚙️ Multithreading

VehicleLocationUpdater runs in the background to update GPS.

📍 Route Planning (Dijkstra)

Shortest path between nodes using Dijkstra’s Algorithm.

👥 Team Members

Sumit Maurya — Admin

Alok

Praveer Shukla

📄 License

This project is for educational use only.
