pipeline {
    agent any
    environment {
        DOCKER_USERNAME = 'ghassenmarzouk252'
        DOCKER_PASSWORD = 'ghassen1234'

    }
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

        stage('Junit/mockito') {
            steps {
                sh "mvn test"
            }
        }
/*
        stage('Code Quality Check via SonarQube') {
            steps {
                sh "mvn clean verify sonar:sonar -Dsonar.host.url=http://192.168.33.10:9000  -Dsonar.login=squ_135249f1bb5c6e3b92b1eb7044c16ecbe9b12c73"
            }
        }*/

       /* stage('Publish to Nexus') {
            steps {
                sh 'mvn deploy'
            }
        }
*/
        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image from the Dockerfile
                    sh 'docker build -t ghassenmarzouk252/skitest:latest .'
                }
            }
        }

/*
        stage('Push Docker Image') {
            steps {
                script {
                    // Login to Docker Hub and push the Docker image
                    sh 'echo "ghassen1234" | docker login --username "ghassenmarzouk252" --password-stdin'
                    sh 'docker tag skitest ghassenmarzouk252/skitest:latest'
                    sh 'docker push ghassenmarzouk252/skitest:latest'
                }
            }
        }
*/
      /* stage('Push') {
                   steps {
                       script {
                           docker.withRegistry('https://index.docker.io/v1/', "$DOCKER_CREDENTIALS") {
                           sh 'docker tag skitest ghassenmarzouk252/skitest:latest'
                           sh 'docker push ghassenmarzouk252/skitest:latest'
                           }
                       }
                   }
               }
*/
/*
      stage('Push') {
                  steps {
                      script {

                              sh "docker login -u ghassenmarzouk252 -p ghassen1234"
                              sh 'docker tag skitest ghassenmarzouk252/skitest:latest'
                              sh 'docker push ghassenmarzouk252/skitest:latest'

                      }
                  }
                }*/
       stage('Docker Compose') {
            steps {
                script {
                    // Stop and remove existing containers
                    //sh 'docker-compose down'

                    // Deploy the application using Docker Compose
                    sh 'docker-compose up -d'
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

*/
		/*   stage('Notification by Email') {
                                 steps {
                                     mail bcc: '',
                                         body: '''Hi Welcome to Jenkins email alerts
                     Thanks
                     Ghassen Marzouk''',
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