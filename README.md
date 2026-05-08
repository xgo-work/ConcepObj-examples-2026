# Observer Pattern

Exemple de l'observer pattern en javascript.

Ouvrez ce playground

[https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick_addeventlistener](https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick_addeventlistener)

Essayez en cliquant sur l'élément **click me**

### Comment ça fonctionne ?

```
document.getElementById("demo").addEventListener("click", myFunction);
```
Ajoute un **Listener** qui va réagir aux événements de type `click`. À chaque click sur cet élément, la fonction `myFunction` est appelée.

Le code de cette fonction change le contenu de cet élément avec la ligne

```
document.getElementById("demo").innerHTML = "YOU CLICKED ME!";
```

### Exemple plus poussé

Dans le même playground que ci-dessus, remplacez le code existant par le code ci-dessous, puis cliquez sur **Run**.

```javascript
<!DOCTYPE html>
<html>

<body>

    <h1>HTML DOM Events</h1>
    <h2>The onclick Event</h2>

    <p>Utilisation de addEventListener() pour écouter les événements "click" sur un élément</p>
    <p>Ouvrez ce fichier avec un navigateur pour tester</p>
    <p>Vous pouvez aussi copier ce code et le tester live <a
            href="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onclick_addeventlistener"
            target="_blank">ici</a>
    </p>

    <button id="demo">Click me</button>
    <p id="counter">You have not clicked yet</p>

    <script>
        // on ajoute des "listeners" qui observent le bouton et attendent un click
        document.getElementById("demo").addEventListener("click", myFunction);
        document.getElementById("demo").addEventListener("click", otherFunction);

        // lorsqu'un click a lieu, un événement est lancé et les fonctions enregistrées sont appelées

        function myFunction() {
            document.getElementById("demo").innerHTML = "YOU CLICKED ME!";
        }

        var x = 0;
        function otherFunction() {
            var counter = document.getElementById("counter");
            x++;
            // on modifie l'élément
            counter.innerHTML = "The button was clicked " + x + " times";
            counter.style.color = x > 5 ? "red" : "blue";
        }

    </script>

</body>

</html>

```

Cette fois, dans `otherFunction()` on incrémente un variable et on affiche le nombre de fois que l'élément a été cliqué
