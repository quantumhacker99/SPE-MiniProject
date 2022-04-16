pipeline{
    
    environment{
        hubRegistry = "h3md0ck3r/scificalc"
        hubCred = "dockerhub-cred-hemc"
        dockerImage = " "
        
    }
    
    agent any
    
    stages{
        stage('Git Clone'){
            steps{
                script{
                    echo "Cloning from GitHub repo"
                    git branch:'main', credentialsId: 'github', url: 'https://github.com/quantumhacker99/SPE-MiniProject.git'
                }
            }
        }
        
        stage('Build and Test Code'){
            steps{
                script{
                    echo "Clean install with Maven"
                    sh 'mvn clean install'
                }
            }
        }
        
        stage('Build Docker Image'){
            steps{
                script{
                    echo "Build Docker Image"
                    dockerImage = docker.build("h3md0ck3r/scicalc")
                }
            }
        }
        stage('Push to Docker Hub'){
            steps{
                script{
                    echo "Push to Docker Hub"
                    docker.withRegistry('', hubCred){
                        dockerImage.push('latest')
                    }
                }
            }
        }
        
        stage('Deploy with Ansible'){
            steps{
                script{
                    echo "Deploying image to Ansible"
                    ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible',  playbook: 'ansible_playbook.yml'
                }
            }
        }
        
    }
}
