pipeline {
environment{
imageName=0
}
  agent any
  stages 
    {
    stage('Clean') {
      steps {
        sh 'mvn clean install'
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
        docker.withRegistry('','docker-jenkins'){
        imageName.push()
        }
        }
        }
        }
  }
}
