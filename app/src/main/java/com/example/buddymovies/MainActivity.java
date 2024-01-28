package com.example.buddymovies;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    ArrayList<DataClass> dataList;
    ArrayList<DataClass> dataList2;
    ArrayList<DataClass> dataList3;
    DataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData2007();
        addData2012();
        addData2020();

        initAdapter2007();
        initAdapter2012();
        initAdapter2020();

    }

    private void initAdapter2007(){
        RecyclerAdapter adapter = new RecyclerAdapter(MainActivity.this, dataList);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_2007);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(LayoutManager);
    }
    private void initAdapter2012(){
        RecyclerAdapter adapter2 = new RecyclerAdapter(MainActivity.this, dataList2);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_2012);

        recyclerView.setAdapter(adapter2);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(LayoutManager);
    }
    private void initAdapter2020(){
        RecyclerAdapter adapter3 = new RecyclerAdapter(MainActivity.this, dataList3);

        RecyclerView recyclerView = findViewById(R.id.recyclerView_2020);

        recyclerView.setAdapter(adapter3);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(LayoutManager);
    }
    private void addData2007(){
        dataList = new ArrayList<>();
        androidData = new DataClass("Fight Club", "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into much more.", R.drawable.fight_club);
        dataList.add(androidData);
        androidData = new DataClass("Memento", "A man with short-term memory loss attempts to track down his wife's murderer.", R.drawable.memento);
        dataList.add(androidData);
        androidData = new DataClass("Green mile", "A tale set on death row, where gentle giant John Coffee possesses the mysterious power to heal people's ailments. When the lead guard, Paul Edgecombe, recognizes John's gift, he tries to help stave off the condemned man's execution.", R.drawable.green_mile);
        dataList.add(androidData);
        androidData = new DataClass("Matrix", "When a beautiful stranger leads computer hacker Neo to a forbidding underworld, he discovers the shocking truth--the life he knows is the elaborate deception of an evil cyber-intelligence.", R.drawable.matrix);
        dataList.add(androidData);
    }

    private void addData2012(){
        dataList2 = new ArrayList<>();
        androidData = new DataClass("Total Recall", "When a man goes in to have virtual vacation memories of the planet Mars implanted in his mind, an unexpected and harrowing series of events forces him to go to the planet for real - or is he?", R.drawable.recall2012);
        dataList2.add(androidData);
        androidData = new DataClass("Hotel Transylvania", "When a man goes in to have virtual vacation memories of the planet Mars implanted in his mind, an unexpected and harrowing series of events forces him to go to the planet for real - or is he?", R.drawable.hotel2012);
        dataList2.add(androidData);
        androidData = new DataClass("The Amazing Spider-man", "After Peter Parker is bitten by a genetically altered spider, he gains newfound, spider-like powers and ventures out to save the city from the machinations of a mysterious reptilian foe.", R.drawable.spiderman2012);
        dataList2.add(androidData);
        androidData = new DataClass("Jack Reacher", "A homicide investigator digs deeper into a case involving a trained military sniper responsible for a mass shooting.", R.drawable.tom2012);
        dataList2.add(androidData);
    }
    private void addData2020(){
        dataList3 = new ArrayList<>();
        androidData = new DataClass("Love and Monsters", "Seven years after he survived the monster apocalypse, lovably hapless Joel leaves his cozy underground bunker behind on a quest to reunite with his high school sweetheart.", R.drawable.lovemonster2020);
        dataList3.add(androidData);
        androidData = new DataClass("Violet Evergarden", "fter the aftermath of a war, a young girl who was used as a 'tool' for war learned to live. With the scars of burns, she goes back to her past to feel the true feelings of the Major's, \"I love you.\"", R.drawable.violet2020);
        dataList3.add(androidData);
        androidData = new DataClass("Underwater", "A crew of oceanic researchers working for a deep sea drilling company try to get to safety after a mysterious earthquake devastates their deepwater research and drilling facility located at the bottom of the Mariana Trench.", R.drawable.underwater2020);
        dataList3.add(androidData);
        androidData = new DataClass("Project Power", "When a pill that gives its users unpredictable superpowers for five minutes hits the streets of New Orleans, a teenage dealer and a local cop must team with an ex-soldier to take down the group responsible for its creation.", R.drawable.project2020);
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
        if(item.getItemId() != R.id.yearMenuOption) {
            Intent intent = new Intent(getApplicationContext(), MainActivityGenre.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        }
        return true;
    }
}

