# Citizen-Data-Registration-Software
Software code to register for the application of birth certificate.

Problem Statement: 
Providing pdf forms to clients to fill information is one of the easiest ways to extract data.
Extracting data from large number of people is a tedious job; hence providing the clients with a pdf file to fill in the requested information is convenient.  Earlier clients had to commute all the way to government offices to register the birth details of their child in order to obtain the birth certificate also absence of proper internet connectivity causes problems in submission of incomplete forms.
However implementation of this system now resolves all these problems. 'Reading PDF form' is a project aimed at reducing the time and cost and increases the productivity of the organization.
It also allows the client to fill the form offline and submit it whenever the internet connection is available.



Description:
The system contains a servlet, which runs on a server. When the client fills in the pdf form and presses the submit button the form data is sent to a specific url (in the form of HTTP request). The server then deploys the servlet(FormServlet) and the servlet then receives the data and stores it inside the database built locally.

Database- The database contains validation and organization of specific fields according to the adhaar card number of the mother, also the database tables have been created because they do exist even if there are no rows in child table (table Normalization rules) and the database has been built according to model view architecture. 
Moreover - If child_birth_details table grows in size -we can add partitions on this table based on Year of birth And/or Unique_Id_Of_Birth_place etc, which will help in improving performance of queries running on this table.

Also , the PDF form provided to the client also contains validation.


Database schema
Below are the table names and their corresponding columns..

Child_Birth_Details   (Table Name)
--------------------------------------
- Unique_Id (Primary Key)
- Child_Name
- Birth Type
- Gender
- Date Of Birth
- Unique_ID_Of_Birth_Place (foreign key)
- Hospital Name 
- UID_of_mother (foreign key)
- Informant_name
- Informant_address
(May be, this can be replaced by only 1 field, Informant's UID (foreign key))
- Attention_Type_ID (foreign key)
- Delivery_Type_ID (foreign key)
- Duration
- Birth_Mark


Parents/Informants_Details   (Table Name)
-----------------------------------------------
- UID (Aadhar card number)
- Name
- occupation
- Address
- Education
- Age



Birth_Place_Details  (Table Name)
----------------------------
- Unique_Id (primary key) 
- Rural/Urban
- Taluka
- District
- State
- Country 

Delivery_Type
--------------------
- Delivery_Type_ID
- Deleivert_Type_Name


Attention_Type
--------------------
- Attention_Type_Id
- Attention_Type_Name


Birth_Type_Details
--------------------
- Birth_Type_Id
- Birth_Type_Name


I have created this tables because this do exist even if you don't have any rows in child table(table Normalization rules)

Moreover - If child_birth_details table grows in size - You can add partitions on this table based on 
Year of birth And/Or Unique_Id_Of_Birth_place etc, which will help you in improving performance of queries running on this table.

NOTE:INITIAL VALUES ARE ADDED TO THE FIRST ROW OF EACH TABLE SO THAT THE POINTER POINTS TO THE NEXT LOCATION WHEN THE NEXT FORM DATA COMES IN.
