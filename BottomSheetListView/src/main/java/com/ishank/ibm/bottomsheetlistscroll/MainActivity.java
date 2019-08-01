package com.ishank.ibm.bottomsheetlistscroll;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> poiCountryList;
    private Button btnSelect;
    BottomSheetListView bottomSheetListView;
    BottomSheetDialog bottomSheetDialog;
    ArrayAdapter list_adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setList();
        btnSelect = (Button) findViewById(R.id.btn_country);
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowBottomSheet();
            }
        });
    }

    private void ShowBottomSheet() {
        View view = getLayoutInflater().inflate(R.layout.layout_bottom_sheet_country, null);
        bottomSheetListView = (BottomSheetListView) view.findViewById(R.id.lv_country);


        list_adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, poiCountryList);
        bottomSheetListView.setAdapter(list_adapter);
        bottomSheetDialog = new BottomSheetDialog(MainActivity.this);
        bottomSheetDialog.setContentView(view);
        /*BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.from((View) view.getParent());
        bottomSheetBehavior.setPeekHeight(500);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);*/
        bottomSheetDialog.show();

        bottomSheetListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                btnSelect.setText(poiCountryList.get(position));
                bottomSheetDialog.dismiss();
            }
        });

    }

    private void setList() {
        //country list
        poiCountryList = new ArrayList<>();
        poiCountryList.add("India");
        poiCountryList.add("Afghanistan");
        poiCountryList.add("Albania");
        poiCountryList.add("Algeria");
        poiCountryList.add("Andorra");
        poiCountryList.add("Angola");
        poiCountryList.add("Argentina");
        poiCountryList.add("Armenia");
        poiCountryList.add("Australia");
        poiCountryList.add("Austria");
        poiCountryList.add("Azerbaijan");
        poiCountryList.add("Bahamas");
        poiCountryList.add("Bahrain");
        poiCountryList.add("Bangladesh");
        poiCountryList.add("Barbados");
        poiCountryList.add("Belarus");
        poiCountryList.add("Belgium");
        poiCountryList.add("Belize");
        poiCountryList.add("Benin");
        poiCountryList.add("Bhutan");
        poiCountryList.add("Bolivia");
        poiCountryList.add("Bosnia and Herzegovina");
        poiCountryList.add("Botswana");
        poiCountryList.add("Brazil");
        poiCountryList.add("Brunei Darussalam");
        poiCountryList.add("Bulgaria");
        poiCountryList.add("Burkina Faso");
        poiCountryList.add("Burundi");
        poiCountryList.add("Cambodia");
        poiCountryList.add("Cameroon");
        poiCountryList.add("Canada");
        poiCountryList.add("Cape Verde Islands");
        poiCountryList.add("Chad");
        poiCountryList.add("Chile");
        poiCountryList.add("China");
        poiCountryList.add("Colombia");
        poiCountryList.add("Congo");
        poiCountryList.add("Costa Rica");
        poiCountryList.add("Croatia");
        poiCountryList.add("Cuba");
        poiCountryList.add("Cyprus");
        poiCountryList.add("Czech Republic");
        poiCountryList.add("Denmark");
        poiCountryList.add("Djibouti");
        poiCountryList.add("Dominican Republic");
        poiCountryList.add("Ecuador");
        poiCountryList.add("Egypt");
        poiCountryList.add("El Salvador");
        poiCountryList.add("England");
        poiCountryList.add("Eritrea");
        poiCountryList.add("Estonia");
        poiCountryList.add("Ethiopia");
        poiCountryList.add("Fiji");
        poiCountryList.add("Finland");
        poiCountryList.add("France");
        poiCountryList.add("Gabon");
        poiCountryList.add("Gambia");
        poiCountryList.add("Georgia");
        poiCountryList.add("Germany");
        poiCountryList.add("Ghana");
        poiCountryList.add("Greece");
        poiCountryList.add("Grenada");
        poiCountryList.add("Guatemala");
        poiCountryList.add("Guinea");
        poiCountryList.add("Guyana");
        poiCountryList.add("Haiti");
        poiCountryList.add("Honduras");
        poiCountryList.add("Hungary");
        poiCountryList.add("Iceland");
        poiCountryList.add("Indonesia");
        poiCountryList.add("Iran");
        poiCountryList.add("Iraq");
        poiCountryList.add("Ireland");
        poiCountryList.add("Israel");
        poiCountryList.add("Italy");
        poiCountryList.add("Jamaica");
        poiCountryList.add("Japan");
        poiCountryList.add("Jordan");
        poiCountryList.add("Kazakhstan");
        poiCountryList.add("Kenya");
        poiCountryList.add("Kuwait");
        poiCountryList.add("Laos");
        poiCountryList.add("Latvia");
        poiCountryList.add("Lebanon");
        poiCountryList.add("Liberia");
        poiCountryList.add("Libya");
        poiCountryList.add("Lithuania");
        poiCountryList.add("Macedonia");
        poiCountryList.add("Madagascar");
        poiCountryList.add("Malawi");
        poiCountryList.add("Malaysia");
        poiCountryList.add("Maldives");
        poiCountryList.add("Mali");
        poiCountryList.add("Malta");
        poiCountryList.add("Mauritania");
        poiCountryList.add("Mauritius");
        poiCountryList.add("Mexico");
        poiCountryList.add("Moldova");
        poiCountryList.add("Monaco");
        poiCountryList.add("Mongolia");
        poiCountryList.add("Montenegro");
        poiCountryList.add("Morocco");
        poiCountryList.add("Mozambique");
        poiCountryList.add("Myanmar");
        poiCountryList.add("Namibia");
        poiCountryList.add("Nepal");
        poiCountryList.add("Netherlands");
        poiCountryList.add("New Zealand");
        poiCountryList.add("Nicaragua");
        poiCountryList.add("Niger");
        poiCountryList.add("Nigeria");
        poiCountryList.add("North Korea");
        poiCountryList.add("Norway");
        poiCountryList.add("Oman");
        poiCountryList.add("Pakistan");
        poiCountryList.add("Panama");
        poiCountryList.add("Paraguay");
        poiCountryList.add("Peru");
        poiCountryList.add("Poland");
        poiCountryList.add("Portugal");
        poiCountryList.add("Qatar");
        poiCountryList.add("Romania");
        poiCountryList.add("Russia");
        poiCountryList.add("Rwanda");
        poiCountryList.add("Saudi Arabia");
        poiCountryList.add("Scotland");
        poiCountryList.add("Senegal");
        poiCountryList.add("Serbia");
        poiCountryList.add("Seychelles");
        poiCountryList.add("Sierra Leone");
        poiCountryList.add("Singapore");
        poiCountryList.add("Slovakia");
        poiCountryList.add("Slovenia");
        poiCountryList.add("Somalia");
        poiCountryList.add("South Africa");
        poiCountryList.add("South Korea");
        poiCountryList.add("Spain");
        poiCountryList.add("Sri Lanka");
        poiCountryList.add("Sudan");
        poiCountryList.add("Suriname");
        poiCountryList.add("Swaziland");
        poiCountryList.add("Sweden");
        poiCountryList.add("Switzerland");
        poiCountryList.add("Syria");
        poiCountryList.add("Taiwan");
        poiCountryList.add("Tajikistan");
        poiCountryList.add("Tanzania");
        poiCountryList.add("Thailand");
        poiCountryList.add("Philippines");
        poiCountryList.add("Togo");
        poiCountryList.add("Trinidad and Tobago");
        poiCountryList.add("Tunisia");
        poiCountryList.add("Turkey");
        poiCountryList.add("Turkmenistan");
        poiCountryList.add("Tuvali");
        poiCountryList.add("Uganda");
        poiCountryList.add("UK");
        poiCountryList.add("Ukraine");
        poiCountryList.add("Uruguay");
        poiCountryList.add("USA");
        poiCountryList.add("Uzbekistan");
        poiCountryList.add("Vanuata");
        poiCountryList.add("Venezuela");
        poiCountryList.add("Vietnam");
        poiCountryList.add("Wales");
        poiCountryList.add("Western Samoa");
        poiCountryList.add("Yemen");
        poiCountryList.add("Yugoslavia");
        poiCountryList.add("Zaire");
        poiCountryList.add("Zambia");
        poiCountryList.add("Zimbabwe");
        poiCountryList.add("Palestine");
        poiCountryList.add("Tibet");
    }
}
