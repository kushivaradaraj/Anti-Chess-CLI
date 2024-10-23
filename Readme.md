# AntiChess Game Setup Guide

A simple multiplayer Anti Chess game implementation in Java.

## Prerequisites

- Java Development Kit (JDK) installed
- Basic familiarity with terminal/command prompt

## Setup & Deployment

### Windows

```bash
# 1. Extract the ZIP file to your preferred location

# 2. Open Command Prompt in the project directory and run:
chcp 65001
javac *.java

# 3. Start the server:
java Server

# 4. Open two new Command Prompt windows and run in each:
chcp 65001
java Client
```

### macOS/Linux

```bash
# 1. Extract the ZIP file to your preferred location

# 2. Open Terminal in the project directory and run:
export LANG=en_US.UTF-8
javac *.java

# 3. Start the server:
java Server

# 4. Open two new Terminal windows and run in each:
java Client
```

## Alternative Connection Method

Instead of using the Java client, you can connect using:
```bash
telnet localhost 9099
```

## Quick Start

1. Start the server first in the terminal
2. Connect two clients in two new terminals
3. Player 1 makes the first move
4. Enjoy the game!

