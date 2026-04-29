<p align="center">
  Language:
  <a href="README.md">English</a> | 
  <a href="README.pt.md">Português</a>
</p>

# TCP Communication
This project demonstrates the workings of inter-process communication via **TCP/IP** protocol using Java's native API. \
Includes examples of how to establish connections, exchange messages, and safely close sessions.

## Features
- Real-time message sending and receiving.
- Stable connection between client and server via TCP.
- Shutdown using the **exit** command.
- Console output to track the full conversation.

## Technologies
- Java
- TCP Sockets
- I/O Streams

## Structure
```
📂 SocketTCP/
├── Client.java
└── Server.java
```

## Installation
**1.** Check if **Java** is installed on your machine:
> To confirm, run in the terminal:
> ```bash
> java -version
> ```
> If not installed, download [Java](https://www.oracle.com/java/technologies/downloads/).

**2.** Download or clone the repository:
> ```bash
> git clone https://github.com/wxrley/socket-tcp.git
> ```

## Running
### Option 1 — Via Terminal
**1.** Navigate to the project root and compile the files:
> ```bash
> javac Server.java Client.java
> ```
**2.** Run the server:
> ```bash
> java Server
> ```
**3.** In another terminal, run the client:
> ```bash
> java Client
> ```
> Type messages — the server responds in real time.
> To exit, type **exit**.

### Option 2 — Via IDE (IntelliJ, Eclipse, VS Code, etc.)
**1.** Open the project folder in your preferred IDE. \
**2.** Open the `Server.java` file and click **Run** to start the server. \
**3.** Then, open the `Client.java` file and click **Run** to start the client. \
**4.** Use the IDE console to type and view the exchanged messages. \
**5.** Type **exit** in the client to end the communication.
