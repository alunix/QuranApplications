package qazi.musab.colorcodedquran.curlutils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

import qazi.musab.colorcodedquran.R;
import qazi.musab.colorcodedquran.bookmarks.BookmarksActivity;


/**
 * Simple Activity for curl testing.
 * 
 * @author harism
 */
public class QuranReaderActivity extends BaseQuranReaderActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final AlertDialog.Builder alertbox4 = new AlertDialog.Builder(QuranReaderActivity.this);
        alertbox4.setTitle("Contribute");
        alertbox4.setIcon(android.R.drawable.stat_notify_error);


        alertbox4.setMessage("Please consider contributing towards the development of this application.");
        alertbox4.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface arg0, int arg1) {

                String[] items = new String[9];
                items[0] = "$1";
                items[1] = "$2";
                items[2] = "$3";
                items[3] = "$4";
                items[4] = "$5";
                items[5] = "$10";
                items[6] = "$20";
                items[7] = "$50";
                items[8] = "$100";


                AlertDialog.Builder chooser = new AlertDialog.Builder(QuranReaderActivity.this);
                chooser
                        .setTitle("Contribute")
                        .setItems(items, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                switch (which) {
                                    case 0:
                                        contributor.contributeOneDollar();
                                        break;
                                    case 1:
                                        contributor.contributetwoDollars();
                                        break;
                                    case 2:
                                        contributor.contributeThreeDollars();
                                        break;
                                    case 3:
                                        contributor.contributeFourDollars();
                                        break;
                                    case 4:
                                        contributor.contributeFiveDollars();
                                        break;
                                    case 5:
                                        contributor.contributeTenDollars();
                                        break;
                                    case 6:
                                        contributor.contributeTwentyDollars();
                                        break;
                                    case 7:
                                        contributor.contributeFiftyDollars();
                                        break;
                                    case 8:
                                        contributor.contributeHundredDollars();
                                        break;
                                }
                            }
                        });

                AlertDialog myChooser = chooser.create();
                myChooser.show();
            }
        });
        alertbox4.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        });
    }

    @Override
    protected int getPagesOfQuranNotIncludingIndex() {
        return 610;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()== R.id.item1) {
            String[] pages = new String[getPagesOfQuranNotIncludingIndex()];
            for (int i = 0; i < getPagesOfQuranNotIncludingIndex(); i++) {
                pages[i] = i + 2 + "";
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getCurlActivity());
            builder
                    .setTitle("Go To Page")
                    .setItems(pages, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            exitZoom();
                            dialog.dismiss();
                            mCurlView.setPageProvider(pageProvider);
                            mCurlView.setSizeChangedObserver(sizeChangedObserver);
                            mCurlView.setCurrentIndex(pageProvider.getPageCount() - 10 - which);
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
            dialog.show();
            return true;
        }
        if(item.getItemId()==R.id.item2) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getCurlActivity());
            String[] juz = getResources().getStringArray(R.array.juz);
            builder2
                    .setTitle("Go To Juz (Parah)")
                    .setItems(juz, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if(which==0){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-1);

                            }
                            if(which==1){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-23);

                            }
                            if(which==2){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-43);

                            }
                            if(which==3){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-63);

                            }
                            if(which==4){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-83);

                            }
                            if(which==5){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-103);

                            }
                            if(which==6){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-123);

                            }
                            if(which==7){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-143);

                            }
                            if(which==8){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-163);

                            }
                            if(which==9){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-183);

                            }
                            if(which==10){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-203);

                            }
                            if(which==11){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-223);

                            }
                            if(which==12){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-243);

                            }
                            if(which==13){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-263);

                            }
                            if(which==14){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-283);

                            }
                            if(which==15){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-303);

                            }
                            if(which==16){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-323);

                            }
                            if(which==17){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-343);

                            }
                            if(which==18){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-363);

                            }
                            if(which==19){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-383);

                            }
                            if(which==20){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-403);

                            }
                            if(which==21){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-423);

                            }
                            if(which==22){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-443);

                            }
                            if(which==23){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-463);

                            }
                            if(which==24){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-483);

                            }
                            if(which==25){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-503);

                            }
                            if(which==26){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-523);

                            }
                            if(which==27){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-543);

                            }
                            if(which==28){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-563);

                            }
                            if(which==29){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-587);

                            }

                            // The 'which' argument contains the index position
                            // of the selected item
                        }
                    });
            AlertDialog dialog2 = builder2.create();
            dialog2.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
            dialog2.show();
            return true;
        }
        if(item.getItemId()==R.id.item3) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(getCurlActivity());
            String[] surah = getResources().getStringArray(R.array.surah);
            builder3
                    .setTitle("Go To Surah")
                    .setItems(surah, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            if(which==0){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-2);
                            }
                            if(which==1){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-3);
                            }
                            if(which==2){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-51);
                            }
                            if(which==3){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-78);
                            }
                            if(which==4){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-107);
                            }
                            if(which==5){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-129);
                            }
                            if(which==6){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-152);
                            }
                            if(which==7){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-178);
                            }
                            if(which==8){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-188);
                            }
                            if(which==9){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-209);
                            }
                            if(which==10){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-222);
                            }
                            if(which==11){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-236);
                            }
                            if(which==12){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-250);
                            }
                            if(which==13){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-256);
                            }
                            if(which==14){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-262);
                            }
                            if(which==15){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-268);
                            }
                            if(which==16){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-282);
                            }
                            if(which==17){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-294);
                            }
                            if(which==18){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-306);
                            }
                            if(which==19){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-313);
                            }
                            if(which==20){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-323);
                            }
                            if(which==21){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-332);
                            }
                            if(which==22){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-343);
                            }
                            if(which==23){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-351);
                            }
                            if(which==24){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-360);
                            }
                            if(which==25){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-367);
                            }
                            if(which==26){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-377);
                            }
                            if(which==27){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-386);
                            }
                            if(which==28){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-397);
                            }
                            if(which==29){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-405);
                            }
                            if(which==30){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-412);
                            }
                            if(which==31){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-416);
                            }
                            if(which==32){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-419);
                            }
                            if(which==33){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-429);
                            }
                            if(which==34){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-435);
                            }
                            if(which==35){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-441);
                            }
                            if(which==36){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-446);
                            }
                            if(which==37){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-453);
                            }
                            if(which==38){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-459);
                            }
                            if(which==39){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-468);
                            }
                            if(which==40){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-478);
                            }
                            if(which==41){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-484);
                            }
                            if(which==42){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-490);
                            }
                            if(which==43){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-496);
                            }
                            if(which==44){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-499);
                            }
                            if(which==45){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-503);
                            }
                            if(which==46){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-507);
                            }
                            if(which==47){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-512);
                            }
                            if(which==48){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-516);
                            }
                            if(which==49){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-519);
                            }
                            if(which==50){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-521);
                            }
                            if(which==51){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-524);
                            }
                            if(which==52){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-527);
                            }
                            if(which==53){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-529);
                            }
                            if(which==54){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-532);
                            }
                            if(which==55){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-535);
                            }
                            if(which==56){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-538);
                            }
                            if(which==57){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-543);
                            }
                            if(which==58){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-546);
                            }
                            if(which==59){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-550);
                            }
                            if(which==60){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-552);
                            }
                            if(which==61){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-554);
                            }
                            if(which==62){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-555);
                            }
                            if(which==63){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-557);
                            }
                            if(which==64){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-559);
                            }
                            if(which==65){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-561);
                            }
                            if(which==66){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-563);
                            }
                            if(which==67){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-565);
                            }
                            if(which==68){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-568);
                            }
                            if(which==69){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-570);
                            }
                            if(which==70){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-572);
                            }
                            if(which==71){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-574);
                            }
                            if(which==72){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-577);
                            }
                            if(which==73){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-579);
                            }
                            if(which==74){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-581);
                            }
                            if(which==75){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-583);
                            }
                            if(which==76){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-585);
                            }
                            if(which==77){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-587);
                            }
                            if(which==78){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-588);
                            }
                            if(which==79){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-590);
                            }
                            if(which==80){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-591);
                            }
                            if(which==81){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-592);
                            }
                            if(which==82){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-593);
                            }
                            if(which==83){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-595);
                            }
                            if(which==84){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-596);
                            }
                            if(which==85){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-597);
                            }
                            if(which==86){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-598);
                            }
                            if(which==87){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-598);
                            }
                            if(which==88){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-599);
                            }
                            if(which==89){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-601);
                            }
                            if(which==90){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-601);
                            }
                            if(which==91){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-602);
                            }
                            if(which==92){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-603);
                            }
                            if(which==93){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-603);
                            }
                            if(which==94){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-604);
                            }
                            if(which==95){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-604);
                            }
                            if(which==96){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-605);
                            }
                            if(which==97){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-605);
                            }
                            if(which==98){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-606);
                            }
                            if(which==99){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-606);
                            }
                            if(which==100){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-607);
                            }
                            if(which==101){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-607);
                            }
                            if(which==102){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-608);
                            }
                            if(which==103){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-608);
                            }
                            if(which==104){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-608);
                            }
                            if(which==105){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-609);
                            }
                            if(which==106){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-609);
                            }
                            if(which==107){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-609);
                            }
                            if(which==108){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-609);
                            }
                            if(which==109){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-610);
                            }
                            if(which==110){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-610);
                            }
                            if(which==111){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-610);
                            }
                            if(which==112){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-611);
                            }
                            if(which==113){
                                exitZoom(); dialog.dismiss();
                                mCurlView.setPageProvider(pageProvider);
                                mCurlView.setSizeChangedObserver(new SizeChangedObserver(mCurlView));
                                mCurlView.setCurrentIndex(616-611);
                            }


                        }
                    });
            AlertDialog dialog3 = builder3.create();
            dialog3.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
            dialog3.show();
            return true;
        }
        if(item.getItemId()==R.id.item4) {
            try {
                zoom();
                Toast.makeText(getCurlActivity(), "Pinch to zoom and press the back button to navigate again.", Toast.LENGTH_SHORT).show();
            } catch (NoClassDefFoundError b) {
                Toast.makeText(getCurlActivity(), "Sorry, but your phone does not have the capability for this feature.", Toast.LENGTH_LONG).show();
            } catch (Exception b) {
                Toast.makeText(getCurlActivity(), "Sorry, but your phone does not have the capability for this feature.", Toast.LENGTH_LONG).show();
            }
            return true;
        }
        if(item.getItemId()==R.id.item5) {
            AlertDialog.Builder builderr = new AlertDialog.Builder(this);
            Date cDate = new Date();
            final String fDate = new SimpleDateFormat("MM/dd/yy").format(cDate);
            Date dt = new Date();
            int hours = dt.getHours();
            int minutes = dt.getMinutes();

            SimpleDateFormat sdf = new SimpleDateFormat("hh:mmaa");
            String time1 = sdf.format(dt);

            final EditText input = new EditText(this);
            InputFilter[] FilterArray = new InputFilter[1];
            FilterArray[0] = new InputFilter.LengthFilter(18);
            input.setFilters(FilterArray);

            input.setText(fDate + " " + time1.toLowerCase());
            builderr
                    .setTitle("Bookmark")
                    .setMessage("Name your Bookmark")
                    .setView(input)
                    .setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {

                            if (!input.getText().toString().equals(""))
                                saveState(input.getText().toString());
                            else
                                saveState(fDate);
                            setResult(RESULT_OK);
                        }
                    })
                    .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                        }

                    });

            builderr.show();
            return true;
        }
        if(item.getItemId()==R.id.item6) {
            Intent i = new Intent(getCurlActivity(), BookmarksActivity.class);
            startActivity(i);
            overridePendingTransition(R.anim.slide_up,android.R.anim.fade_out);
            return true;
        }
        if(item.getItemId()==R.id.item7) {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://search?q=pub:Qazi+Musab")));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/developer?id=Qazi+Musab")));
            }
            return true;
        }
        if(item.getItemId()==R.id.item8) {
            String appName2 = "qazi.musab.desiquran";
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appName2)));
            } catch (android.content.ActivityNotFoundException anfe) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=" + appName2)));
            }
            return true;
        }
        if(item.getItemId()==R.id.item9) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gomedina.com/advertisement")));
            return true;
        }
        if(item.getItemId()==R.id.item10) {
            if (!isZoomed)
                mCurlView.setCurrentIndex(mCurlView.getCurrentIndex() - 1);
            return true;
        }
        if(item.getItemId()==R.id.item11) {
            if (!isZoomed)
                mCurlView.setCurrentIndex(mCurlView.getCurrentIndex() + 1);
            return true;
        }
        if (item.getItemId() == R.id.item12) {
            String[] items = new String[9];
            items[0] = "$1";
            items[1] = "$2";
            items[2] = "$3";
            items[3] = "$4";
            items[4] = "$5";
            items[5] = "$10";
            items[6] = "$20";
            items[7] = "$50";
            items[8] = "$100";


            AlertDialog.Builder chooser = new AlertDialog.Builder(getCurlActivity());
            chooser
                    .setTitle("Contribute")
                    .setItems(items, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0:
                                    contributor.contributeOneDollar();
                                    break;
                                case 1:
                                    contributor.contributetwoDollars();
                                    break;
                                case 2:
                                    contributor.contributeThreeDollars();
                                    break;
                                case 3:
                                    contributor.contributeFourDollars();
                                    break;
                                case 4:
                                    contributor.contributeFiveDollars();
                                    break;
                                case 5:
                                    contributor.contributeTenDollars();
                                    break;
                                case 6:
                                    contributor.contributeTwentyDollars();
                                    break;
                                case 7:
                                    contributor.contributeFiftyDollars();
                                    break;
                                case 8:
                                    contributor.contributeHundredDollars();
                                    break;
                            }
                        }
                    });
            AlertDialog myChooser = chooser.create();
            myChooser.getWindow().getAttributes().windowAnimations = R.style.dialog_animation;
            myChooser.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    /**
	 * CurlView size changed observer.
	 */



    @Override
    protected Activity getCurlActivity() {
        return QuranReaderActivity.this;
    }
}