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

🗣️ English correction

You wrote:

my friend readme file look like this and my looks very dirty

Correct:
👉 My friend’s README looks like this, and mine looks very messy.

Explanation:

“friend’s README” → possessive form

“looks” → singular form

“messy” → better word than “dirty” for writing

If you want a dark theme banner or badges like JDK / Maven / MySQL, tell me 👍

You said:
 in  space in dent size it same or i change somthing
ChatGPT said:

Bro no need to change anything there 😊
That setting (Spaces / 2 / Soft wrap) is only for how GitHub editor shows text.
It does not affect your README design.

So:
✔️ Leave it as it is
✔️ Just focus on clean headings and spacing

🗣️ English correction

You wrote:

in space in dent size it same or i change somthing

Correct:
👉 Should I keep the indentation the same, or should I change something?

Explanation:

Start with a question word (“Should I…”)

Use “keep” (base verb)

“Indentation” = correct term for spacing

“Change something” = clear and simple

You’re doing great 👍
Tell me if you want me to add a banner image or badges to make it look even more professional.

You said:
 it still look dirty  see me friend structure and my
ChatGPT said:

I understand you now 👍
Your README looks dirty because:

❌ You are using inline emojis
❌ You are writing everything in one line
❌ You didn’t use Markdown headings, lists, and code blocks properly
❌ Your project structure is not inside a code block
👉 Your friend’s README looks clean because it has proper formatting.

✔️ I will fix your README to look like your friend’s

👉 Copy–paste this.
This will make your README very clean.

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

This project is for educational use
