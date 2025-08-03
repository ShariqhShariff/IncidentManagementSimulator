# Incident Management Simulator

A lightweight Java console application that simulates incident management — including raising, viewing, resolving, and escalating incidents.

This project is designed to demonstrate core Java programming concepts while aligning with real world incident handling practices, such as incident triage, escalation paths, and operational tracking (like a simplified ServiceNow).


## Features

- Raise new incidents with `CRITICAL` or `MINOR` priority
- View all open or resolved incidents
- Resolve incidents by ID
- Escalate incidents based on type
- Menu-driven interface for easy interaction


## Why This Project?

As part of my journey toward strengthening coding experience, this project demonstrates:

 Concept               Implementation Example                        

 **Abstraction**         `Incident` abstract base class                
 **Inheritance**         `CriticalIncident`, `MinorIncident`       
 **Polymorphism**        Overridden `escalate()` methods           
 **Encapsulation**       Private fields + getters/setters          
 **Exception Handling**  Input parsing and validation            
 **Collections**         `HashMap<Integer, Incident>` for storage  
 **Constructors**        Parameterized constructors                
 **Loops & Branching**   Console menu with switch-case logic       