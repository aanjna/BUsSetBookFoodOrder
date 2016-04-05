package com.book.bus.busbooking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TabHost;

import java.util.ArrayList;
import java.util.List;

public class WalletActivity extends AppCompatActivity {
RecyclerView rv_cash, rv_card;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet_transaction);

        TabHost tabHost = (TabHost) findViewById(R.id.TabHost);
        tabHost.setup();
        // create tab 1
        TabHost.TabSpec spec1 = tabHost.newTabSpec("tab1");
        spec1.setIndicator("Cash");
        spec1.setContent(R.id.rv_cash);
        tabHost.addTab(spec1);
        //create tab2
        TabHost.TabSpec spec2 = tabHost.newTabSpec("tab2");
        spec2.setIndicator("Cards");
        spec2.setContent(R.id.rv_card);
        tabHost.addTab(spec2);
// recyclerview activity

        rv_cash = (RecyclerView)findViewById(R.id.rv_cash);
        List<WTcashModel> al=new ArrayList<WTcashModel>();
        rv_cash.setHasFixedSize(true);
        rv_cash.setItemAnimator(new DefaultItemAnimator());

       // for(int i=0; i<10; i++) {
            al.add(new WTcashModel("100", "Wallet"));

        WTAdaptor wtAdaptor=new WTAdaptor(al);

        rv_cash.setAdapter(wtAdaptor);
        rv_cash.setLayoutManager(new LinearLayoutManager(this));
        rv_cash.setItemAnimator(new DefaultItemAnimator());


/*================================================================*/
        rv_card = (RecyclerView)findViewById(R.id.rv_card);
        rv_card.setHasFixedSize(true);
        List<WtCardModel> ab=new ArrayList<WtCardModel>();
       // for(int i=0; i<10; i++) {
            ab.add(new WtCardModel("200"));

        WTCardAdaptor wtCardAdaptor=new WTCardAdaptor(ab);

        rv_card.setAdapter(wtCardAdaptor);
        rv_card.setLayoutManager(new LinearLayoutManager(this));
        rv_card.setItemAnimator(new DefaultItemAnimator());

    }
}
