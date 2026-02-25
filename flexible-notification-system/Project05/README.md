# Project 05 – Maintenance Enhancement (WhatsApp Integration)

## Overview
Project 05 represents the Maintenance & Evolution phase of the Software
Development Lifecycle (SDLC) for the Flexible Notification System.

In this phase, a new notification method (WhatsApp) is added to the
existing system without modifying any core classes or interfaces.
This demonstrates how good architectural decisions reduce maintenance
costs and complexity over time.

---

## Maintenance Constraint
The following constraints were strictly followed:
- No changes were made to AlertSystem.java
- No changes were made to NotificationMedium.java
- Functionality was extended only by adding a new class

This ensures architectural integrity and avoids system rewrites.

---

## New Component Added
- WhatsAppService (implements NotificationMedium)

The WhatsAppService plugs into the system at runtime using composition.

---

## Generative AI Usage & Refinement
A generative AI tool was used to assist in drafting the WhatsAppService
class.

### Prompt Used
"Generate a Java class called WhatsAppService that implements the
NotificationMedium interface and overrides the send(String message)
method."

### Verification Process
- The generated method signature was checked against the existing
  NotificationMedium interface to ensure an exact match.
- JavaDocs were reviewed and adjusted to match the style used in
  existing classes.
- No changes were made to the AlertSystem class, ensuring maintenance
  constraints were respected.

---

## How to Compile and Run (CLI)
### Compilation
Navigate to the `src` directory and run:

javac *.java

### Execution
Run the application using:
java Main


## Testing & Verification Guidelines

### Expected Behavior
1. The program compiles without errors.
2. WhatsAppService can be selected at runtime using setMedium().
3. Console output displays:
   [WhatsApp] Sending message: <message>
4. Messages sent via WhatsApp appear in the same log as Email and SMS.

### Runtime Switching Test
1. Start with Email or SMS.
2. Switch to WhatsAppService at runtime.
3. Send a new message.
4. Confirm the correct output without recompiling AlertSystem.

Successful completion of these steps confirms the maintenance task
was implemented correctly.
