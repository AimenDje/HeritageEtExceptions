# Héritage et Exceptions

# 🎯 Objectif du projet

Ce mini-projet illustre les concepts de l'héritage et des exceptions en programmation orientée objet. 
Il met en œuvre une hiérarchie de classes représentant différents types de véhicules et gère les erreurs via des exceptions personnalisées.

# 🚗 Classe Vehicle (Classe Mère)

La classe de base Vehicle contient les attributs communs à tous les véhicules :

- ownerName : Nom complet du propriétaire

- ownerAddress : Adresse du propriétaire

- brand : Marque du véhicule (ex : Fiat, Nissan, etc.)

- model : Modèle du véhicule (ex : Mustang)

- licencePlate : Immatriculation

- value : Valeur marchande (ex : 15 000 $)

# 🚚 Classe Truck (Classe Fille)

La classe Truck hérite de Vehicle et ajoute :

- materials : Liste des matériaux autorisés à transporter (ex : bois, sable, béton)

- permit : Numéro de permis (entier 64 bits)

- company : Nom de la société propriétaire du camion

# 🚙 Classe SUV (Classe Fille)

La classe SUV hérite aussi de Vehicle et ajoute :

- capacity : Nombre de personnes que le SUV peut transporter

- childSeatCount : Nombre de sièges pour enfants disponibles

- airbagCount : Nombre de sacs gonflables de sécurité

# ⚠️ Gestion des exceptions

Deux exceptions personnalisées sont utilisées dans ce projet :

- VehicleException : Levée lorsqu'une donnée essentielle est laissée vide (nom, adresse, etc.)

T- ruckException : Spécifique aux camions, levée en cas de données manquantes ou invalides sur le permis ou les matériaux

# 🛠️ Classe Driver (Classe de test)

La classe Driver permet de tester toutes les fonctionnalités :

- Création d’objets Vehicle, Truck et SUV

- Déclenchement et gestion des exceptions

- Affichage des données des véhicules

