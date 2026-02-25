# Flexible Notification System

## Overview
This repository contains a Java-based Flexible Notification System developed to demonstrate
professional software design principles, specifically Composition over Inheritance and
maintainability within the Software Development Lifecycle (SDLC).

The project shows how a system can evolve over time without requiring rewrites of core logic.
New notification channels are added by extending the system, not modifying it.

---

## Project Structure

This repository contains two related projects:

### Project 04 – Core Notification System
Implements the base notification framework using:
- Interfaces
- Composition
- Runtime behavior swapping

Supported notification methods:
- Email
- SMS

### Project 05 – Maintenance Enhancement
Extends the existing system by adding:
- WhatsApp notification support

This enhancement was completed **without modifying** the core `AlertSystem` class or
the `NotificationMedium` interface, demonstrating proper maintenance practices.

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

## Repository Usage
Each project folder contains:
- Source code
- Project-specific README
- Documentation relevant to that phase of development

This structure follows GitHub best practices for clarity, maintainability, and onboarding.
