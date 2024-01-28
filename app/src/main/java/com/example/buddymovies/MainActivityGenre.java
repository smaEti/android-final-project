package com.example.buddymovies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import java.util.ArrayList;

public class MainActivityGenre extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ArrayList<DataClass> dataList;
    ArrayList<DataClass> dataList2;
    ArrayList<DataClass> dataList3;
    DataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_genre);

        addDataAction();
        addDataDrama();
        addDataComedy();

        initAdapterAction();
        initAdapterDrama();
        initAdapterComedy();

    }

    private void initAdapterAction(){
        RecyclerAdapter adapter = new RecyclerAdapter(MainActivityGenre.this, dataList);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_action);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(LayoutManager);
    }
    private void initAdapterDrama(){
        RecyclerAdapter adapter2 = new RecyclerAdapter(MainActivityGenre.this, dataList2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_drama);

        recyclerView.setAdapter(adapter2);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(LayoutManager);
    }
    private void initAdapterComedy(){
        RecyclerAdapter adapter3 = new RecyclerAdapter(MainActivityGenre.this, dataList3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_comedy);

        recyclerView.setAdapter(adapter3);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(LayoutManager);
    }
    private void addDataAction(){
        dataList = new ArrayList<>();
        androidData = new DataClass("Total Recall", "When a man goes in to have virtual vacation memories of the planet Mars implanted in his mind, an unexpected and harrowing series of events forces him to go to the planet for real - or is he?", R.drawable.recall2012);
        dataList.add(androidData);
        androidData = new DataClass("Jack Reacher", "A homicide investigator digs deeper into a case involving a trained military sniper responsible for a mass shooting.", R.drawable.tom2012);
        dataList.add(androidData);
        androidData = new DataClass("jumper", "A young man with teleportation abilities suddenly finds himself in the middle of an ancient war between those like him and their sworn annihilators.", R.drawable.jumper);
        dataList.add(androidData);
        androidData = new DataClass("beast", "A father and his two teenage daughters find themselves hunted by a massive rogue lion intent on proving that the Savanna has but one apex predator.", R.drawable.beast);
        dataList.add(androidData);
    }

    private void addDataDrama(){
        dataList2 = new ArrayList<>();
        androidData = new DataClass("Money Heist", "An unusual group of robbers attempt to carry out the most perfect robbery in Spanish history - stealing 2.4 billion euros from the Royal Mint of Spain.", R.drawable.money);
        dataList2.add(androidData);
        androidData = new DataClass("Squid Game", "Hundreds of cash-strapped players accept a strange invitation to compete in children's games. Inside, a tempting prize awaits with deadly high stakes: a survival game that has a whopping 45.6 billion-won prize at stake.", R.drawable.squidgame);
        dataList2.add(androidData);
        androidData = new DataClass("Pianist", "During the WWII, acclaimed Polish musician Wladyslaw faces various struggles as he loses contact with his family. As the situation worsens, he hides in the ruins of Warsaw in order to survive.", R.drawable.pianist);
        dataList2.add(androidData);
        androidData = new DataClass("Elite", "When three working-class teenagers begin attending an exclusive private school in Spain, the clash between them and the wealthy students leads to murder.", R.drawable.elite);
        dataList2.add(androidData);
    }
    private void addDataComedy(){
        dataList3 = new ArrayList<>();
        androidData = new DataClass("Basij Bemola", "roozi roozegari dalqak basij ra moftakhar kard", R.drawable.dalqak1);
        dataList3.add(androidData);
        androidData = new DataClass("ERFAAAAAAN", "bozorge qatelaye khak sefid late lata miderakhshe", R.drawable.erfan);
        dataList3.add(androidData);
        androidData = new DataClass("arshia", "jenab doctor hastan sirk daran", R.drawable.arshia);
        dataList3.add(androidData);
    }
    public void showPopUp(View v){
        PopupMenu popUp =  new PopupMenu(this ,v);
        popUp.setOnMenuItemClickListener(this);
        popUp.inflate(R.menu.popup_menu);
        popUp.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        if(item.getItemId() != R.id.genreMenuOption) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }
        return true;
    }
}

