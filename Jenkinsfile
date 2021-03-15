pipeline {
environment{
imageName=0
}
  agent any
  stages 
    {
    stage('Git Pull'){
    steps{
    git 'https://github.com/Bhashkaryadav1998/DevOpsCalculator.git'
    }
    }
    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
    stage('Docker build to Image'){
    steps{
    script{
    imageName=docker.build "bhashkaryadav1998/devops_calculator:latest"
    }
    }
    }
    stage('Push Docker Image'){
        steps{
        script{
        imageName.push()
        }
        }
        }
  }
}
