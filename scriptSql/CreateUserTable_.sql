CREATE TABLE app.usercomponent (
  id INTEGER  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
  user_id VARCHAR(50) PRIMARY KEY NOT NULL,
  password VARCHAR(50)NOT NULL,
  nom VARCHAR(50),
  prenom VARCHAR(50)NOT NULL,
  email VARCHAR(50)NOT NULL,
  adresse VARCHAR(50),
  date_naissance VARCHAR(50),
  photo VARCHAR(500)
);
 
INSERT INTO app.usercomponent(user_id, password,nom,prenom,email,adresse,date_naissance,photo) 
VALUES('minhlv','123456','Luu Van ','Luu Van Minh','vanminh2501@gmail.com','Q.Binh Thanh,Tp HCM','25/01/1989','http://lctinhoc.com/uploads/news/2012_12/logo_dtn.png');

