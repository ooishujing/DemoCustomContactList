package sg.edu.rp.c346.democustomcontactlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvContact = findViewById(R.id.listViewContacts);
        ArrayList<Contact> alContactList = new ArrayList<Contact>();

        alContactList.add(new Contact("Mary", 65,65442334,'F'));
        alContactList.add(new Contact("Ken",65,97442437,'M'));

        CustomAdapter caContact=new CustomAdapter(this, R.layout.row, alContactList);
        lvContact.setAdapter(caContact);
    }
}
