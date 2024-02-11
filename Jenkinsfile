pipeline {
    agent any

    stages {
        stage('Getting project from Git') {
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/ghassen']],
                    extensions: [],
                    userRemoteConfigs: [[url: 'https://github.com/ryhem1999/5Infini5-G2-SkiStation.git']]])
            }
        }

        stage('Cleaning the project') {
            steps {
                sh "mvn -B -DskipTests clean"
            }
        }

        stage('Maven build') {
            steps {
                sh "mvn -B -DskipTests package"
            }
        }
/*
        stage('Junit/mockito') {
            steps {
                sh "mvn test"
            }
        }
/*
        stage('Code Quality Check via SonarQube') {
            steps {
                sh "mvn clean verify sonar:sonar -Dsonar.projectKey=skier -Dsonar.host.url=http://192.168.33.10:9000 -Dsonar.login=admin1234"
            }
        }
*/
       /* stage('Publish to Nexus') {
            steps {
                sh 'mvn deploy'
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image from the Dockerfile
                    sh 'docker build -t skitest .'
                }
            }
        }

*/
        stage('Push Docker Image') {
            steps {
                script {
                    // Login to Docker Hub and push the Docker image
                    sh 'echo "ghassen1234" | sudo docker login --username "ghassenmarzouk252" --password-stdin'
                    sh 'sudo docker tag skitest ghassenmarzouk252/skitest:latest'
                    sh 'sudo docker push ghassenmarzouk252/skitest:latest'
                }
            }
        }

       stage('Docker Compose') {
            steps {
                script {
                    // Stop and remove existing containers
                    //sh 'docker-compose down'

                    // Deploy the application using Docker Compose
                    sh 'sudo docker-compose up -d'
                }
            }
       }
        /*
        stage('Run Spring && MySQL Containers') {
                                steps {
                                    script {
                                      sh 'docker compose up -d'
                                    }
                                }
                            }

/*
		   stage('Notification by Email') {
                                 steps {
                                     mail bcc: '',
                                         body: '''Hi Welcome to Jenkins email alerts
                     Thanks
                     Rihem Chagour''',
                                         subject: 'Jenkins Job',
                                         to: 'ghassen.marzouk@esprit.tn'
                                 }
                             }

*/
    }

    post {
        always {
             cleanWs()
        }
    }
}