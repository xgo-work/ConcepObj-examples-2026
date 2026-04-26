# Corrigé — Pattern Singleton

Cette classe applique le **design pattern Singleton**, dont le but est de garantir qu’une seule instance de `Game` existe dans l’application.

- `private static Game instance;`
  stocke l’unique instance de la classe.

- `private Game()`
  empêche la création d’objets avec `new` depuis l’extérieur.

- `public static Game getInstance()`
  retourne l’instance unique. La méthode doit être statique
  Si elle n’existe pas encore, elle est créée au premier appel (**initialisation paresseuse / lazy initialization**).
