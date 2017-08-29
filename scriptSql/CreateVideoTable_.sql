CREATE TABLE app.videocomponent (
  id_video INTEGER  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1), 
  user_id int NOT NULL,
  description VARCHAR(50)NOT NULL,
  titre VARCHAR(50)NOT NULL,
  category VARCHAR(50),
  labels VARCHAR(50),
  path VARCHAR(500)
);