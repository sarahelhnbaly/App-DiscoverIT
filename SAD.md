# Software Architecture Document

## Table of Contents
1. [Introduction](#introduction)
   - [Purpose](#purpose)
   - [Scope](#scope)
   - [Definitions, Acronyms and Abbreviations](#definitions-acronyms-and-abbreviations)
   - [References](#references)
   - [Overview](#overview)
   - [Architectural Representation](#architectural-representation)
   - [Architectural Goals and Constraints](#architectural-goals-and-constraints)
   - [Use-Case View](#use-case-view)
   - [Logical View](#logical-view)
     - [Overview](#overview-1)
     - [Architecturally Significant Design Packages](#architecturally-significant-design-packages)
   - [Process View](#process-view)
   - [Deployment View](#deployment-view)
   - [Implementation View](#implementation-view)
   - [Data View](#data-view)
   - [Size and Performance](#size-and-performance)
   - [Quality](#quality)

## 1. Introduction

### 1.1 Purpose
This document provides a comprehensive architectural overview of the system, using a number of different architectural views to depict different aspects of the system. It is intended to capture and convey the significant architectural decisions which have been made on the system.

### 1.2 Scope
This document describes the technical architecture of the GluGuide project, including the structure of classes, modules and dependencies.

### 1.3 Definitions, Acronyms and Abbreviations

| Abbreviation | Description                        |
|--------------|------------------------------------|
| API          | Application Programming Interface   |
| MVC          | Model View Controller               |
| REST         | Representational State Transfer     |
| SDK          | Software Development Kit            |
| SRS          | Software Requirements Specification  |
| UC           | Use Case                           |
| VCS          | Version Control System              |
| n/a          | Not Applicable                      |

###1.4 References

| Title                        | Date        | Publishing Organization |
|------------------------------|-------------|-------------------------|
|  [DiscovrtIT Blog](https://discoveritapp.wixsite.com/discoverit-4)             | November 2024 | DiscovrtIT              |
|  [DiscovrtIT Repository](https://github.com/sarahelhnbaly/App-DiscoverIT/tree/main)       | November 2024 | DiscovrtIT              |
| [SRS](https://github.com/sarahelhnbaly/App-DiscoverIT/blob/main/SRS.md)    | November 2024 | DiscovrtIT              |
| [UC: Create Account]  ( https://github.com/sarahelhnbaly/App-DiscoverIT/issues)        | November 2024 | DiscovrtIT              |

###1.5 Overview

This document contains the Architectural Representation, Goals and Constraints as well as the Logical, Deployment, Implementation and Data Views.

##2. Architectural Representation

The back-end server uses Spring Boot and APIs, while the front-end consists of a Vue.js client with React Router and Axios. I follow the Model-View-Controller (MVC) architecture pattern.


![PHOTO-2024-11-30-20-58-05](https://github.com/user-attachments/assets/7e018d72-d70a-4389-bb21-ca15fe091864)

In the backend I have folders for  'model' and 'controller' files.
![image](https://github.com/user-attachments/assets/fac6da42-ddb8-4d03-8a7d-05888e95d2fc)

In our frontend we manage the 'view' with components implemented on pages.

![image](https://github.com/user-attachments/assets/6cba4c9e-ab52-4ebd-81fe-d854e4b243dc)

## 3. Architectural Goals and Constraints

As discussed in the previous chapters, both the front-end and back-end utilize the Model-View-Controller (MVC) pattern. This approach fosters a clean and organized software architecture, ensuring a clear separation between the view, controller, and model components.

### Front-end

Vue.js serves as the front-end framework, effectively managing the user interface and consuming data through API calls. Its reactive capabilities enhance the user experience by providing real-time updates and efficient state management.

### Back-end

Spring Boot is employed as the back-end framework, delivering robust RESTful endpoints for the front-end to interact with. It simplifies the development of production-ready applications and streamlines the creation of APIs.

The front-end and back-end are distinct entities but communicate seamlessly through a REST API. Both components are built with JavaScript and are designed to ensure efficient data exchange and cohesive application functionality.

## 4. Use-Case View
Our overall UC diagram:

![image](https://github.com/user-attachments/assets/983e23e1-d9ac-46e4-88a1-860ce7c56bf1)

## 5.Logical View 

### 5.1 Overview

The our project our elements are categorized by model, view and controller. Data Flow:
![Logical View](https://github.com/user-attachments/assets/dfd2776f-392c-4b87-aee5-e9ee53401866)

User Interaction (view) A user interaction will trigger a function to handle the form submission.
Request Handling (Controller) The Controller receives the request, validates the data and passes it to the model.
Database Interaction (Model) Model interacts with our database and performes operations.
Response (Controller & View) The Controller sends back the result (success or error), which is then handled by the view to update the user interface accordingly.
Generating an Architectural UML diagram for a Java application are challenging because most UML tools and generators are geared toward object-oriented languages (like Java ) with strict class-based structures. We've tried PlantUML and UML Generator in VSC but they didnt work. In Intelij PlantUML works, but it does not automatically generate UML Diagrams, but we have to code Diagrams ourselfs.

This is the class diagram for the feature Authentification

![PHOTO-2024-12-01-00-25-18](https://github.com/user-attachments/assets/eeb8f8c9-1e2f-4483-bbee-1929e82e0230)

###5.2 Architecturally Significant Design Packages

1. User Authentication Package
2. API Management Package
3. Data Management Package
4. Notification Service Package
5. Analytics Package
   
##6. Process View

n/a

##7. Deployment View

My Deployment setup includes a client and a server.

![PHOTO-2024-11-30-20-22-54](https://github.com/user-attachments/assets/3bccd97f-c33c-496d-98c5-9f82c620dba2)

##8. Data View

My database structure in a schema:

![Entity Diagram DiscoverIt](https://github.com/user-attachments/assets/dbfbb0b6-ada8-44d9-af21-53ff6bbb1cbe)

## 9. Size and Performance

n/a

## 10. Quality/Metrics

n/a
