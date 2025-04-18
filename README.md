LOC za Calculator.java iznosi 148 dok Start.java iznosi 26

Calculator.java

Linija 10 – Korišćenje statičke promenljive finalResult može dovesti do problema u višedretvenom okruženju. Preporuka: vratiti rezultat kao povratnu vrednost metode.

Linija 14 – Ime metode ToString() ne poštuje Java konvenciju. Trebalo bi da se zove toString().

Linija 29 – Višestruko proveravanje karaktera pomoću if uslova – moglo bi da se refaktoriše u pomoćnu metodu isOperator(char).

Linije 35–56 – Parsiranje brojeva i detekcija Infinity ručno. U slučaju greške, vraća "ERROR" bez detalja. Bolje bi bilo vratiti jasnu poruku korisniku.

Linije 58–119 – Metoda Calculate je dugačka, rekurzivna i složena. U slučaju dubljih izraza može izazvati „StackOverflow“. Bolje rešenje bi bilo koristiti stog (stack) i iteraciju.

Višestruke linije – Promenljiva result koristi +=, a vrednost se zapravo uvek postavlja, tako da običan = bi bio sasvim dovoljan.

Opšti problem – Iako su operatori definisani u Operations, neka njihova upotreba u kodu je ipak hardkodovana i nejasna.
