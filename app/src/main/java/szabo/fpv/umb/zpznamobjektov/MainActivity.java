package szabo.fpv.umb.zpznamobjektov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    data data = new data();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        MyAdapter myAdapter = new MyAdapter(this,data.returnList());
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

//    private List<Country> returnList() {
//        List<Country> list = new ArrayList<Country>();
//        list.add(new Country("Slovensko","49 036 "+km2));
//        list.add(new Country("Maďarsko", "93 030 "+km2));
//        list.add(new Country("Poľsko","312 679 "+km2));
//        return list;
//    }
}