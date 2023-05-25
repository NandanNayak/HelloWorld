pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn package'
      }
    }

  }
  environment {
    DEMO = '1'
  }
}