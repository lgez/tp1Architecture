#   Shipping System - Documentation

## Pattern de Conception Utilisé : Factory Method (Méthode Fabrique)

### Quel patron de conception est utilisé et pourquoi ?
Le patron **Factory Method** est utilisé dans ce projet. C'est un patron de création qui:
- Définit une interface pour créer des objets
- Permet aux sous-classes de décider quelle classe instancier
- Permet de déléguer l'instanciation aux sous-classes

### Pourquoi ce patron existe ?
1. **Flexibilité** : Permet d'ajouter de nouveaux types de livraison sans modifier le code existant
2. **Découplage** : Sépare la création d'objets de leur utilisation
3. **Encapsulation** : Cache la logique de création des objets
4. **Extension** : Facilite l'ajout de nouveaux types de produits

### Description du patron dans notre exemple
Dans notre implémentation :
- `HandleOrder` : Classe abstraite (Creator) qui définit la méthode fabrique `createMethode()`
- `RoadMethode` et `SeeMethode` : Créateurs concrets qui implémentent la méthode fabrique
- `DeliveryMethode` : Interface produit
- `Truck` et `Boat` : Produits concrets

Le flux d'exécution :
1. Le client choisit un type de livraison
2. La fabrique appropriée (`RoadMethode` ou `SeeMethode`) est utilisée
3. La fabrique crée l'objet de livraison correspondant
4. L'objet créé gère la livraison

### Exemples d'utilisation dans des librairies Java
1. **Java Collections Framework** :
   - `Collection.iterator()` est une méthode fabrique qui crée différents types d'itérateurs

2. **Spring Framework** :
   - `BeanFactory` utilise le Factory Method pour créer des beans
   - Permet la création différée et la configuration des objets

3. **JavaFX** :
   - `ButtonBase.createDefaultSkin()` crée différents types de skins pour les contrôles UI

4. **JDBC** :
   - `Connection.createStatement()` crée des objets Statement
   - `DriverManager.getConnection()` crée des connexions à la base de données

### Avantages dans notre contexte
1. Facilité d'ajout de nouveaux modes de livraison
2. Maintenance simplifiée
3. Code plus organisé et modulaire
4. Respect du principe Open/Closed (SOLID)

### Structure du projet
