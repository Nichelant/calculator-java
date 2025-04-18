LOC za Calculator.java iznosi 107 dok Start.java iznosi 25 sto znaci da zajedno imaju 132

Calculator.java - zapazanja

Linija 10 – Korišćenje statičke promenljive finalResult može dovesti do problema u višedretvenom okruženju. Preporuka: vratiti rezultat kao povratnu vrednost metode.

Linija 18 – Ime metode ToString() ne poštuje Java konvenciju. Trebalo bi da se zove toString().

Linija 29 – Višestruko proveravanje karaktera pomoću if uslova – moglo bi da se refaktoriše u pomoćnu metodu isOperator(char).

Linije 35–56 – Parsiranje brojeva i detekcija Infinity ručno. U slučaju greške, vraća "ERROR" bez detalja. Bolje bi bilo vratiti jasnu poruku korisniku.

Linije 58–119 – Metoda Calculate je dugačka, rekurzivna i složena. U slučaju dubljih izraza može izazvati „StackOverflow“. Bolje rešenje bi bilo koristiti stog (stack) i iteraciju.

Višestruke linije – Promenljiva result koristi +=, a vrednost se zapravo uvek postavlja, tako da običan = bi bio sasvim dovoljan.

Opšti problem – Iako su operatori definisani u Operations, neka njihova upotreba u kodu je ipak hardkodovana i nejasna.

Start.java - zapazanja

6 – String Expression; – Java naming konvencija preporučuje mala slova za promenljive (expression). CamelCase samo za klase.

7 – boolean active = true; – korektno, ali nije baš najlepši način za prekid petlje. Mozda je bolje while (true) + break?

9 – Scanner scanIn; definisan van petlje, ali se pravi novi objekat u svakoj iteraciji. 

11 – scanIn = new Scanner(System.in); – kreira se novi Scanner svaki put, što ja mislim da je losa praksa. Mozda je najbolje napraviti jednom van petlje

13 – if (Expression.equals("exit")) – solidna provera, ali bilo bi bolje da se koristi equalsIgnoreCase() za fleksibilniji unos.

14 – scanIn.close(); – dobra ideja, ali ako se skenira jednom,išlo bi van petlje. Moze da dođe do "Scanner closed" greške ako korisnik unese nesto nakon exit.

17 – System.out.println(Calculator.Run(Expression)); – ovo je okej, ali nema validacije izraza pre slanja. Ako korisnik unese @!# – izbacuje ERROR, što je okej, ali UX može biti bolji.
