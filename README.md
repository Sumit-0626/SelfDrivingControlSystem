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

🗣️ English correction

You wrote:

its look very dirty

Correct:
👉 It looks very dirty.

Why:

Start with It

Use looks (not look)

Full sentence

If you want, I can add images, badges, or a nice title banner in your README 😊

You said:
 my friend readme file look  like this and my looks very dirty
ChatGPT said:

Bro I understand 😄
Your friend’s README looks clean because of proper headings, spacing and no emojis everywhere.

Let me format YOUR README in the same clean style like your friend’s.

👉 Copy–paste this into your README:

🚗 Self-Driving Car Control System

A Java web-based application that manages vehicle information, users, and route planning for a self-driving vehicle system.
It uses Servlets, JSP, JDBC, MySQL, and Dijkstra’s shortest path algorithm to calculate optimal routes.

This project follows clean architecture and core Java concepts:

OOP (Abstraction, Inheritance, Polymorphism, Interfaces)

JDBC-based database connectivity

Multithreading

Modular packages

🎯 Project Overview

The system provides three main user roles:

1. Admin

Manage vehicles

Manage drivers

View vehicle status

System configuration

2. Driver

View assigned vehicle

See route and updates

Track and update current location

3. Technician

Maintenance updates

Vehicle condition

Report vehicle issues

🛠️ Technologies Used

Programming

Java (JDK 8+)

JSP

Servlets

JDBC

Algorithm

Dijkstra Shortest Path

Server

Apache Tomcat 9+

Database

MySQL

Build Tool

Maven

📦 Project Structure
src/
 └── main/
      └── java/com/sdcs/
          ├── auth/        → Login / Authentication
          ├── model/       → OOP Entities (User, Admin, Driver, Vehicle)
          ├── service/     → Database Services
          ├── algo/        → Dijkstra Algorithm
          ├── servlet/     → All servlets
          └── db/          → DBHelper for JDBC

🗄️ Database Schema
users

| id | username | password | role |

vehicles

| id | vehicle_number | status | current_lat | current_lng |

routes

| id | from_node | to_node | weight |

🚀 How to Run the Project
1️⃣ Clone the repository
git clone https://github.com/Sumit-0626/SelfDrivingControlSystem

2️⃣ Import in IDE

Open the project as Maven Project in IntelliJ/Eclipse.

3️⃣ Create Database
CREATE DATABASE self_driving;

4️⃣ Configure DB

In DBHelper.java, update:

database URL

username

password

5️⃣ Deploy to Tomcat

Run on Apache Tomcat 9.

6️⃣ Open in Browser
http://localhost:8080/SelfDrivingControlSystem

💡 OOP Concepts Used

Inheritance
User → Admin, Driver, Technician

Interfaces
Trackable → vehicle location updates

Abstract Classes
Base User class

Polymorphism
Different user types with shared methods

🧵 Multithreading

VehicleLocationUpdater runs in the background to update real-time GPS location data.

📍 Route Planning (Dijkstra)

The shortest path between graph nodes is calculated using Dijkstra’s algorithm.

👥 Team Members

Sumit Maurya

Alok

Praveer Shukla

📄 License

This project is for educational use only.
