# Gym Management System

## Overview
This Gym Management System is a Java-based application designed to handle various aspects of a gym's operation. It includes classes for managing employees, members, and job applicants, and integrates these functionalities into a cohesive system.

## Features
- **Employee Management:** Handles employee details including pay, specialty exercises, and job positions.
- **Member Management:** Manages gym members, including ID allocation, favorite exercises, and fitness goals.
- **Job Applicant Management:** Processes applicants for gym-related job positions, storing their responses and desired positions.
- **Gym Operations:** Central class integrating various components like employees, members, and applicants.

## Usage
- Run `Main.java` to start the application.
- Follow on-screen prompts to interact with different aspects of the system.

## Classes
1. `Person`: Base class with common attributes like name, phone number, and email.
2. `Employee`: Derived from `Person`, adds attributes and methods specific to employees.
3. `Member`: Derived from `Person`, manages member-specific details.
4. `JobApplicant`: Derived from `Person`, handles job applicant data.
5. `GymManagement`: Central class orchestrating the management of the gym.

## Development Environment
- Java
- Scanner for input handling
