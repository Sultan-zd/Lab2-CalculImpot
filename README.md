# LAB 2 - Calculateur d'Impôts Locaux 🏠💰

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)

## 📖 À propos du projet
Ce projet est le deuxième laboratoire de mon apprentissage en **Programmation Mobile : Android avec Java**. 

L'objectif de cette application est de calculer automatiquement le montant des impôts locaux d'une habitation en se basant sur les saisies de l'utilisateur (surface, nombre de pièces et équipements). Ce lab marque une évolution par rapport au précédent en introduisant la récupération de données saisies au clavier et la conversion de types (String vers Nombres).

## ✨ Fonctionnalités
L'application propose un formulaire simple permettant à l'utilisateur de :
* **Saisir la surface** de la maison en m² (clavier numérique).
* **Saisir le nombre de pièces** (clavier numérique).
* **Indiquer la présence d'une piscine** via une case à cocher.
* **Calculer l'impôt total** généré dynamiquement selon la règle métier suivante : 
  * *Base : Surface × 2 DH*
  * *Supplément : 50 DH par pièce + 100 DH si présence d'une piscine.*

## 📸 Aperçu
*(Remplace le lien ci-dessous par une capture d'écran de ton application en fonctionnement !)*
![Capture d'écran de l'application](https://via.placeholder.com/250x500.png?text=Ajouter+une+capture+ici)

## 🛠️ Concepts techniques abordés
Ce projet m'a permis d'approfondir la manipulation de l'interface utilisateur et la logique métier en Java :
* **Conception UI (XML) :**
  * Utilisation du composant `EditText` pour la saisie de texte.
  * Restriction du clavier virtuel à la saisie de nombres (`android:inputType="number"`).
  * Intégration de composants à états comme la `CheckBox`.
* **Logique Applicative (Java) :**
  * Récupération du texte saisi par l'utilisateur (`getText().toString()`).
  * **Casting et Parsing :** Conversion des chaînes de caractères (String) en valeurs numériques (`Double.parseDouble`, `Integer.parseInt`) pour effectuer des calculs mathématiques.
  * Utilisation de l'opérateur ternaire `(condition ? vrai : faux)` pour une logique conditionnelle concise.
  * Prévention des erreurs (nécessité de gérer les champs vides pour éviter les crashs de type *NumberFormatException*).

## 🚀 Comment lancer le projet en local
1. Clonez ce dépôt sur votre machine locale :
   ```bash
   git clone [https://github.com/VOTRE_NOM_UTILISATEUR/Lab2-CalculImpot.git](https://github.com/VOTRE_NOM_UTILISATEUR/Lab2-CalculImpot.git)
