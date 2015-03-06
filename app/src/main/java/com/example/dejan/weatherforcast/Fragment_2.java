package com.example.dejan.weatherforcast;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.dejan.weatherforcast.R;import java.util.ArrayList;

/**
 * Created by Dejan on 2/18/2015.
 */
public class Fragment_2 extends Fragment {

    WeatherForecast forecast = new WeatherForecast();
    public ListView days;

    public ArrayList<DailyForecast> dailyForecasts;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_2, container, false);
        days = (ListView) rootView.findViewById(R.id.days);


        return rootView;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

    }



}