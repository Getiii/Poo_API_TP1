#   ReadMe

````
https://github.com/NicoBoisseau/Poo_API_TP1
````
***


## Table of Contents
1. [Dependencies](#Dependencies)


***
# Dependencies

## Web
Used to build Web app

## Data JPA
Spring Data JPA is used to store and retrieve data in a relational database.

## thymeleaf
Thymeleaf is used to create web site with Spring.
Using some templates.

## Hibernate
The process of configuring a web application form to support validation.

## H2
H2 is one of the popular in-memory databases written in Java. H2 can be embedded in Java applications or run in the client-server mode.

## DevTools
A dependency who's used to make the application dev more pleasent.

***

### Etape 13
Relisez le code du contrôleur, aidez-vous de documentation sur internet, et r ́epondez aux
questions suivantes :
1. Avec quelle partie du code avons-nous paramètré l’url d’appel /greeting ?

Avec RequestParam et GetMapping

2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?

Avec le return 

3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?

C'est un object spring et 

### Etape 17
Il y a la table address qui est apparu dans la base de donnée.

### Etape 18
Expliquez l’apparition de la nouvelle table en vous aidant de vos cours sur Hibernate, et
de la d´ependance Hibernate de Spring. Ajoutez la r´eponse dans le README.

### Etape 30
https://www.baeldung.com/maven-webjars

```
<dependency>
    <groupId>org.webjars</groupId>
    <artifactId>bootstrap</artifactId>
    <version>3.3.7-1</version>
</dependency>
```