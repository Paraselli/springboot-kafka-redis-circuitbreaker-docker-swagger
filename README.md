# 🚀 Spring Boot Kafka Redis Circuit Breaker Microservices

A production-ready **microservices-based backend system** built using **Spring Boot, Kafka, Redis, Resilience4j, Docker, and Swagger**.
This project demonstrates **event-driven architecture**, **fault tolerance**, and **scalable cloud-native design**.

---

## 🧩 Tech Stack

* **Backend**: Spring Boot, Spring Cloud
* **Messaging**: Apache Kafka
* **Caching**: Redis
* **Resilience**: Resilience4j (Circuit Breaker)
* **Containerization**: Docker, Docker Compose
* **API Docs**: Swagger (OpenAPI)
* **CI/CD**: Jenkins

---

## ⚙️ Features

* ✅ Event-driven microservices using Kafka
* ✅ Circuit Breaker implementation using Resilience4j
* ✅ Redis caching for performance optimization
* ✅ REST APIs with Swagger documentation
* ✅ Dockerized services for easy deployment
* ✅ CI/CD pipeline with Jenkins

---

## 🏗️ Architecture

* Microservices communicate asynchronously via **Kafka**
* **Redis** used for caching frequently accessed data
* **Resilience4j** ensures fault tolerance using Circuit Breaker pattern
* Services are containerized using **Docker**

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/Paraselli/springboot-kafka-redis-circuitbreaker-docker-swagger.git
cd springboot-kafka-redis-circuitbreaker-docker-swagger
```

---

### 2️⃣ Start services using Docker

```bash
docker-compose up -d
```

---

### 3️⃣ Run the application

```bash
mvn clean install
mvn spring-boot:run
```

---

## 📡 API Documentation

Once the app is running:

👉 Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

---

## 🔥 Use Cases

* Real-time event processing
* High-throughput microservices
* Fault-tolerant distributed systems
* Scalable backend architecture

---

## 📌 Future Enhancements

* Add Kubernetes deployment (AKS/EKS)
* Implement distributed tracing (Zipkin)
* Add authentication (OAuth2/JWT)

---

## 👨‍💻 Author

**Ram Paraselli**
🔗 linkedin.com/in/ram-paraselli
🔗 github.com/Paraselli

---

## ⭐ If you like this project, give it a star!
