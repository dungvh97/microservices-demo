# Microservices Demo

This project demonstrates a simple microservices architecture using Spring Boot, Spring Cloud Gateway, and Eureka Service Discovery.

## Architecture

- **Eureka Server**: Service registry for discovery of microservices.
- **API Gateway**: Entry point for all client requests, routes to backend services via Eureka.
- **User Service**: Provides user-related APIs.
- **Order Service**: Provides order-related APIs.

```
[Client] → [API Gateway] → [User Service]
                        ↘ [Order Service]
                ↕
           [Eureka Server]
```

## Prerequisites
- Java 11+
- Maven 3.6+

## Setup & Run

1. **Clone the repository**
   ```sh
   git clone <repo-url>
   cd microservices-demo
   ```

2. **Build all services**
   ```sh
   cd eureka-server && mvn clean install
   cd ../api-gateway && mvn clean install
   cd ../user-service && mvn clean install
   cd ../order-service && mvn clean install
   ```

3. **Start Eureka Server**
   ```sh
   cd eureka-server
   mvn spring-boot:run
   ```
   Access Eureka dashboard at: http://localhost:8761

4. **Start User Service**
   ```sh
   cd ../user-service
   mvn spring-boot:run
   ```

5. **Start Order Service**
   ```sh
   cd ../order-service
   mvn spring-boot:run
   ```

6. **Start API Gateway**
   ```sh
   cd ../api-gateway
   mvn spring-boot:run
   ```

## Usage

- **User Service (direct):**  
  `GET http://localhost:8081/users`
- **Order Service (direct):**  
  `GET http://localhost:8082/orders`
- **User Service (via Gateway):**  
  `GET http://localhost:8080/user-service/users`
- **Order Service (via Gateway):**  
  `GET http://localhost:8080/order-service/orders`

## Troubleshooting
- Ensure all services are registered in Eureka dashboard.
- If a port is in use, change `server.port` in the respective `application.properties`.
- For API Gateway actuator endpoints, add the actuator dependency and set `management.endpoints.web.exposure.include=*` in `application.properties`.

## License
MIT 