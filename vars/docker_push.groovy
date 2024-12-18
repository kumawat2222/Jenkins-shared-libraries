def call(String Project, String ImageTag, String dockerhubuser){
 withCredentials([usernamePassword(credentialsId: 'dockerhubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }
  sh "kailash2222/notes-app:latest"
}
