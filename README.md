# Kata 1: IntelliJ IDEA Familiarization and Basic Workflow

## Objective
The goal of this assignment is to automate the daily use of the Integrated Development Environment (IntelliJ IDEA) and master the basic Git and GitHub workflow through deliberate practice, before tackling more complex algorithmic projects.

## Environment and Dependencies
* **Language:** Java
* **JDK:** Version 22
* **Dependency Management:** Maven

## Code Structure
The project follows the `software.ulpgc.katas` package convention and includes the following main classes:
* `Person`: A domain class implemented as a `record`. It contains the `name` and `birthday` attributes, along with a derived method `age()` that calculates the person's current age.
* `Main`: The orchestrator class that creates an instance of `Person`, invokes its calculation method, and prints the result to the console.

## Git Workflow
The regular development was carried out on the develop branch using small, descriptive commits. Once the implementation was finished, the changes were merged into the main branch (master), and both branches were finally synchronized with GitHub via a push.
