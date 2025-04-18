# Softverska analiza projekta: Kalkulator

##  LOC analiza

Broj linija koda (LOC - Lines of Code):

- `Calculator.java` – **107 LOC**
- `Start.java` – **25 LOC**
- **Ukupno:** **132 LOC** 

LOC je računat kao broj svih linija koje sadrže neku vrstu koda (bez praznih linija i komentara).

---

##  Neformalni pregled i statička analiza

Ovo su neka zapažanja do kojih sam došao pregledom koda (nisam pokretao aplikaciju, samo sam gledao strukturu i sintaksu).

---

###  `Calculator.java`

- **Linija 8** – `static float finalResult;`  
  → Mislim da bi možda bilo bolje da se izbegne statički rezultat jer može praviti probleme u više niti ili paralelnom izvršavanju. 

- **Linija 10–18** – Unutrašnja klasa `Operations`  
  → Deluje kao dobra ideja da se grupišu konstante, ali možda bi mogla biti u posebnom fajlu ako projekt bude veći. 

- **Linija 22** – `public static String Run(String expression)`  
  → Ime metode `Run` mi deluje kao da je vezano za pokretanje procesa, ali zapravo se ovde evaluira izraz. Možda bi `evaluate()` bilo malo jasnije. 

- **Linije 29–35** – Provera prvog karaktera izraza  
  → Verovatno bi korisnicima koji ne znaju format izraza prijalo više validacije, npr. kad unesu nešto pogrešno (slova, više operatora zaredom i slično). 

- **Linije 38–43** – Parsiranje operatora  
  → Ovaj deo mi deluje ok, ali možda bi mogla da se koristi RegEx grupa za operatore radi boljeg održavanja. 

- **Linije 45–58** – Parsiranje brojeva  
  → Try-catch blok je ok, ali nisam siguran da se razlikuju svi potencijalni problemi (npr. NaN, razmak, loš unos). 

- **Linije 60–128** – Metoda `Calculate`  
  → Ova rekurzivna logika je zanimljiva, ali verovatno može doći do stack overflow-a ako ima baš mnogo operacija. Možda bi iterativni pristup bio sigurniji.  
  → Takođe, ima dosta ponavljanja istih linija koda — moguće je to refaktorisati. 

---

###  `Start.java`

- **Linija 9** – `Scanner scanIn;`  
  → Možda nepotrebno da se skener instancira više puta unutar petlje. Bilo bi čisto da je van `while` petlje, pa da se koristi kroz ceo program. 

- **Linija 14** – `if (Expression.equals("exit"))`  
  → Ovde bi bilo korisno dodati da se ignorišu velika i mala slova (`equalsIgnoreCase`), da korisniku bude lakše. 

- **Generalno**  
  → Kod je čitljiv i jednostavan, ali mislim da bi dodavanje više komentara pomoglo onima koji prvi put čitaju.   
  → Moglo bi da se koristi više validacije korisničkog unosa (npr. ako korisnik unese „5++2“ ili neko slovo).

---


