CREATE DATABASE SupplyFlowDB;
USE SupplyFlowDB;

CREATE TABLE Fournisseur (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    ville VARCHAR(50) NOT NULL
);

CREATE TABLE Produit (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100) NOT NULL,
    categorie VARCHAR(50),
    prix DECIMAL(10,2),
    quantite INT DEFAULT 0,
    fournisseur_id BIGINT,
    FOREIGN KEY (fournisseur_id) REFERENCES Fournisseur(id)
);

CREATE TABLE MouvementStock (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    produit_id BIGINT NOT NULL,
    quantite INT NOT NULL,
    type ENUM('ENTREE','SORTIE') NOT NULL,
    date DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (produit_id) REFERENCES Produit(id)
);


INSERT INTO Fournisseur (nom, ville) VALUES 
('Fournisseur A', 'Casablanca'),
('Fournisseur B', 'Rabat'),
('Fournisseur C', 'Marrakech');

INSERT INTO Produit (nom, categorie, prix, quantite, fournisseur_id) VALUES
('Produit 1', 'Electronique', 1500.00, 10, 1),
('Produit 2', 'Alimentaire', 50.00, 100, 2),
('Produit 3', 'Textile', 200.00, 25, 3),
('Produit 4', 'Electronique', 2500.00, 5, 1);

INSERT INTO MouvementStock (produit_id, quantite, type) VALUES
(1, 5, 'ENTREE'),
(1, 2, 'SORTIE'),
(2, 50, 'ENTREE'),
(3, 10, 'ENTREE'),
(3, 5, 'SORTIE'),
(4, 3, 'ENTREE');











