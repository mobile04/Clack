package br.com.digitalhouse.clackapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.clackapp.Elementos.Movie;
import br.com.digitalhouse.clackapp.adapter.RecyclerViewMovieAdapter;
import br.com.digitalhouse.clackapp.adapter.RecyclerViewMovieAdapter2;
import br.com.digitalhouse.clackapp.adapter.RecyclerViewMovieAdapter3;
import br.com.digitalhouse.clackapp.adapter.RecyclerViewMovieAdapter4;

public class HomeActivity extends AppCompatActivity implements RecyclerViewMovieAdapter.CardMovieClicado, RecyclerViewMovieAdapter2.CardMovieClicado, RecyclerViewMovieAdapter3.CardMovieClicado, RecyclerViewMovieAdapter4.CardMovieClicado {

    private RecyclerView recyclerView,recyclerView2,recyclerView3,recyclerView4;
    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerView = findViewById(R.id.recycler_view_id);
        recyclerView2 = findViewById(R.id.recycler_view_id_2);
        recyclerView3 = findViewById(R.id.recycler_view_id_3);
        recyclerView4 = findViewById(R.id.recycler_view_id_4);

        RecyclerViewMovieAdapter adapter = new RecyclerViewMovieAdapter(getListMovie());

        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        RecyclerViewMovieAdapter2 adapter2 = new RecyclerViewMovieAdapter2(getListMovie());

        LinearLayoutManager manager2 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        RecyclerViewMovieAdapter3 adapter3 = new RecyclerViewMovieAdapter3(getListMovie());

        LinearLayoutManager manager3 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        RecyclerViewMovieAdapter4 adapter4 = new RecyclerViewMovieAdapter4(getListMovie());

        LinearLayoutManager manager4 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);

        recyclerView2.setLayoutManager(manager2);
        recyclerView2.setAdapter(adapter2);

        recyclerView3.setLayoutManager(manager3);
        recyclerView3.setAdapter(adapter3);

        recyclerView4.setLayoutManager(manager4);
        recyclerView4.setAdapter(adapter4);

        navigationView = (BottomNavigationView) findViewById(R.id.navigationView);


    }

    private List<Movie> getListMovie() {

        List<Movie> movieList = new ArrayList<>();

        Movie movie = new Movie();
        movie.setPoster(R.drawable.podres);
        movieList.add(movie);

        Movie movie1 = new Movie();
        movie1.setPoster(R.drawable.amigosalienigenas);
        movieList.add(movie1);

        Movie movie2 = new Movie();
        movie2.setPoster(R.drawable.animaisfantasticos23);
        movieList.add(movie2);

        Movie movie3 = new Movie();
        movie3.setPoster(R.drawable.casadomedo);
        movieList.add(movie3);

        return movieList;
    }


    @Override
    public void onMovieClicado(Movie movie) {

        Bundle bundle = new Bundle();

        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);


    }
}
