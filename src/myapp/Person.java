package myapp;

public class Person {
    // pola (atrybuty) klasy określającej obiekt "myapp.Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek
    public String address; // pole przechowujące cechę adres
    public int birthYear; // pole przechowujące cechę rok urodzenia

    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    public Person() {
        forename = "Mateusz";
        surname = "Karmazyn";
        age = 24;
        address = "Warszawa";
        birthYear = 1999;

    }

    /**
     * Konstruktor z pięcioma parametrami, które możemy podać przy jego tworzeniu
     */
    public Person(String initForename, String initSurname, int initAge, String initAddress, int initBirthYear) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
        address = initAddress;
        birthYear = initBirthYear;
    }

    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat. " + "Urodziłem się w " + birthYear + ". Mieszkam w " + address + ".");
    }

    // metoda growOld zwiększająca wiek o podaną wartość
    public void growOld(int years){
        age = age + years;
        birthYear = birthYear - years;
    }

    // metoda beYounger zmniejszająca wiek o 1
    public int beYounger(){
        age = age - 1;
        birthYear = birthYear + 1;
        return age;
    }

    // metoda getName zwracająca wartość forename obiektu
    public String getName(){
        return forename;
    }

    // metoda setName ustawiająca wartość forename obiektu
    public void setName(String nameToSet){
        forename = nameToSet;
    }
}