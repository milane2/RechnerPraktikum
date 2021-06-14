public class Raum {

 private String raumNr;
 private Techniker techniker;
 private ArrayList<Moebelstueck> moebelListe;

 public Raum(String raumNr, Techniker techniker ){

  this.raumNr = raumNr;
  this.techniker = techniker;
 }

 public String getRaumNr() {
  return raumNr;
 }

 public Techniker getTechniker() {
  return techniker;
 }

 public void addMoebel(Moebelstueck moebelstueck){
  return this.moebelstueck++;
 }

 public ArrayList<Moebelstueck> getMoebelListe() {
  return moebelListe;
 }

 public void removeMoebel(Moebelstueck moebelstueck){
  return this.moebelstueck--;
 }
 public int getAnzahlMoebel(){
  return anzahlMoebel;
 }
 public double getGewichtGesamt(){
  return gewichtGesamt;
 }

 public String toString(){
  String ausgabe;
  ausgabe = "\nRaumnNummer: " + getRaumNr();
  ausgabe += "\nTechniker: " + getTechniker();
  ausgabe += "\nMöbelListe: " + getMoebelListe();

  return ausgabe;
 }
}


