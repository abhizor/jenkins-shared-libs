def call(String credentialsId, String imagename){
  withCredentials([usernamePassword(credentialsId: "${credentialsId}", usernameVariable: "USERNAME_VARIABLE", passwordVariable: "PASSWORD_VARIABLE")]){

    sh "echo ${PASSWORD_VARIABLE} | docker login -u ${USERNAME_VARIABLE} --password-std"
    sh "docker push ${imagename}"
    
    
  }
}
