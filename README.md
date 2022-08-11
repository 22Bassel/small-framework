# small-java-framework
java

you will need some external jars :
1- charm-glisten-4.3.7
2- commons-io-2.6.0
3- commons-net-3.8.0
4- ftplet-api-1.2.0
5- ftpserver-core-1.2.0
6- jcip-annotations-1.0-1
7- json-20211205
8- mina-core-2.1.6
9- mysql-connector
10- nimbus-jose-jwt-9.21
11- slf4j-api-1.7.36
12- slf4j-simple-1.6.1

in DB you have to create a DB called "rds",and the tables :
1- publickeys : "id" int(11)
                "UID" varchar(128)
                "TheKey" varchar(1024)

2- users : "ID" int(11)
           "UserID" varchar(50)
           "Name" varchar(50)
           "Password" varchar(50)
           "Email" varchar(50)
           "BirthDate" date
           "Gender" tinyint(1)
           "IP" varchar(50)
           "RecievePort" varchar(50)
           "CreateDate" datetime

3- channels : "ID" int(11)
              "FirstUserID" int(11)
              "SecondUserID" int(11)
              "TimeStart" 	datetime
              "TimeEnd" 	datetime
