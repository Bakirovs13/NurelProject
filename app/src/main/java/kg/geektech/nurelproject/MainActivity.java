package kg.geektech.nurelproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ArrayList<Model> countries = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // создаем адаптер
        MyAdapter adapter = new MyAdapter(this, countries);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        countries.add(new Model ("Влюбиться"));
        countries.add(new Model ("Влюбиться"));
        countries.add(new Model ("Влюбиться"));
        countries.add(new Model ("Влюбиться"));
        countries.add(new Model ("Научиться играть на инструменте"));
        countries.add(new Model ("Научиться играть на инструменте"));
        countries.add(new Model ("Научиться играть на инструменте"));
        countries.add(new Model ("Научиться играть на инструменте"));
        countries.add(new Model ("Заниматься каким-либо спортом"));
        countries.add(new Model ("Заниматься каким-либо спортом"));
        countries.add(new Model ("Заниматься каким-либо спортом"));
        countries.add(new Model ("Заниматься каким-либо спортом"));
        countries.add(new Model ("Покататься на лодке"));
        countries.add(new Model ("Покататься на лодке"));
        countries.add(new Model ("Покататься на лодке"));
        countries.add(new Model ("Покататься на лодке"));

    }

}