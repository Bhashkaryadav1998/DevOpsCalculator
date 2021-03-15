pipeline {
environment{
imageName
}
  agent any
  stages 
    {
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
