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
     stage("Rundeck Deploy"){
     steps{
     script {
               step([
                 $class: "RundeckNotifier",
                 includeRundeckLogs: true,
                 rundeckInstance: "Rundeck Server",
                 jobId: "e3243332-ba83-4855-89ad-dcb25378f888",
                 shouldWaitForRundeckJob: true,
                 shouldFailTheBuild: true,
                 tailLog: true
               ])
             }
     }
     }
  }
}
