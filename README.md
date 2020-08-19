ProJet 7 Bibliotheque 

bibliotheque Projet 7 OC Gestion d'une bibliothèque d'une grande ville



Description :



bibliotheque est composé de 3 modules :
                Un Module : microservice-clientui
                Un Module : microservice-livre
                Un Module : microservice-Utilisateur
                
                
Api Gateway :
                Zuul : zuul-server
                
                
                
Edge services utilisés :
                Spring-Cloud-Config : config-server
                Eureka : Eureka-server
                Zipkin
                
                
Lancer l'application :
                mvn spring-boot:run
                
                
Etapes :
 Ordre de déploiement
 créer les bases de données(PostgreSQL):
          -book: pour les emprunts, les emails, les livres
          -utilisateur: pour les utilisateur_livre et les utilisateur_livre_user_role_list
          
Etape 1 :
   1  Zipkin-server
   
   
Etape 2 :
   1  config-server
   2  eureka-server
   
   
Etape 3 :
   1  zuul-server
   
   
Etape 4 :
   1  microservice-utilisateur
        utilisateur créer au lancement de l'application
       
   2  microservice-livre
        liste de livre, email de relance et emprunts au lancement de l'application
       
   3  microservice-clientui
comment générer la javadoc :
       - Dans le panneau de contrôle de maven en lancant la commande: javadoc:javadoc
       - Dans Intellij via le menu Tools puis Generate Javadoc
