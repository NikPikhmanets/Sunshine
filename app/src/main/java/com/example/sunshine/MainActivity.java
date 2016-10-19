package com.example.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    public static class PlaceholderFragment extends Fragment {

        ArrayAdapter<String> mForecastAdapter;

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            String[] forecastArray = {
                    "1st  forecast - XX °C/YY °F",
                    "2st  forecast - XX °C/YY °F",
                    "3st  forecast - XX °C/YY °F",
                    "4st  forecast - XX °C/YY °F",
                    "5st  forecast - XX °C/YY °F",
                    "6st  forecast - XX °C/YY °F",
                    "7st  forecast - XX °C/YY °F",
                    "8st  forecast - XX °C/YY °F",
                    "9st  forecast - XX °C/YY °F",
                    "10st forecast - XX °C/YY °F",
                    "11st forecast - XX °C/YY °F",
                    "12st forecast - XX °C/YY °F",
                    "13st forecast - XX °C/YY °F",
                    "14st forecast - XX °C/YY °F",
                    "15st forecast - XX °C/YY °F",
                    "16st forecast - XX °C/YY °F",
                    "17st forecast - XX °C/YY °F",
                    "18st forecast - XX °C/YY °F",
                    "19st forecast - XX °C/YY °F",
                    "20st forecast - XX °C/YY °F"
            };

            // ArrayList — реализует интерфейс List. Изменяемый массив.
            List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

            mForecastAdapter =
                    new ArrayAdapter<>(
                            getActivity(),                      // ссылку на активность через метод getActivity()
                            R.layout.list_item_forecast,
                            R.id.list_item_forecast_textview,
                            weekForecast);

            View rootView = inflater.inflate(R.layout.fragment_main, container, false); //из содержимого layout-файла создать View-элемент

            ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
            listView.setAdapter(mForecastAdapter);

            return rootView;
        }
    }

}
