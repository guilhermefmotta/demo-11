pipeline {
    agent any
    
    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    def customImage = docker.build('my-custom-image', '.')
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script {
                    docker.withRegistry('https://registry.example.com', 'credentials-id') {
                        customImage.push('latest')
                    }
                }
            }
        }
        stage('Deploy to EC2') {
            steps {
                script {
                    // Add your commands to deploy the image to EC2 here
                    // For example, use SSH to connect to the EC2 instance and pull the latest image
                }
            }
        }
    }
}

