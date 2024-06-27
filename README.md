
# Programmation Orientée Objet


C'est quoi :

C'est un paradigme de programmation qui consiste à matérialiser toute

les entitées du monde réel sous forme d'objet.

## I/ Classe et Objet


Une classe est un ensemble de données et de fonctions qui décrivent

une entité du monde réel.

Une classe est un moule pour créer des objets.

Un objet est une instance d'une classe.

Exemple :

Nous créons une classe book qui a pour propriété : "title", "author", "isbn.

Classe Book :

```java
public class Book {

String title;

String author;

String isbn;

}
```

Nous appelerons le live comme suit, dans le main :

Main :

```java
public class Main{

public static void main(String[] args) {

Book book = new Book();

}

}
```

## II/ L'encapsulation


L'encapsulation permet de protéger les attributs de notre class, de sorte

à ce qu'ils ne soient accessible que dans sa class.

Exemple :

Classe Book :

```java
public class Book {

private String title;

private String author;

private String isbn;

}
```

Nous instaurons ici nos attributs en "private" alors que la class est

déclarée "public". Cela signifie que les attributs n'est accessible que par

la class alors que la class est accessible partout.

Par la suite nous allons rendre accessible ses attributs à l'extérieur au

travers de "Getters" et "Setters".

Getters : permet de rendre la valeur de l'attribut

Setters : permet de définir / modifier la valeur de l'attribut

Exemple :

Classe Book :

```java
public class Book {

...

public String getTitle() {

return title;

}

public void setTitle(String title) {

this.title = title;

}

public String getAuthor() {

return author;

}

public void setAuthor(String author) {

this.author = author;

}

public String getIsbn() {

return isbn;

}

public void setIsbn(String isbn) {

this.isbn = isbn;

}

}
```

A partir de là, nous allons initialiser nos attributs au travers des Getters

et nous afficherons grâce au Setters.

Exemple :

Classe Main :

```java
public class Main{

public static void main(String[] args) {

Book book = new Book();

book.setTitle("Coding with Maui");

book.setAuthor("Maui");

book.setIsbn("3625NB");

System.out.println(book.getTitle());

System.out.println(book.getAuthor());

System.out.println(book.getIsbn());

}

}
```

Pour simplifier l'affichage, nous allons instaurer une méthode dans notre

classe Book.

Exemple :

Classe Book :

```java
public class Book {

...

public void displayInfos() {

System.out.println("Title : " + title);

System.out.println("Author : " + author);

System.out.println("ISBN : " + isbn);

}

}
```

Nous allons pouvoir supprimer tout les System.out.println(book....) et les

remplacer par la méthode créée.

Exemple :

Classe Main :

```java
public class Main {

...

book.displayInfos();

}
```

## III/ L'héritage


L'héritage est un principe de la programmation orientée objets qui va

permettre d'étendre une class existante.

Cela définira donc l'attribution de certaines propriété "Parent" d'une

class à d'autre(s) class "enfant(s)".

Exemple :

Nous allons créer une autre classe : class Ebook et "étendre" les propriétés

de la class Book.

Classe Ebook :

```java
public class Ebook extends Book {

private String subject;

public String getSubject() {

return subject;

}

public void setSubject(String subject) {

this.subject = subject;

}

}
```

Nous pourrons créer un nouveau livre, comme pour book, dans le Main.

Exemple :

Classe Main :

```java
public class Main {

...

Ebook ebook = new Ebook();

ebook.setTitle("Coding is cool");

ebook.setAuthor("Maui");

ebook.setIsbn("2738UI");

ebook.setSubject("Coder c'est trop bien");

ebook.displayInfos();

}
```

## IV/ Le Polymorphysme


Le polymorphysme définit qu'une méthode peut avoir plusieurs formes.

Dans notre projet, nous allons utiliser @Override dans notre class Ebook

pour "surcharger" la méthode displayInfos() de la class Book.

