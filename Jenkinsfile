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

        
    }
}
