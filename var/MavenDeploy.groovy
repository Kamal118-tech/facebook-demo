def MavenDeploy() {
    sh 'mvn deploy'
    description: 'deploying the package to nexus'
}
