pipeline {
    agent any
    tools {
        maven 'maven3.6'
    }
    stages {
        stage('Checkout') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'jenkins.github', url: 'https://github.com/Naveen176/spring-boot-docker.git']]])
            }
        }
        
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
      stage('Build Docker Image') {
            steps {
                // Build and tag Docker image
                sh 'wsl docker build -t spring-boot-docker:latest .'
            }
        }
        
        stage('Deploy Docker Container') {
            steps {
                // Run Docker container
                sh 'wsl docker run -d -p 8080:8080 spring-boot-docker:latest'
            }
        }
    }
}
