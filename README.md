# Declarative HTTP Client – Spring Boot 4

This project showcases the **new HTTP Declarative Client introduced in Spring Boot 4**, with a comparison against the **traditional REST client approach** used in earlier versions.

The application fetches mock data from the third-party API:  
 http://jsonplaceholder.typicode.com

## Project Overview

### TraditionalTodoService
Demonstrates the **classic way** of consuming third-party APIs using traditional REST clients.

### RestClientConfig
Provides **centralized HTTP client configuration**, such as base URL, timeouts, and common settings.

### TodoDeclarativeClient
Illustrates the **new declarative HTTP client**, using interface-based definitions with minimal boilerplate.

## Goal
- Compare traditional vs declarative HTTP clients
- Highlight cleaner, more maintainable API consumption in Spring Boot 4

