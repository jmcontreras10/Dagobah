# Dagobah

Backend service for tracking and managing fitness habits and statistics, temporarily named "Imfitness," after Dagobah,
the planet where Yoda trained Luke in *Star Wars*.

## Project Overview

"Imfitness" (codename: "Dagobah") is an open-source fitness platform designed to help users create and track their
workouts and diets. Whether you're a casual gym-goer or a personal trainer, "Imfitness" provides an intuitive mobile
experience for creating exercise routines, tracking progress, and receiving AI-driven suggestions for workout routines
and meal plans. This project showcases my skills and serves as a resource for the developer community. I will be adding
more features and improvements as the project evolves. Below is the current roadmap for the project.

## Dagobah Tech Stack

The project is built using the following technologies:

- **Kotlin** - Backend programming language
- **Spring Boot** - Framework for building APIs
- **MongoDB** - Database for storing exercise and user data
- **Docker** - Containerization for the backend and database
- **CircleCI** - Continuous Integration and Deployment

## Requirements

- **Java 17** or higher
- **Gradle** (optional, can be run using the Gradle Wrapper)
- **sdkman** (optional, for managing Java versions)
- **IntelliJ IDEA** (optional, for development)
- **Docker** and **Docker Compose** (optional, for running MongoDB)
- **MongoDB** (optional, can be run using Docker Compose)
- **CircleCI** (optional, for CI/CD)
- **Google Cloud Platform (GCP)** (optional, for deployment)

## Running the Project

You can run the project locally using the provided Makefile commands or manually via the command line.

**1. Set up MongoDB with demo data:**

Use the following command to initialize MongoDB with demo data:

```bash
make setup-mongo
```

**2. Run the project locally:**

Start the backend service using this command:

```bash
make run-dev
```

**3. Stop the project:**

Stop the service using the following command. This will terminate the service if it's running in the background:

```bash
make stop-dev
```

4. Test the project:

To run the test suite, use the following command:

```bash
make test
```