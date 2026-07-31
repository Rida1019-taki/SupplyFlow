# SupplyFlow Logistics

## 1. Nom du projet

**Nom du projet :** SupplyFlow Logistics – Application de Gestion d’Entrepôt

---

# 2. Présentation du projet

SupplyFlow Logistics est une application web interne développée avec Spring Boot permettant de gérer les opérations principales d’un entrepôt logistique. Elle permet aux utilisateurs de gérer les produits, les fournisseurs et les mouvements de stock. Son objectif principal est de faciliter le suivi des stocks, des entrées et des sorties de marchandises grâce à une interface simple et organisée.

---

# 3. Problématique

Le problème identifié est que la gestion des stocks dans un entrepôt peut devenir difficile lorsque les produits, les fournisseurs et les mouvements de marchandises ne sont pas centralisés dans une seule application.

La solution proposée permet de digitaliser la gestion de l’entrepôt en offrant une interface permettant d’ajouter, consulter, modifier et suivre les informations liées aux produits et aux stocks.

---

# 4. Fonctionnalités principales

- Ajouter des produits dans l’entrepôt.
- Afficher la liste des produits disponibles.
- Modifier les informations d’un produit.
- Supprimer un produit.
- Ajouter et consulter les fournisseurs.
- Enregistrer les entrées de stock.
- Enregistrer les sorties de stock.
- Consulter l’historique des mouvements de stock.
- Rechercher un produit par son nom.
- Afficher le nombre total de produits enregistrés.

---

# 5. Technologies utilisées

| Technologie | Utilisation dans le projet |
|-------------|----------------------------|
| Java | Langage principal de développement |
| Spring Boot | Création de l’application backend |
| Spring MVC | Gestion des contrôleurs et des vues |
| Spring Data JPA | Gestion de l’accès aux données |
| Hibernate | Mapping objet-relationnel |
| Thymeleaf | Création des interfaces web dynamiques |
| Maven | Gestion des dépendances |
| MySQL / H2 | Stockage des données |
| HTML/CSS | Structure et mise en forme des pages |

Nous avons utilisé **Spring Boot** pour construire l’application web.

Nous avons utilisé **Spring MVC** pour gérer les requêtes utilisateurs et la navigation entre les pages.

Nous avons utilisé **Spring Data JPA et Hibernate** pour communiquer avec la base de données.

Nous avons utilisé **Thymeleaf** pour afficher les données dynamiques côté serveur.

---

# 6. Installation et lancement

## 6.1 Prérequis

Pour utiliser ce projet, vous devez disposer de :

- Java 17 ou supérieur
- Maven
- MySQL ou H2 Database
- Git
- IntelliJ IDEA ou Visual Studio Code

---

## 6.2 Cloner le dépôt

```bash
git clone https://github.com/VOTRE_COMPTE/supplyflow-logistics.git