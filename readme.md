# Course Checker

This Java program compares course lists for Software Engineering (SE), Computer Science (CS), and Electrical Engineering (EE) to identify common and missing courses between them.

## Table of Contents

- [Overview](#overview)
- [Usage](#usage)
- [How It Works](#how-it-works)
- [Course Lists](#course-lists)

## Overview

The `CourseChecker` program is designed to analyze and compare course lists for different academic programs. It provides insights into the courses that are common and those that are missing between Software Engineering (SE), Computer Science (CS), and Electrical Engineering (EE).

## Usage

To run the program, follow these steps:

1. Clone the repository to your local machine.
2. Compile the Java file:

    ```bash
    javac CourseChecker.java
    ```

3. Run the compiled program:

    ```bash
    java CourseChecker
    ```

## How It Works

The program utilizes Java to create and compare lists of courses for SE, CS, and EE. It then prints the number of courses that are present and not present in each program. The comparison logic has been encapsulated into separate methods for clarity and modularity.

## Course Lists

The course lists are defined in the following methods:

- `createSECourseList`: Software Engineering course list.
- `createCSCourseList`: Computer Science course list.
- `createEECourseList`: Electrical Engineering course list.

Feel free to update these lists according to your specific academic program.

