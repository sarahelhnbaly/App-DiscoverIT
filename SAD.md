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
| Overall Use Case Diagram     | November 2024 | DiscovrtIT              |
| SRS                          | November 2024 | DiscovrtIT              |
| UC: Create Account           | November 2024 | DiscovrtIT              |


![PHOTO-2024-11-30-20-58-05](https://github.com/user-attachments/assets/7e018d72-d70a-4389-bb21-ca15fe091864)
![PHOTO-2024-11-30-20-22-54](https://github.com/user-attachments/assets/3bccd97f-c33c-496d-98c5-9f82c620dba2)
![Entity Diagram DiscoverIt](https://github.com/user-attachments/assets/dbfbb0b6-ada8-44d9-af21-53ff6bbb1cbe)
![UCD drawio](https://github.com/user-attachments/assets/2d688b29-7264-4d92-8b2a-e65d4266810e)
![Logical View](https://github.com/user-attachments/assets/dfd2776f-392c-4b87-aee5-e9ee53401866)
![PHOTO-2024-12-01-00-10-05](https://github.com/user-attachments/assets/91ffe6f6-6463-4856-bebb-c39c711965ee)
![PHOTO-2024-12-01-00-25-18](https://github.com/user-attachments/assets/eeb8f8c9-1e2f-4483-bbee-1929e82e0230)
