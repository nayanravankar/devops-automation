pipeline {
    agent any

    tools {
        maven "maven-3.8.5"
    }

    stages {
        stage('Build') {
            steps {
                 // Get some code from a GitHub repository
                checkout([$class: 'GitSCM', branches: [[name: '*/develop']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/nayanravankar/devops-automation']]])
                bat "mvn clean install"
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('docker-build'){
            steps{
                bat 'docker build -t nayanravankar/devops-springbootv1 .'
                withCredentials([string(credentialsId: 'docker-secret', variable: 'dockerhub-secret')]) {
                    bat 'docker login -u nayanravankar -p Ruby@1515'
                    bat 'docker push nayanravankar/devops-springbootv1'
                }
            }
        }
    }
}
