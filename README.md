# patient-management
A comprehensive Java-based microservices architecture for patient management, featuring REST APIs, gRPC communication, Kafka event streaming, JWT authentication, and AWS deployment capabilities.
Architecture Overview
This system consists of four main microservices:

- **Patient Service** — Core patient data management (CRUD, DTOs, persistence).
- **Billing Service** — Patient billing operations (gRPC interface for invoices/payments).
- **Analytics Service** — Data analytics and processing via Kafka event streaming.
- **Auth Service** — JWT-based authentication and authorization.
- **API Gateway** — Request routing, authentication middleware, and cross-cutting concerns.
