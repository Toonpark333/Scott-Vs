package spark.game01.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import spark.game01.core.MyGame;

public class MyGameActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new MyGame());
  }
}
