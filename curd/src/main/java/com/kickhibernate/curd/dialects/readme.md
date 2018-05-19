# Dialects:
<p>Hibernate Sql Dialects in hibernate: Connecting any hibernate application with the any database, you must specify the SQL dialects.
So whenever you need to connect your database to you hibernate application you need to define the type of Hibernate SQL Dialect.
org.hibernate.dialect package hold the hibernate sql dialects implementation.
Here are the list of Hibernate Sql Dialects:<p>

# RDBMS                     -             	  DIALECT <br>

# DB2	                   -                 org.hibernate.dialect.DB2Dialect <br>
# DB2 AS/400	               -                 org.hibernate.dialect.DB2400Dialect
# DB2 OS390	               -                 org.hibernate.dialect.DB2390Dialect
# PostgreSQL	               -                 org.hibernate.dialect.PostgreSQLDialect
# MySQL	                   -                 org.hibernate.dialect.MySQLDialect
# MySQL with InnoDB	       -                 org.hibernate.dialect.MySQLInnoDBDialect
# MySQL with MyISAM	       -                 org.hibernate.dialect.MySQLMyISAMDialect
# Oracle (any version)	   -                 org.hibernate.dialect.OracleDialect
# Oracle 9i/10g	           -                 org.hibernate.dialect.Oracle9Dialect
# Sybase	                   -                 org.hibernate.dialect.SybaseDialect
# Sybase Anywhere	       -                 org.hibernate.dialect.SybaseAnywhereDialect
# Microsoft SQL Server      -               	 org.hibernate.dialect.SQLServerDialect
# SAP DB	                   -                 org.hibernate.dialect.SAPDBDialect
# Informix	               -                 org.hibernate.dialect.InformixDialect
# Firebird	               -                 org.hibernate.dialect.FirebirdDialect
# FrontBase                 -                 org.hibernate.dialect.FrontbaseDialect
# HypersonicSQL	           -                 org.hibernate.dialect.HSQLDialect
# Ingres	                   -                 org.hibernate.dialect.IngresDialect
# Progress                  -                 org.hibernate.dialect.ProgressDialect
# Mckoi SQL                 -                 org.hibernate.dialect.MckoiDialect
# Interbase	               -                 org.hibernate.dialect.InterbaseDialect
# Pointbase	               -                 org.hibernate.dialect.PointbaseDialect


If you will check <h>hibernate.cfg.xml</h> file in this application you will get below line in xml

<code> <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property> </code>

In this above line we are defining the mysql dialect because we are using mysql database for this application so we need to MySQL DIALECT,
If you want to connect with any another database you just need to replace name of dialect with your required database DIALECT name .
