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
        /*
        stage("Docker Build"){
           steps {            
    			script{
    			    withCredentials([usernameColonPassword(credentialsId: 'dockerhublogin', 
                     variable:'dockerhublogin')]){
                         sh 'docker build -t 992382437744.dkr.ecr.ap-south-1.amazonaws.com/retail-ms:payments-ms-$BUILD_NUMBER .'
                     }
            }
    	 }
    	 }
        */
        
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
    	 
           
        } 
        
        //stages
        /*
        stage("ECR Push"){
            steps{
             script{
               sh "aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 992382437744.dkr.ecr.ap-south-1.amazonaws.com"  
               sh "docker push 992382437744.dkr.ecr.ap-south-1.amazonaws.com/retail-ms:payments-ms-$BUILD_NUMBER"
             }
        }

    } */
    }  //stages          	
  
    } // pipeline
