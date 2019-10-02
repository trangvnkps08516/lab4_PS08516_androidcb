package com.ps08516.lab4_ps08516_androidcb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Lab4_CustomListview extends AppCompatActivity {
    ListView lvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab4__custom_listview);
        lvContact = findViewById(R.id.lv);
        ArrayList<Contact> arrContact = new ArrayList<>();
        Contact contact1 = new Contact("Võ Ngọc Kim Trang", "0393267994", "RED");
        Contact contact2 = new Contact("Nguyễn Thị Thanh Thảo", "0345326809", "RED");
        arrContact.add(contact1);
        arrContact.add(contact2);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.item_listview, arrContact);
        lvContact.setAdapter(adapter);
    }
}
