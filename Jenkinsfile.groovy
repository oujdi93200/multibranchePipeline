node {
    try {
        // Nettoyer l'espace de travail au début du pipeline
        cleanWs()

        // Exécuter une commande shell
        sh 'echo Bienvenue dans le Projet CI/CD'
    } 
    finally {
        // Nettoyer l'espace de travail à la fin, que le try ait réussi ou échoué
        cleanWs()
    }
}

