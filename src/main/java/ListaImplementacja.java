import java.util.Arrays;

public class ListaImplementacja implements Lista {

    private int [] liczby;
    private int pojemnosc;
    private int rozmiar;

    ListaImplementacja(){
        this.liczby = new int[this.pojemnosc];
    }
 ListaImplementacja(int pojemnosc){
        this.liczby = new int[pojemnosc];
}

//    public void dodajElement(int liczba) {
//        if (this. rozmiar == this.pojemnosc){
//            System.out.println("Tablica jest pełna");
//            this.liczby = Arrays.copyOf(this.liczby, this.liczby.length*2);
//            this.rozmiar = this.liczby.length;
//        }
//        else {
//            this.liczby[rozmiar] = liczba;
//            rozmiar++;
public void dodajElement(int liczba) {
    if (this.liczby.length > rozmiar) {
        this.liczby[rozmiar] = liczba;
        rozmiar++;
    }
    else {
        this.liczby = Arrays.copyOf(liczby,liczby.length + 10);
        this.liczby[rozmiar] = liczba;
        rozmiar++;
        }

    }

    public int znajdz(int liczba) {
        return 0;
    }

    public String pisz() {
        return "liczby " + Arrays.toString(liczby);

    }
//    public String toString(){
//        return "Test";
//    }



    public boolean usunPierwszy(int liczba) {
        return false;
    }

    public void usunPowtorzenia() {

    }

    public void zapiszDoPliku(String plik) {

    }
}
