pipeline{
    agent any   
    stages{
       stage("Git Check Out"){
          steps{
            git branch: 'main', credentialsId: 'gitid', url: 'https://github.com/pseshagiri/payments.git'
          }
       }
       stage("Maven Clean Build"){
           steps {            
    			script{sh "mvn clean install"}
           }
        }
        stage("Docker Build"){
           steps {            
    			script{
    			    withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
                     variable:'dockerhublogin')]){
                         sh 'docker build -t pseshagiri/microservices:payments-ms-$BUILD_NUMBER .'
                     }
            }
    	 }
    	 
    	 stage("Docker Push"){
           steps {            
    			script{
    			    withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
                     variable:'dockerhublogin')]){
                     docker.withRegistry( '', 'dockerhublogin' ) {
             			sh 'docker push pseshagiri/microservices:payments-ms-$BUILD_NUMBER'
               		}
                }
            }
    	 }
           
        } //stages 
     }
     }           	
  
    }// pipelin//e