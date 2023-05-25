pipeline {
    agent any

    tools {
        // Install the Maven version configured as "maven-3.9.1" and add it to the path.
        maven "maven-3.9.1"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/jglick/simple-maven-project-with-tests.git'

                // Run Maven on a Unix agent.
                sh "mvn clean package"
            }
        }
    }
}
