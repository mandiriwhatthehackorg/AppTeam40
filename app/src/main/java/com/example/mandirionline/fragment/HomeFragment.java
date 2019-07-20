package com.example.mandirionline.fragment;



import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mandirionline.R;
import com.example.mandirionline.adapter.ProductAdapter;
import com.example.mandirionline.network.ApiClient;
import com.example.mandirionline.network.ApiService;
import com.example.mandirionline.network.model.ProductResponse;
import com.example.mandirionline.network.model.ServiceCustomerDetailResponse;
import com.example.mandirionline.network.model.customeraccountnumber.CustomerBalanceResponse;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.HEAD;

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
        setupNama(view);
        linechart_balance = view.findViewById(R.id.linechart_balance);
        generateInitialLineData();
        getBalance(view);
        setupProduct(view);
        return view;
    }

    private void setupNama(final View view) {
        ApiService apiService = ApiClient.getInstance2(getContext()).create(ApiService.class);
        Call<ServiceCustomerDetailResponse> call = apiService.getCustomerDetail("1000009024");
        call.enqueue(new Callback<ServiceCustomerDetailResponse>() {
            @Override
            public void onResponse(Call<ServiceCustomerDetailResponse> call, Response<ServiceCustomerDetailResponse> response) {
                TextView namaTextview = view.findViewById(R.id.name_customer);
                String name = response.body().getResponse().getCif().getCIFName1() + " " +response.body().getResponse().getCif().getCIFName2();
                namaTextview.setText(name);
                Log.d("TAGGER", response.toString());
            }

            @Override
            public void onFailure(Call<ServiceCustomerDetailResponse> call, Throwable t) {
                Log.d("ERROR",t.toString());
            }
        });
    }

    private void generateInitialLineData() {
        ArrayList<Entry> entries = new ArrayList<>();

        entries.add(new Entry(0, 10f));
        entries.add(new Entry(1, 26f));
        entries.add(new Entry(2, 19f));

        entries.add(new Entry(3, 12f));
        entries.add(new Entry(4, 19f));
        entries.add(new Entry(5, 25f));

        entries.add(new Entry(6, 15f));
        entries.add(new Entry(7, 26f));
        entries.add(new Entry(8, 32f));

        entries.add(new Entry(9, 21f));
        entries.add(new Entry(10, 12f));
        entries.add(new Entry(11, 23f));

        entries.add(new Entry(12, 17f));
        entries.add(new Entry(13, 11f));
        entries.add(new Entry(14, 18f));

        entries.add(new Entry(15, 29f));
        entries.add(new Entry(16, 16f));
        entries.add(new Entry(17, 11f));

        entries.add(new Entry(18, 5f));
        entries.add(new Entry(19, 19f));
        entries.add(new Entry(20, 18f));

        entries.add(new Entry(21, 29f));
        entries.add(new Entry(22, 22f));
        entries.add(new Entry(23, 12f));

        entries.add(new Entry(24, 16f));
        entries.add(new Entry(25, 8f));
        entries.add(new Entry(26, 19f));

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
        dataSet.setColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));
        dataSet.setDrawCircles(false);
        dataSet.setMode(LineDataSet.Mode.HORIZONTAL_BEZIER);
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

        linechart_balance.getViewPortHandler().setMinimumScaleX(3f);
        linechart_balance.getViewPortHandler().setMinimumScaleY(1f);
        linechart_balance.getViewPortHandler().setMaximumScaleX(3f);
        linechart_balance.getViewPortHandler().setMaximumScaleY(1f);
    }


    void getBalance(View view){
        final TextView tvBalance = view.findViewById(R.id.balance);
        ApiService apiService = ApiClient.getInstance2(getContext()).create(ApiService.class);
        Call<CustomerBalanceResponse> call = apiService.getCustomerBalance("1111006401549");
        call.enqueue(new Callback<CustomerBalanceResponse>() {
            @Override
            public void onResponse(Call<CustomerBalanceResponse> call, Response<CustomerBalanceResponse> response) {
                String formattedString = formatter(response.body().getResponse().getBalance().getCreditInfo().getCreditInfo().get(2).getCreditValue());
                tvBalance.setText(formattedString);
            }

            @Override
            public void onFailure(Call<CustomerBalanceResponse> call, Throwable t) {
                Log.d("ERROR",t.toString());
            }
        });
    }

    private String formatter(String unformattedAmount){
        NumberFormat formatter = new DecimalFormat("###,###,###");
        double myNumber = Double.parseDouble(unformattedAmount);
        String formattedNumber = formatter.format(myNumber);
        return formattedNumber;
    }

    private void setupProduct(final View view){


        ApiService apiService = ApiClient.getInstance3(getContext()).create(ApiService.class);
        Call<List<ProductResponse>> call = apiService.getProducts();
        call.enqueue(new Callback<List<ProductResponse>>() {
            @Override
            public void onResponse(Call<List<ProductResponse>> call, Response<List<ProductResponse>> response) {
                List<ProductResponse> responses = response.body();
                RecyclerView rv = view.findViewById(R.id.recycler_product);
                rv.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL, false));
                ProductAdapter productAdapter = new ProductAdapter(responses);
                rv.setAdapter(productAdapter);
                Log.d("Product Sukses",response.body().toString());
            }

            @Override
            public void onFailure(Call<List<ProductResponse>> call, Throwable t) {
                Log.d("ERROR",t.toString());
            }
        });
    }


}
