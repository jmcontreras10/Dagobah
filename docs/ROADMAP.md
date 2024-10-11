# "Imfitness" Roadmap

"Imfitness" (Codename, temporal name) is an open-source fitness platform designed to help users create and track their
workouts and diets. Whether you're a casual gym-goer or a personal trainer, "Imfitness" provides an intuitive mobile
experience for creating exercise routines, tracking progress, and receiving AI-driven suggestions for routines and meal
plans. This project serves as a showcase of my skills and a resource for the developer community. I will be adding more
features and improvements as the project evolves. Here is the current roadmap for the project.

## Main Project Features

- **Exercise Catalog (hardcoded)**  
  Provides a list of exercises that users can choose from on the mobile experience, with details like muscle groups
  worked, equipment needed, instructive videos, etc.

- **Custom Exercise Routine Creation**  
  Allows users to create custom exercise routines, with the ability to add exercises from the exercise catalog on the
  mobile experience.

- **Third-Party Custom Exercise Routine Creation**  
  Allows third parties, like personal trainers, to create custom exercise routines for users and assign them on the web
  experience.

- **Workout Tracking**  
  Allows users to track their workouts, including the exercises they performed, weights used, number of sets and reps,
  and any additional notes.

- **Diet Tracking**  
  *(Design In Progress)* Allows users to track their diet, including the foods they ate, the quantity, and the time they
  ate them.

## Future Features

- **Routine Suggestions**  
  Suggests routines to users based on their goals, fitness level, and available equipment using an AI-driven model.

- **Diet Suggestions**  
  Suggests diet plans to users based on their goals, fitness level, and available equipment using an AI-driven model.

## Phase 0: Setup [In Progress]

This phase focuses on setting up the project backend and frontend. The goal is to have a basic backend API with
endpoints to list exercises and provide details for each exercise. The frontend will be a simple mobile app that lists
the exercises and shows their details. CI/CD pipelines for both the backend and frontend will also be set up.

### Backend Setup (Phase 0.1)

- [x] Kotlin / Spring Boot API setup
- [x] Database configuration and connection with MongoDB
- [x] Create basic entity endpoints:
    - GET /exercises
    - GET /exercises/{id}
- [x] Unit tests for endpoints

### DevOps: CI/CD and Docker (Phase 0.2)

- [x] Dockerize the application and database
- [x] Set up Backend CI/CD pipeline (CircleCI)
- [x] Deploy backend to Google Cloud Platform (using a virtual machine)

### Mobile UI Setup (Phase 0.3)

- [ ] Set up mobile app (Kotlin Multiplatform + Jetpack Compose)
- [ ] List exercises from backend API
- [ ] Display exercise details

### DevOps V2: CI/CD (UI) and Security (Phase 0.4)

- [ ] Set up UI CI/CD pipeline (CircleCI)
- [ ] Enable logging and monitoring (e.g., Stackdriver, ELK Stack)
- [ ] Implement security measures:
    - Enable SSL
    - CORS configuration
    - OAuth2 integration (future phase)

### Phase 0.5 Improvements

- [ ] API Documentation (Swagger)
- [ ] Error Handling

## Phase 1: Main Feature 1 - Custom Exercise Routine Creation

This phase is about allowing users to create custom exercise routines by adding exercises from the catalog. The custom
routines will be persisted locally on the mobile app.

### Phase 1.1 Custom Exercise Routine Creation (Local)

- [ ] Create custom exercise routine persisted locally on mobile
- [ ] Add exercises from the exercise catalog
- [ ] Edit routine
- [ ] Delete exercises from the routine

## Contributing

Contributions are welcome! Feel free to submit a pull request, file an issue, or suggest improvements. Please follow the
code of conduct and review guidelines in the CONTRIBUTING.md file.
