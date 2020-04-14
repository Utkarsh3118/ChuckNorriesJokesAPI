package com.example.chucknorris;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

interface JokeInterface
{
    @GET("{path}")
    Call<Joke> getRandomJokes(@Path("path") String path);
}
