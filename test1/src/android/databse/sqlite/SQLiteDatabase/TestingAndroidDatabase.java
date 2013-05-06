package android.databse.sqlite.SQLiteDatabase;


import android.app.Activity;
import android.os.Bundle;
import android.database.sqlite.SQLiteDatabase;
 
public class TestingAndroidDatabase extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
 
        SQLiteDatabase db;
        db = openOrCreateDatabase(
               "TestingData.db"
               , SQLiteDatabase.CREATE_IF_NECESSARY
               , null
              );
     }
}