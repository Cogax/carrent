# carrent

Dies ist ein Semester-Projekt im Kurs "Software Architektur & Design".


## 1. C4 Modell

### 1.1 Context

#### 1.1.1 Aufgabenstellung
Es soll ein neues Autovermietungssystem „CarRent“ erstellt werden. Das System soll aus einem
Server-Teil und einem Web-Client bestehen. Die Daten sollen mittels OR-Mapper in eine relationale
Datenbank gespeichert werden können. Die Business Logik soll auf einem Application Server laufen
und eine WebService Schnittstelle anbieten. Der Web-Client benutzt den WebService um die
Funktionen auszufühen.


Folgende Detailinformationen liegen unstrukturiert über das zu entwickelnde System vor:
- Der Sachbearbeiter kann Kunden mit Namen und Adresse und Kundennummer im System
verwalten, d.h. erfassen, bearbeiten, löschen und den Kunden mit dessen Namen oder
Kundennummer suchen.
- Der Sachbearbeiter kann zudem die Autos von CarRent verwalten und nach denen suchen.
- Jedes Auto kann einer bestimmten Klasse zwischen Luxusklasse, Mittelklasse oder
Einfachklasse zugeordnet werden und besitzt zudem eine Marke, einen Typ und eine
eindeutige Identifikation.
- Jede Klasse besitzt eine Tagesgebühr.
- Bei einer neuen Reservation kann der Kunde ein Auto aus einer bestimmten Klasse wählen. Er
muss zudem die Anzahl der Tage angeben, die er das Auto gerne mieten möchte. Dabei
werden die Gesamtkosten berechnet. Wird die Reservation gespeichert, so wird sie mit einer
Reservationsnummer ablegt.


#### 1.1.2 Actors
- Sachbearbeiter
- Kunde
- System

### 1.2 Containers
Three Thier:
- Application Server
- Database Server
- CLient(s)

#### 1.2.1 Application Server
Enthält die Business-Logik. Kommuniziert über einen Query-Stream mit dem Database Server.

#### 1.2.2 Database Server
Datenhaltung.

#### 1.2.3 Client
WEB CLient etc. Kommuniziert über HTTP (REST) mit dem Application Server.

### 1.3 Components
- Service (Kommunikation zwischen Client & Application Server)
- Foundation & Domain (Kommunikation zwischen Application Server & Database Server: REST, Netzwerkkommunikation etc.)
- Kundenverwaltung (customers)
- Reservationssystem (reservations)
- Autoverwaltung (cars)

### 1.4 Classes

#### 1.4.1 Use-Cases (Brief Format)
S = Search/Suchen

- Sachbearbeiter:
  - CRUDS Kunden
  - CRUDS Autos
  - CRUDS Reservationen

- Kunde
  - Auto reservieren
