import java.util.ArrayList;

public class Raum {

 private String raumNr;
 private Techniker techniker;
 private ArrayList<Moebelstueck> moebelListe;

 public Raum(String raumNr){

  this.raumNr = raumNr;
 }

 public String getRaumNr() {
  return raumNr;
 }

 public Techniker getTechniker() {
  return techniker;
 }

 public ArrayList<Moebelstueck> getMoebelListe() {
  return moebelListe;
 }
 public ArrayList<Moebelstueck> getmoebel(String inventarNr) {
  return moebel;
 }
 public void setRaumNr(String raumNr){
  this.raumNr = raumNr;
 }

 public void setTechniker(Techniker techniker){
  this.techniker = techniker;
 }

 public void setMoebelListe(ArrayList<Moebelstueck> moebelListe){
  this.moebelListe = moebelListe;
 }

 public void addMoebel(Moebelstueck moebelstueck){

  return this.moebel++;
 }

 public void removeMoebel(Moebelstueck moebelstueck){

  return this.moebel--;
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


