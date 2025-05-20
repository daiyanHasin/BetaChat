# 🗨️ Betachat - Real-Time Group Chat Application

**Betachat** is a real-time group chat desktop application built with Java. It supports multiple users connecting simultaneously, each represented by a separate client instance. The project uses socket programming and basic GUI with Swing to provide a simple but functional chat experience.

## 📌 Features

- Multi-user chat room simulation
- Server-client architecture
- Basic user authentication
- GUI built with Java Swing
- Individual chat clients (`UserOne`, `UserTwo`, `UserThird`)
- Separate `Server` to handle all client connections

## 🛠 Technologies

- Java
- Java Swing (for GUI)
- Java Sockets (for real-time networking)

## 📁 Project Structure
   ```bash
  
GroupChat/
├── src/groupchat/
│ ├── Server.java
│ ├── UserOne.java
│ ├── UserTwo.java
│ ├── UserThird.java
│ ├── Loginpage.java
│ ├── IdandPassword.java
│ └── main.java
├── build.xml
├── manifest.mf
 ```
## 🚀 How to Run

1. **Compile all Java files**:
   ```bash
   javac src/groupchat/*.java
   ```
2. **Run the server first:**
   ```bash
   java groupchat.Server
   ```

3. **Run clients in separate terminals:**
   ```bash
   java groupchat.UserOne
   java groupchat.UserTwo
   java groupchat.UserThird
  ```


