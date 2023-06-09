pipeline {
    agent any

    tools {
        // Install the Maven version configured as "maven-3.9.1" in the Jenkins' System Configuration
        maven "maven-3.9.1"
    }

    stages {
        stage('Maven Build') {
            steps {
                // Run Maven on a Unix agent.
                sh "mvn clean package -DskipTests"
            }
        }

        stage('Maven Test') {
            steps {
                sh "mvn test"
            }
        }

        stage("Docker Build") {
            steps {
                script {
                    image = docker.build("nanayak/hello-world:1.0")
                }
            }
        }

        stage("Docker Run") {
            steps {
                script {
                    container = image.run()
                    container.stop()
                }
            }
        }

        stage("Docker Push") {
            when { branch "main"}
            steps {
                script {
                    withDockerRegistry([credentialsId: "docker-creds", url: ""]) {
                        image.push()
                    }
                }
            }
        }
    }
}
