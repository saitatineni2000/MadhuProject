package com.example.saisandeep.madhuproject;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends ActionBarActivity {

    ListView list, list_head;
    ArrayList<HashMap<String, String>> mylist, mylist_title;
    ListAdapter adapter_title, adapter;
    HashMap<String, String> map1, map2;
    String[] Appointment = {"7:00 Am", "7:05 Am", "7:10 Am", "7:15 Am", "7:20 Am"};
    String[] type = {"A", "A", "0", "A", "A"};
    String[] Lastname = {"Smith", "Williamson", "", "Smith", "Thompson"};
    String[] Firstname = {"Mary", "Elizabeth", "", "James", " Henry"};
    String[] PatientId = {"187456", "183256", "", "135642", "135526"};
    String[] Language = {"E", "E", "", "S", "E"};
    String[] HQ = {"HQ", "HQ", " ", "HQ", "HQ"};
    String[] HE = {"HE", "HE", "", "HE", "HE"};
    String[] NP = {"NP", "NP", "", "NP", "NP"};
    String[] FLUSHOT = {"FLU", "FLU", "", "FLU", "FLU"};
    String[] TDAP = {"TDAP", "TDAP", "", "TDAP", "TDAP"};
    String[] Team = {"", "Todd", "", "Sally", ""};
    String[] Action = {"", "", "", "", "Start HE"};
    String[] Alerts = {"", "", "", "", ""};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clinic_schedule);

        InfoBarFragment infoBarFragment=new InfoBarFragment();
        android.app.FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.fragment_layout_info_bar,infoBarFragment,"InfoBarfragment");
        transaction.commit();

        list = (ListView) findViewById(R.id.listView2);
        list_head = (ListView) findViewById(R.id.listView1);
        showActivity();

    }

    public void showActivity() {
        mylist = new ArrayList<HashMap<String, String>>();
        mylist_title = new ArrayList<HashMap<String, String>>();
        map1 = new HashMap<String, String>();
        map1.put("appt", "Appt");
        map1.put("type", "Type ");
        map1.put("lastname", " Last Name");
        map1.put("firstname", "First Name");
        map1.put("patientid", "patient ID");
        map1.put("lang", "Lang");
        map1.put("hq", "HQ");
        map1.put("he", "HE");
        map1.put("np", "NP");
        map1.put("flushot", "FLU SHOT");
        map1.put("tdap", "TDAP");
        map1.put("team", "Team");
        map1.put("action", "Action");
        map1.put("alerts", "Alerts");
        mylist_title.add(map1);

        try {
            adapter_title = new SimpleAdapter(this, mylist_title, R.layout.clinic_schedule_row, new String[]{"appt", "type", "lastname", "firstname", "patientid", "lang", "hq", "he", "np", "flushot", "tdap", "team", "action", "alerts"},
                    new int[]{R.id.Appt, R.id.Type, R.id.Lastname, R.id.Firstname, R.id.Patientid, R.id.Language, R.id.HQ, R.id.HE, R.id.NP, R.id.FLUSHOT, R.id.TDAP, R.id.Team, R.id.Action, R.id.Alerts});
            list_head.setAdapter(adapter_title);
        } catch (Exception e) {

        }

        for (int i = 0; i < Appointment.length; i++) {
            map2 = new HashMap<String, String>();
            map2.put("appt", Appointment[i]);
            map2.put("type", type[i]);
            map2.put("lastname", Lastname[i]);
            map2.put("firstname", Firstname[i]);
            map2.put("patientid", PatientId[i]);
            map2.put("lang", Language[i]);
            map2.put("hq", HQ[i]);
            map2.put("he", HE[i]);
            map2.put("np", NP[i]);
            map2.put("flushot", FLUSHOT[i]);
            map2.put("tdap", TDAP[i]);
            map2.put("team", Team[i]);
            map2.put("action", Action[i]);
            map2.put("alerts", Alerts[i]);
            mylist.add(map2);
        }

        try {
            adapter = new SimpleAdapter(this, mylist, R.layout.clinic_schedule_row,
                    new String[]{"appt", "type", "lastname", "firstname", "patientid", "lang", "hq", "he", "np", "flushot", "tdap", "team", "action", "alerts"}, new int[]{
                    R.id.Appt, R.id.Type, R.id.Lastname, R.id.Firstname, R.id.Patientid, R.id.Language, R.id.HQ, R.id.HE, R.id.NP, R.id.FLUSHOT, R.id.TDAP, R.id.Team, R.id.Action, R.id.Alerts});
            list.setAdapter(adapter);
        } catch (Exception e) {

        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
