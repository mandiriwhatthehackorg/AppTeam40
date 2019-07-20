package com.example.mandirionline.fragment;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mandirionline.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    LineChart linechart_balance;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        linechart_balance = view.findViewById(R.id.linechart_balance);
        generateInitialLineData();

        return view;
    }

    private void generateInitialLineData() {
        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry(0, 14f));
        entries.add(new Entry(1, 10f));
        entries.add(new Entry(2, 8f));

        entries.add(new Entry(3, 16f));
        entries.add(new Entry(4, 24f));
        entries.add(new Entry(5, 32f));

        entries.add(new Entry(6, 31f));
        entries.add(new Entry(7, 18f));
        entries.add(new Entry(8, 19f));

        entries.add(new Entry(9, 21f));
        entries.add(new Entry(10, 12f));
        entries.add(new Entry(11, 9f));

        entries.add(new Entry(12, 6f));
        entries.add(new Entry(13, 11f));
        entries.add(new Entry(14, 10f));

        entries.add(new Entry(15, 22f));
        entries.add(new Entry(16, 16f));
        entries.add(new Entry(17, 14f));

        entries.add(new Entry(18, 11f));
        entries.add(new Entry(19, 14f));
        entries.add(new Entry(20, 22f));

        entries.add(new Entry(21, 29f));
        entries.add(new Entry(22, 28f));
        entries.add(new Entry(23, 18f));

        entries.add(new Entry(24, 13f));
        entries.add(new Entry(25, 11f));
        entries.add(new Entry(26, 16f));

        entries.add(new Entry(27, 10f));
        entries.add(new Entry(28, 7f));
        entries.add(new Entry(29, 6f));
        entries.add(new Entry(30, 7f));

        LineDataSet dataSet = new LineDataSet(entries,null);

        dataSet.setValueTextSize(9f);
        dataSet.setDrawValues(true);
        dataSet.setValueTextColor(ContextCompat.getColor(getActivity(), R.color.colorTransparent));
        //dataSet.setDrawValues(false);

        dataSet.setLineWidth(2f);
        dataSet.setColor(ContextCompat.getColor(getActivity(), R.color.colorAccent1));
        dataSet.setDrawCircles(false);
        dataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);
        dataSet.setDrawFilled(true);
        Drawable drawable = ContextCompat.getDrawable(getActivity(), R.drawable.gradient_linechart);
        dataSet.setFillDrawable(drawable);

        Legend l = linechart_balance.getLegend();
        l.setFormSize(0f); // set the size of the legend forms/shapes
        l.setForm(Legend.LegendForm.NONE); // set what type of form/shape should be used
        l.setTextSize(16f);
        l.setTextColor(Color.parseColor("#80FFFFFF"));

        XAxis xAxis = linechart_balance.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM_INSIDE);

        final String[] date = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        xAxis.setValueFormatter(new IndexAxisValueFormatter(date));

        xAxis.setGranularity(1f); // minimum axis-step (interval) is 1
        xAxis.setGranularityEnabled(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setTextSize(12f);
        xAxis.setTextColor(Color.parseColor("#FFFFFF"));

        linechart_balance.getXAxis().setDrawGridLines(false);
        linechart_balance.getAxisLeft().setDrawGridLines(false);
        linechart_balance.getAxisRight().setDrawGridLines(false);

        linechart_balance.getDescription().setEnabled(false);
        linechart_balance.getLegend().setEnabled(false);
        linechart_balance.setViewPortOffsets(0f,0,0f,0);

        YAxis yAxisRight = linechart_balance.getAxisRight();
        yAxisRight.setEnabled(false);

        YAxis yAxisLeft = linechart_balance.getAxisLeft();
        yAxisLeft.setEnabled(false);

        LineData data = new LineData(dataSet);

        linechart_balance.getXAxis().setDrawLabels(false);
        linechart_balance.getAxisLeft().setDrawLabels(false);
        linechart_balance.getAxisRight().setDrawLabels(false);

        linechart_balance.setData(data);
        /*chart2.animateX(2000);*/
        linechart_balance.invalidate();

        linechart_balance.getViewPortHandler().setMinimumScaleX(1f);
        linechart_balance.getViewPortHandler().setMinimumScaleY(1f);
        linechart_balance.getViewPortHandler().setMaximumScaleX(1f);
        linechart_balance.getViewPortHandler().setMaximumScaleY(1f);
    }


}
