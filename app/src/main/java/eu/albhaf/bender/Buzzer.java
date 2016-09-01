package eu.albhaf.bender;

import android.util.Log;

public class Buzzer implements Frobnicator {
  @Override public String getFrazzle() {
    return "buzz";
  }

  @Override public void frobnicate() {
    Log.d("Buzzer", getFrazzle());
  }
}
