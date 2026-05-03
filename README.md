# Exercice — Injection de dépendances par constructeur

Cet exercice a pour objectif d'implémenter le **design pattern Injection de dépendances par constructeur** en Java à partir des classes existantes `Tarte`, `TartePomme`, `TarteNoisettes` et `Quiche`.

## Objectif

Refactoriser le code afin de découpler les classes concrètes (`PateBrisee`, `PateFeuilletee`, ...) des classes qui les utilisent, en introduisant des interfaces et en passant les dépendances par constructeur.

## Consignes

Le code fourni contient une hiérarchie de classes de recettes de tartes issues de l'exercice Template Method. Les dépendances (pâte, garniture) sont instanciées directement dans les classes. L'objectif est de les injecter de l'extérieur et ainsi de mettre en pratique l'injection de dépendance.

### Partie I — Injection de la pâte

1. Créez une interface `IPate` avec les méthodes :
   - `void preparer()`
   - `void abaisser()`
   - `boolean estCuite()`
2. Modifier la classe `PateBrisee` pour qu'elle implémente `IPate`
3. Faire de même avec la classe `PateFeuilletee`
4. Modifier la classe `Tarte` :
   - le constructeur prend une `IPate` en paramètre (Injection de dépendance par constructeur)
   - la variable d'instance devient une `IPate`
5. Adapter les sous-classes (`TartePomme`, `TarteNoisettes`, `Quiche`) pour qu'elles aient un constructeur prenant une `IPate` en paramètre
6. Retirer la méthode `preparerPate()` de `Tarte` et adapter la méthode `preparer()` en utilisant la IPate
7. Adapter le `main` pour invoquer les constructeurs avec une `IPate`, par exemple :
   ```java
   new TartePomme(new PateFeuilletee());
   ```

### Partie II — Injection de la garniture

On applique la même approche pour la garniture, ce qui implique des changements plus profonds.

1. Déclarer une interface `IGarnitureTarte` :
   - `void preparerGarniture()`
   - `void ajouterGarniture(MouleATarte)`
2. Déclarer trois classes qui implémentent `IGarnitureTarte` :
   - `GarnitureTartePomme`
   - `GarnitureTarteNoisette`
   - `GarnitureQuiche`
3. Injecter une `IGarnitureTarte` dans le constructeur de `Tarte` (et déclarer une variable d'instance `IGarnitureTarte`)
4. Transformer `Tarte` en classe concrète et modifier la méthode `preparer()` pour qu'elle appelle les méthodes sur `IPate` et `IGarnitureTarte`
5. Supprimer entièrement les classes `TartePomme`, `TarteNoisettes` et `Quiche`
6. Il doit maintenant être possible de déclarer une tarte comme ceci :
   ```java
   new Tarte(new PateBrisee(...), new GarniturePomme());
   ```

### Réflexion

Quelles sont les conséquences **positives** et **négatives** de cette refactorisation sur la structure du code ?

## Branches de correction

Correction de la partie I sur la branche `dep-inject-exercice-corr-part-I`

Correction complète sur la branche `dep-inject-exercice-corr-part-II`

## But pédagogique

Comprendre comment l'**injection de dépendances par constructeur** permet de :

- découpler les classes et réduire les dépendances directes entre elles
- faciliter la substitution d'implémentations (ex. changer de pâte sans modifier la tarte)
- améliorer la testabilité du code
- appliquer le principe d'inversion de dépendances (DIP)
