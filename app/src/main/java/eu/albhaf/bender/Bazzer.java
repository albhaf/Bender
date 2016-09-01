package eu.albhaf.bender;

import android.util.Log;

public class Bazzer implements Frobnicator {
  @Override public String getFrazzle() {
    return "bazz";
  }

  @Override public void frobnicate() {
    Log.d("Bazzer", getFrazzle());
  }
}
