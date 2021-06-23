import java.util.ArrayList;

public class Raum {

 private String raumNr;
 private Techniker techniker;
 private ArrayList<Moebelstueck> moebelListe;

 public Raum(String raumNr) {
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
 public Moebelstueck getmoebel(String inventarNr) throws MoebelNichtGefundenExeption {
// Variante 1 (sogenannte FOR EACH-SCHLEIFE):
  for (Moebelstueck m : moebelListe) {
   if (m.getInventarNr().equals(inventarNr)) {
    return m;
   }
  }
  throw new MoebelNichtGefundenExeption(inventarNr);
 }

 //  Variante 2:
//  for (int i = 0; i < moebelListe.size(); i++) {
//   if (moebelListe.get(i).getInventarNr().equals(inventarNr)) {
//    return moebelListe.get(i);
//   }
//  }

 public void setRaumNr(String raumNr) {
  this.raumNr = raumNr;
 }

 public void setTechniker(Techniker techniker) {
  this.techniker = techniker;
 }

 public void setMoebelListe(ArrayList<Moebelstueck> moebelListe) {
  this.moebelListe = moebelListe;
 }

 public void addMoebel(Moebelstueck moebelstueck) {
  moebelListe.add(moebelstueck);
 }

 public void removeMoebel(Moebelstueck moebelstueck) {
  moebelListe.remove(moebelstueck);
 }

 public int getAnzahlMoebel() {
  moebelListe.get(moebelListe.size());
  return moebelListe.size();
 }

 public double getGewichtGesamt() {
  int summe= 0;
  for(Moebelstueck gewicht : this.moebelListe) {
   summe = (int) (summe + Moebelstueck.getGewicht());
  }
  return summe / (this.moebelListe.size() + 1);
 }

 @Override
 public String toString() {
  String ausgabe;
  ausgabe = "\nRaumnNummer: " + getRaumNr();
  ausgabe += "\nTechniker: " + getTechniker();
  ausgabe += "\nMöbelListe: " + getMoebelListe();
  ausgabe += "\nAnzahl: " + getAnzahlMoebel();
  ausgabe += "\nGesamtGewicht: " + getGewichtGesamt();
  return ausgabe;
 }
}