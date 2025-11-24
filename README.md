🌐 Online Event Management System

The Online Event Management System is a GUI-based Java application created to help users manage events more easily.
It allows users to add, update, delete, and view events using an interactive interface made with Java Swing.
All event data is stored permanently in a MySQL database using JDBC.

📂 Project Structure
Online-Event-Management-System/
│
├── DBConnection.java
├── EventManagementApp.java
├── Main.java
├── Schema.sql
├── README.md



📝 File Descriptions:
| File                       | Purpose                                         |
| -------------------------- | ----------------------------------------------- |
| 🔹 Main.java               | Starting point of the program (runs the GUI).   |
| 🔹 EventManagementApp.java | Handles UI, business logic, and event features. |
| 🔹 DBConnection.java       | Handles database connectivity using JDBC.       |
| 🔹 Schema.sql              | Database table creation script.                 |
| 🔹 README.md               | Documentation file.                             |


✨ Features

✔ Add new events
✔ Edit/update existing events
✔ Delete event records
✔ View events in a simple and clean format
✔ Fully GUI-based (Java Swing)
✔ Persistent MySQL storage
✔ Input validation & exception handling

🧠 Concepts Implemented 
| Topic                                                               | Description                                                                              
| ------------------------------------------------------------------- | -----------------------------------------------------------------------------------------
| 🧩 OOP Concepts (Polymorphism, Inheritance, Interfaces, Exceptions) | Used throughout Swing event handling, custom logic, method overriding & exception safety.
| 📦 Collections + Generics                                           | `ArrayList<Event>` used to store event data with type safety.                             
| ⚙️ Multithreading + Synchronization                                 | Used to keep UI responsive while handling DB operations.                              
| 🗄️ Separate DB Class                                               | `DBConnection.java` contains reusable database operation methods.                      
| 🔗 JDBC Connectivity                                                | Application connects to MySQL using JDBC driver.                                       
| 💾 Database CRUD Using JDBC                                         | Prepared Statements used for insert, update, delete, and fetch operations.             


🛠️ Technologies Used

1.☕ Java
2.🪟 Java Swing
3.🗃 MySQL Database
4.🔌 JDBC Connectivity

🚀 How to Run

1️⃣ Install MySQL and create the database using Schema.sql
2️⃣ Open the project in IntelliJ, Eclipse, or NetBeans
3️⃣ Add the MySQL JDBC driver to project libraries
4️⃣ Update credentials in DBConnection.java:
URL = "jdbc:mysql://localhost:3306/eventdb";
USER = "root";
PASSWORD = "yourpassword";

























