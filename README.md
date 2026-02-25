# Flexible Notification System

## Overview
This repository contains a Java-based Flexible Notification System developed
to demonstrate professional software design principles, specifically
Composition over Inheritance and maintainability within the Software
Development Lifecycle (SDLC).

The project illustrates how software should be viewed as an evolving system.
New notification channels are added by extending the system rather than
rewriting core logic, reducing long-term maintenance cost and risk.

---
## Project Structure
This repository contains two related projects that represent different
phases of the SDLC:

### Project 04 – Core Notification System
Implements the base notification framework using:
- Interfaces
- Composition
- Runtime behavior swapping

Supported notification methods:
- Email
- SMS

This project establishes a flexible architecture intended for future
extension.

### Project 05 – Maintenance Enhancement
Extends the existing system by adding:
- WhatsApp notification support

This enhancement was completed without modifying the core
AlertSystem class or the NotificationMedium interface, demonstrating
proper maintenance and evolution practices.

---

## Design Principles Used
- Composition over Inheritance
- Open–Closed Principle
- Single Responsibility Principle
- Separation of Concerns

---

## Technologies Used
- Java
- Command Line Interface (CLI)
- GitHub for version control and documentation

---

## Testing & Validation
Each project folder contains a dedicated README file with:
- Compilation instructions
- Execution steps
- Runtime behavior expectations
- Verification guidelines that allow validation without inspecting source code

This ensures the system can be trusted and evaluated by new developers
or reviewers.

---
## Intended Audience
This repository is structured so that a new developer can:
- Understand the system architecture
- Compile and run the software
- Extend functionality safely
- Maintain the system without rewrites

---

## Repository Usage
Each project folder includes:
- Source code
- Project-specific documentation
- Testing and verification guidelines

This structure follows GitHub best practices and allows a new developer
to understand, run, test, and maintain the software with minimal effort.
