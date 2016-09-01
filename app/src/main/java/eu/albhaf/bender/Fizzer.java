package eu.albhaf.bender;

import android.util.Log;

public class Fizzer implements Frobnicator {
  @Override public String getFrazzle() {
    return "fizz";
  }

  @Override public void frobnicate() {
    Log.d("Fizzer", getFrazzle());
  }
}
