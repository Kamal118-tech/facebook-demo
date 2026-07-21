pipeline{
    agent any

    stages{
        stage('pulling the code from git branch') {
            steps {
                git branch: 'main', url: 'https://github.com/Kamal118-tech/facebook-demo.git'
            }
        }
        stage('clean package') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('deploy package to nexus') {
            steps {
                MavenDeploy()
            }
        }

    }
}
