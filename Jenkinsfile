pipeline{
    agent any   
    stages{
       stage("Git Check Out"){
          steps{
            git branch: 'main', credentialsId: 'gitid', url: 'https://github.com/pseshagiri/payments.git'
          }
       }
       stage("Clean Build"){
           steps{
           //withMaven(globalMavenSettingsConfig: '--- Use system default settings or file path ---', jdk: '--- Use system default JDK ---', maven: 'Maven3', mavenSettingsConfig: '--- Use system default settings or file path ---') {
    			sh "mvn clean install"
			//}
               
           }
        }	
}
    }// pipelin//e