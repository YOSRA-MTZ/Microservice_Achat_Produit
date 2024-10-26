
# Microservices en Spring Boot : Produits et Achat

### Microservice Produits
- **Port** : `8083`
- **Objectif** : Ce microservice est responsable de la gestion des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) liées aux produits.
- **Points de terminaison disponibles** :
    - `POST /api/products` : Ajouter un nouveau produit.
    - `GET /api/products` : Récupérer tous les produits.
    - `GET /api/products/{id}` : Récupérer un produit spécifique par son ID.
    - `PUT /api/products/{id}` : Modifier un produit existant.
    - `DELETE /api/products/{id}` : Supprimer un produit en utilisant son ID.

### Microservice Achat
- **Port** : `8082`
- **Objectif** : Ce microservice facilite l'expérience d'achat, permettant aux utilisateurs d'acheter un ou plusieurs produits dans différentes devises. Le coût total est calculé en temps réel en fonction des taux de change actuels fournis par l'API des Taux de Change.
- **Points de terminaison disponibles** :
    - `POST /api/achat` : Traiter un achat en spécifiant les ID des produits et la devise souhaitée. Le service récupère les détails des produits depuis le microservice **Produits** et applique la conversion des devises à l'aide de l'API des Taux de Change.
    -  `POST /api/products` : Ajouter un nouveau produit.
    -  `GET /api/products`: Récupérer tous les produits.
     - `GET /api/products/{id}` : Récupérer un produit spécifique par son ID.
     - `PUT /api/products/{id}` : Modifier un produit existant.
     - `DELETE /api/products/{id}` : Supprimer un produit en utilisant son ID.
### Technologies utilisées
- `Spring Boot` : Framework pour le développement de microservices.
- `Spring WebFlux` : Pour intégrer un WebClient réactif et non-bloquant.
- `Spring Data JPA` : Pour gérer les interactions avec la base de données dans le microservice Produits.
- `MySQL` : Base de données en mémoire utilisée pour le développement et les tests.
- `Exchange Rate API`: : Un service tiers pour les taux de change en temps réel.
  
Réalisé par : YOSRA MOUMTAZ
