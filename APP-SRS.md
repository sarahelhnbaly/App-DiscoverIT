# DiscoverIT Project 🍓

# Common Playground - Software Requirements Specification

## Table of contents
- [Table of contents](#table-of-contents)
- [Introduction](#1-introduction)
    - [Purpose](#11-purpose)
    - [Scope](#12-scope)
    - [Definitions, Acronyms and Abbreviations](#13-definitions-acronyms-and-abbreviations)
    - [References](#14-references)
    - [Overview](#15-overview)
- [Overall Description](#2-overall-description)
    - [Vision](#21-vision)
    - [Use Case Diagram](#22-use-case-diagram)
    - [Technology Stack](#23-technology-stack)
- [Specific Requirements](#3-specific-requirements)
    - [Functionality](#31-functionality)
    - [Usability](#32-usability)
    - [Reliability](#33-reliability)
    - [Performance](#34-performance)
    - [Supportability](#35-supportability)
    - [Design Constraints](#36-design-constraints)
    - [Online User Documentation and Help System Requirements](#37-on-line-user-documentation-and-help-system-requirements)
    - [Purchased Components](#purchased-components)
    - [Interfaces](#39-interfaces)
    - [Licensing Requirements](#310-licensing-requirements)
    - [Legal, Copyright And Other Notices](#311-legal-copyright-and-other-notices)
    - [Applicable Standards](#312-applicable-standards)
- [Supporting Information](#4-supporting-information)

## 1. Introduction
Discover a world of adventure with our app, designed to turn everyday routines into exciting, memorable experiences!

### 1.1 Purpose
This document outlines the requirements for the City Exploration Application, which provides users with an interactive platform to explore their city through personalized adventures based on selected transportation methods, durations, and tour types.

### 1.2 Scope
The City Exploration Application will cater to a wide audience, including tourists, locals, families, and groups looking for engaging city experiences. Key functionalities will include:
- Transportation method selection (bicycle, walking, public transport)
- Adventure duration selection (1, 2, 3, or 6 hours)
- Tour-type options (normal or game city exploration)
- An interactive city guide featuring dining, sightseeing, and local events
- User profiles for tracking adventure history and achievements

### 1.3 Definitions, Acronyms and Abbreviations
| Abbreviation | Explanation                            |
| ----------- | -------------------------------------- |
| SRS         | Software Requirements Specification    |
| UC          | Use Case                               |
| n/a         | not applicable                         |
| tbd         | to be determined                       |
| UCD         | overall Use Case Diagram               |
| FAQ         | Frequently asked Questions             |

### 1.4 References
| Title                                                                         | Date       | Publishing Organization   |
| ------------------------------------------------------------------------------ |:----------:| ------------------------- |
|   [DiscoverIT Blog](https://discoveritapp.wixsite.com/discoverit-4)         |    -      |                           |
| [DiscoverIT Github](https://github.com/sarahelhnbaly/App-DiscoverIT/)        |    -      | GitHub                    |
|  [Project Management](https://citydiscoveryapp.youtrack.cloud/projects/0-1) |    -      | YouTrack                  |

### 1.5 Overview
This document outlines both functional and non-functional requirements for the City Exploration Application. It describes the application's operation, key features, and user interactions. Additionally, it details the development environment, project management tools, and testing frameworks that will be utilized to ensure the successful implementation of the application. By providing this structured approach, the SRS aims to serve as a guide for developers and stakeholders throughout the development lifecycle.

## 2. Overall Description
DiscoverIT is your go-to app development firm for creating adventure apps that bring fun activities, memorable experiences, and exploration of the outdoors right to your fingertips. With a focus on event planning, new experiences, and travel inspiration, we specialize in social adventure and personalized recommendations that foster community engagement.

![Screenshot](https://github.com/user-attachments/assets/8210ceb2-9736-4701-b54c-ea12d06fc1d1)

## 3. Specific Requirements

### 3.1 Functionality
This section will explain the different use cases illustrated in the Use Case Diagram and their functionality. By November, I plan to implement:

#### 3.1.1 Logging in / out
#### 3.1.2 Register
#### 3.1.3 Create Post

By June, we plan to implement:

n/a.

### 3.2 Security
The Webapp must ensure secure data handling to comply with healthcare data protection laws. Otherwise, the user won't feel comfortable sharing information.

### 3.3 Reliability

#### 3.3.1 Server availability
Our server should ensure a 95% uptime. Since our priority is to develop an application free of bugs rather than hosting it ourselves, the application's availability is determined by the hosting provider we choose. With their redundancy and security protocols in place, most providers can achieve an uptime of over 99% in their data centers.

#### 3.3.2 Accuracy
We cannot guarantee the accuracy of the information in the blog posts, comments, or tracking data, as this content will be submitted by users.

#### 3.3.3 Bug classes
We classify bugs into two categories:
- **Critical bug**: arises when the database unintentionally loses data, exposes sensitive user information such as passwords, or prevents users from accessing the application entirely.
- **Non-critical bug**: occurs when the application remains functional, but users experience glitches that slightly affect their overall experience.

### 3.4 Performance

#### 3.4.1 Real Time Updates
The webapp must support real-time updates for blood sugar tracking and meal tracking.

#### 3.4.2 Response time
Since almost the entire user interface will load initially, even pages that are not currently visible will appear in less than 100 milliseconds when accessed.

### 3.5 Supportability
Our frontend, backend, and individual functionalities will be distinctly separated, and we will adhere to naming conventions commonly found in the technologies we use. Additionally, we strive to maintain clean code.

#### 3.5.1 Language Support
We will use the following languages, which will be well supported in the future:
- JavaScript
- HTML
- CSS

### 3.6 Design Constraints

#### 3.6.1 MVC Architecture
Our WebApp should implement the MVC pattern.

### 3.7 Online User Documentation and Help System Requirements
We aim to create an intuitive and user-friendly interface that allows users to navigate the webapp comfortably without difficulty. We will also provide a FAQ document to help with common questions.

### 3.8 Purchased Components
(n/a)

### 3.9 Interfaces

#### 3.9.1 User Interfaces
This is the login page:
![Login Page](https://github.com/user-attachments/assets/d92188aa-ce49-4bec-b26b-33c7104cb597)

Register page:
![Register Page](https://github.com/user-attachments/assets/d3147008-a688-48a2-941d-76d9c9b9c7c0)

Create a post:
![Create Post](https://github.com/user-attachments/assets/471905d7-33d7-41a1-85c3-880e37fe3884)
![Create Post 2](https://github.com/user-attachments/assets/2e21ff28-a12d-4d3f-a95b-ef544dca784a)

#### 3.9.2 Hardware Interfaces
(tbd)

#### 3.9.3 Software Interfaces
n/a

#### 3.9.4 Communications Interfaces
(tbd)

### 3.10 Licensing Requirements
n/a

### 3.11 Legal, Copyright, and Other Notices
n/a

### 3.12 Applicable Standards
n/a

## 4. Supporting Information
If you would like to know the current state of this project, please visit the GluGuide-Blog.