Cela permettra de rajouter l'affichage de notre sujet Ebook.

Exemple :

Classe Ebook :

```java
public class Ebook extends Book {

...

@Override

public void displayInfos() {

super.displayInfos();

System.out.println("Subject : " + subject);

}

}
```

Dans cette méthode, nous utilisons "super.methode" pour appeler les

propriété parent.

Ainsi, lors de l'utilisation de la méthode displayInfos dans notre Main

pour notre Ebook, il affichera bien le "title", l'"author", l'"isbn" et

le "subject".


## V/ L'Abstraction


L'Abstraction permet d'éliminer toute complexité afin de ne montrer que

l'essentiel des fonctionnalité que l'on veux.

Cependant, lorsqu'une class est difini comme abstraite, elle ne peut pas

créer d'objet.

Nous allons utiliser une nouvelle class pour définir un cadre en la

définissant comme abstraite.

Exemple :

Nous créons donc la classe LibraryItem et nous y installons "title", "isbn"

et la méthode "displayInfos". Ce qui définit donc le cadre de notre projet.

Classe LibraryItem :

```java
public abstract class LibraryItem {

private String title;

private String isbn;

public String getTitle() {

return title;

}

public void setTitle(String title) {

this.title = title;

}

public String getIsbn() {

return isbn;

}

public void setIsbn(String isbn) {

this.isbn = isbn;

}

public abstract void displayInfos();

}
```

De ce fait, nous devons apporter des modifications à notre class Book

puisque nous avons défini certains attributs et la méthode dans la class

abstraite.

Classe Book :

```java
public class Book extends LibraryItem {

private String author;

public String getAuthor() {

return author;

}

public void setAuthor(String author) {

this.author = author;

}

@Override

public void displayInfos() {

System.out.println("Title : " + getTitle());

System.out.println("Author : " + author);

System.out.println("ISBN : " + getIsbn());

}

}
```

Nous avons étendu la parentalité de notre class abstraite à notre class

book, supprimer les attributs et leurs getters / setters, défini maintenant

dans la class LibraryItem. Et nous avons donc instauré notre méthode avec

@Override (permet de surcharger) et appelé nos attribut par leur getters.


## VI/ Les Interfaces


Une interface est un contrat passé à une class. Le contrat va définir un

ensemble de méthode et la class sera obligée d'implémenter toute ces

méthodes. Une interface est définie par la clé mot interface. Une interface

peut hériter d'une autre interface. Une interface ne peut pas hériter d'une

class. Une interface ne peut pas être instanciée.

Nous allons donc créer une class "Interface" du nom de Loannable, qui

va définir des méthodes d'emprunt ou de retour de livre.

Ainsi, nous serons dans l'obligation de retourner les méthode dans la class

où sera "implenté" notre interface.

Exemple :

Class Interface Loannable :

```java
public interface Loannable {

void loanItem();

void returnItem();

}
```

Classe Book :

```java
public class Book extends LibraryItem implements Loannable {

...

@Override

public void loanItem() {

System.out.println("Le livre a été emprunté !");

}

@Override

public void returnItem() {

System.out.println("Le livre a été rendu !");

}

}
```

Nous avons utilisé "implements" pour définir le contrat passé avec la class

Loannable.

Ces méthodes pourrant être, ensuite, appelé dans notre main pour notre book

comme pour notre ebook.


## VII/ Les Constructeurs


Le constructeur permet de définir la manière dont nous souhaitons que notre

objet soit.

Il est appelé lors de la création d'un objet.

Exemple :

Classe Book :

```java
public class Book extends LibraryItem implements Loannable {

...

public Book(String author) {

this.author = author;

}

...

}
```

Cela permettrai de simplifier notre affichage dans le Main.

Classe Main :

```java
public class Main {

public static void main(String[] args) {

Book book = new Book("Maui");

...

}

}
```"# POO_JAVA" 
