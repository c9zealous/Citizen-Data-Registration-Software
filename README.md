# Citizen-Data-Registration-Software
Software code to register for the application of birth certificate.


The system contains a servlet, which runs on a server. When the client fills in the pdf form and presses the submit button the form data is sent to a specific url (in the form of HTTP request). The server then deploys the servlet(FormServlet) and the servlet then receives the data and stores it inside the database built locally.

Database- The database contains validation and organization of specific fields according to the adhaar card number of the mother, also the database tables have been created because they do exist even if there are no rows in child table (table Normalization rules) and the database has been built according to model view architecture. 
Moreover - If child_birth_details table grows in size -we can add partitions on this table based on Year of birth And/or Unique_Id_Of_Birth_place etc, which will help in improving performance of queries running on this table.

Also , the PDF form provided to the client also contains validation.
