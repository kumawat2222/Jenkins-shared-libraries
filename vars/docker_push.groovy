def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'docker-hub-creds-id', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
    sh """
    echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin
   """
  }
  sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
}
