package com.example.chucknorris;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    TextView textViewJokes;
    Button buttonNextJoke;
    JokeInterface jokeInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewJokes = findViewById(R.id.tvJokes);
        buttonNextJoke = findViewById(R.id.nxtJoke);
        jokeInterface = APIClient.getClient().create(JokeInterface.class);

        buttonNextJoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getRandomJokesFromAPI();
            }
        });

    }

    private void getRandomJokesFromAPI() {
        Call<Joke> joke = jokeInterface.getRandomJokes("random");
        joke.enqueue(new Callback<Joke>() {
            @Override
            public void onResponse(Call<Joke> call, Response<Joke> response) {

                Joke  joke1 = response.body();
                String jokes = joke1.value;
                textViewJokes.setText(jokes);
            }

            @Override
            public void onFailure(Call<Joke> call, Throwable t) {

            }
        });
    }

}
