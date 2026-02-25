# Project 04 – Flexible Notification System (Core)

## Overview
Project 04 implements the core Flexible Notification System using Java.
The goal of this project is to demonstrate Composition over Inheritance
by allowing notification behavior to be changed at runtime without
modifying the core system.

The system supports multiple notification methods through a common
interface, making it easy to extend and maintain.

---

## Components
- NotificationMedium (Interface)
- EmailService
- SMSService
- AlertSystem (Container Class)
- Main (CLI Entry Point)

---

## Design Approach
This project uses composition instead of inheritance.
The AlertSystem class contains a reference to a NotificationMedium,
allowing notification services to be swapped dynamically at runtime.

This design follows the Open–Closed Principle, enabling new notification
types to be added without changing existing code.

---

## How to Compile and Run (CLI)

### Compilation
Navigate to the `src` directory and run:

javac *.java
### Execution
Run the program using:

java Main


---

## Testing & Verification Guidelines
The validity of this project can be verified without inspecting the
source code by following the steps below.

### Expected Behavior
1. The program compiles with no errors.
2. The system sends a notification using the active medium.
3. The console output clearly identifies the notification type
   (Email or SMS).
4. Messages sent during execution are stored in the internal log.

### Runtime Switching Test
1. Change the notification medium using the `setMedium()` method.
2. Send a new message.
3. Confirm the output reflects the new notification medium without
   recompiling the AlertSystem class.

If all steps succeed, the system is functioning correctly.
