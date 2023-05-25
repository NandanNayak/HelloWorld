pipeline {
    agent any

    tools {
        // Install the Maven version configured as "maven-3.9.1" and add it to the path.
        maven "maven-3.9.1"
    }

    stages {
        stage('Build') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn clean package -DskipTests"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
    }
}
