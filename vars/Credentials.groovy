def call(String credentialsId, String usernameVariable, String  passwordVariable, String imagename){
  withCredentials([usernamePassword(credentialsId: "${credentialsId}", usernameVariable: "${usernameVariable}", passwordVariable: "${passwordVariable}")]){
    sh "dockerhub -u ${env.${usernameVariable}} -p${env.${passwordVariable}}"
    sh "dockerhub push ${imagename}"
    
  }
}
