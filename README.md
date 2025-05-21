# Random Name Generator – DevOps Project
This project demonstrates a DevOps CI/CD pipeline to deploy a Java-based Spring Boot application that generates random names using combinations of adjectives and animals.

## 🔍 Project Overview
- Language: Java 17 (Spring Boot)
- Build Tool: Maven
- CI/CD: GitHub Actions
- Infrastructure: AWS EC2 (launched via CloudFormation)
- IaC: AWS CloudFormation (YAML)
- Hosting: Amazon EC2
- Deployment Trigger: Push to main branch
The application randomly generates names like “Brave Tiger” or “Clever Otter” and allows users to submit their own adjectives and animals through the web interface.
---
## 📁 Repository Structure
bash
.
├── .github/workflows/deploy.yml   # GitHub Actions CI/CD workflow
├── DevOpsSummative2/
│   ├── src/
│   │   └── main/
│   │       └── java/bpp/com/devops/
│   │           ├── Application.java
│   │           ├── NameManager.java
│   │           └── NameController.java
│   ├── resources/
│   │   ├── templates/index.html
│   │   └── static/index.css
│   └── pom.xml                    # Maven project file
├── ec2-template.yaml             # CloudFormation (IaC)
└── README.md                     # We Are Here
