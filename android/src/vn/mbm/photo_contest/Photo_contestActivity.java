package vn.mbm.photo_contest;

import android.os.Bundle;
import com.phonegap.DroidGap;

public class Photo_contestActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        super.loadUrl("file:///android_asset/www/index.html");        
    }
}