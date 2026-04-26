# Exercice — Template Method Pattern

Cet exercice a pour objectif d’implémenter le **design pattern Template Method** en Java à partir des classes existantes `TartePomme` et `Quiche`.

## Objectif

Refactoriser le code afin de mutualiser les étapes communes de préparation dans une classe abstraite.

## Consignes

Le code fourni contient les classes TartePomme et Quiche qui implémentent l'interface IRecette. Le code est très redondant entre les deux classes. Nous allons le simplifier en plusieurs étapes.


1. Créer une classe abstraite `Tarte`
2. Transférer toutes les méthodes communes à `TartePomme` et `Quiche` dans la classe `Tarte`
3. Créer des méthodes abstraites dans `Tarte` pour les étapes spécifiques à chaque recette
   *(par exemple : `preparerGarniture()`, `ajouterGarniture()`)*
4. Implémenter ces méthodes abstraites dans `TartePomme` et `Quiche`
5. Implémenter la méthode `preparer()` dans `Tarte`
   Cette méthode représente la **template method** et doit appeler les différentes étapes dans le bon ordre
6. BONUS : Créer une nouvelle recette `TarteNoisettes` qui étend `Tarte`

## Branches de correction

Correction partielle avec les points 1 et 2 effectués sur la branche `template-method-exercice-halfway`

Correction complète sur la branche `template-method-exercice-correction`

## But pédagogique

Comprendre comment le pattern **Template Method** permet de :

- mutualiser le code commun et minimiser le code commun
- imposer une structure d’exécution
- spécialiser certaines étapes via l’héritage
- rendre l'ajout de nouvelles classes plus aisé
