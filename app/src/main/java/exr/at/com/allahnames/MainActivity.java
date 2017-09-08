package exr.at.com.allahnames;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.re);
        mLayoutManager = new LinearLayoutManager(MainActivity.this);
       /* RecyclerView.LayoutManager la = new StaggeredGridLayoutManager(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS, StaggeredGridLayoutManager.VERTICAL);*/
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<NameModel> arrayList=new ArrayList<NameModel>();
        arrayList.add(new NameModel("الله","আল্লাহ্‌","আল্লাহ্","Allah",R.raw.allah));
        arrayList.add(new NameModel("الرحيم","আর রহিম","পরম করুনাময়","Ar-Rahim",R.raw.rahim));
        arrayList.add(new NameModel("الرحمن ","আর রহমান","পরম দাতা ও দয়ালু","Ar-Rahman",R.raw.rahman));
        arrayList.add(new NameModel("الجبار","আল জাব্বার","পরাক্রমশালী","Al-Jabbar",R.raw.jabbar));
        arrayList.add(new NameModel("العزيز","আল ʿআজিজ","প্রবল","Al-Aziz",R.raw.aziz));
        arrayList.add(new NameModel("المهيمن","আল মুহায়মিন","রক্ষণ ব্যবস্থাকারী","Al-Muhaymin",R.raw.muhaimin));
        arrayList.add(new NameModel("المؤمن","আল মুʿমিন","একমাত্র নিরাপত্তা দান কারী","Al-Mu'min",R.raw.mumin));
        arrayList.add(new NameModel("السلام","আস সালাম","শান্তি বিধায়ক","As-Salam",R.raw.salam));
        arrayList.add(new NameModel("القدوس","আল কুদ্দুস","নিষ্কলুষ","Al-Quddus",R.raw.quddus));
        arrayList.add(new NameModel("الملك","আল মালিক","সর্বাধিকারী","Al-Malik",R.raw.malik));

        arrayList.add(new NameModel("الوهاب","আল ওয়াহহাব","মহা বদান্য","Al-Wahhab",R.raw.wahhab));
        arrayList.add(new NameModel("القهار","আল কাহহার","মহাপরাক্রান্ত","Al-Qahhar",R.raw.qahhar));
        arrayList.add(new NameModel("الغفار","আল গাফফার ","মহাক্ষমাশীল","Al-Ghaffar",R.raw.ghaffar));
        arrayList.add(new NameModel("المصور","আল মুসাওবির","রুপদানকারী","Al-Musawwir",R.raw.musawwir));
        arrayList.add(new NameModel("البارئ","আল বারী","উন্মেষকারী","Al-Bari'",R.raw.bari));
        arrayList.add(new NameModel("الخالق","আল খালিক ","সৃষ্টিকারী","Al-Khaliq",R.raw.khaliq));
        arrayList.add(new NameModel("المتكبر","আল মুতাকাব্বির ","অহংকারের ন্যায্য অধিকারী","Al-Mutakabbir",R.raw.mutakabbir));
        arrayList.add(new NameModel("الرافع","আর রাফি","উন্নয়নকারী","Ar-Rafi",R.raw.rafi));
        arrayList.add(new NameModel("الخافض","আল খাফিদ ","অবনমনকারী","Al-Khafid",R.raw.khafid));
        arrayList.add(new NameModel("الباسط","আল বাসিত ","সম্প্রসারণকারী","Al-Basit",R.raw.basit));

        arrayList.add(new NameModel("القابض","আল কাবিদ","সংকোচনকারী","Al-Qabid",R.raw.qabid));
        arrayList.add(new NameModel("العليم","আল আলীম ","মহাজ্ঞানী","Al-`Alim",R.raw.alim));
        arrayList.add(new NameModel("الفتاح","আল ফাত্তাহ ","মহাবিজয়ী","Al-Fattah",R.raw.fattah));
        arrayList.add(new NameModel("الرزاق","আর রাজ্জাক","জীবিকাদাতা","Ar-Razzaq",R.raw.razzaq));
        arrayList.add(new NameModel("اللطيف","আল লাতিফ ","সুক্ষ দক্ষতাসম্পন্ন","Al-Latif",R.raw.latif));
        arrayList.add(new NameModel("العدل","আল ʿআদি","ন্যায়নিষ্ঠ","Al-`Adl",R.raw.adl));
        arrayList.add(new NameModel("الحكم","আল হাকাম","মিমাংসাকারী","Al-Hakam",R.raw.hakam));
        arrayList.add(new NameModel("البصير","আল বাসির","সর্বদ্রষ্টা","Al-Basir",R.raw.basir));
        arrayList.add(new NameModel("السميع","আস সামী","সর্বশ্রোতা","As-Sami",R.raw.sami));
        arrayList.add(new NameModel("المذل","আল মুযিল ","হতমানকারী","Al-Mudhill",R.raw.mudhill));

        arrayList.add(new NameModel("المعيد","আল মুʿইদ","সম্মানদাতা","Al-Mu'id",R.raw.muid));
        arrayList.add(new NameModel("الكبير","আল কাবীর","মহৎ","Al-Kabir",R.raw.kabir));
        arrayList.add(new NameModel("العلي","আল ʿআলী","অত্যুচ্চ","Al-Ali",R.raw.ali));
        arrayList.add(new NameModel("الشكور","আশ শাকুর ","গুণগ্রাহী","Ash-Shakur",R.raw.shakur));
        arrayList.add(new NameModel("الغفور","আল গফুর","ক্ষমাশীল","Al-Ghafur",R.raw.ghafur));
        arrayList.add(new NameModel("العظيم","আল ʿআজীম ","মহিমাময়","Al-Azim",R.raw.azim));
        arrayList.add(new NameModel("الحليم","আল হালীম","সহিষ্ণু","Al-Halim",R.raw.halim));
        arrayList.add(new NameModel("الخبير","আল খাবীর","সর্বজ্ঞ","Al-Khabir",R.raw.khabir));
        arrayList.add(new NameModel("المجيب","আল মুজিব","প্রার্থনা গ্রহণকারী","Al-Mujib",R.raw.mujib));
        arrayList.add(new NameModel("الرقيب","আর রাকীব ","নিরীক্ষণকারী","Ar-Raqib",R.raw.raqib));

        arrayList.add(new NameModel("الكريم","আল কারীম ","মহামান্য","Al-Karim",R.raw.karim));
        arrayList.add(new NameModel("الجليل","আল জালীল","প্রতাপশালী","Al-Jalil",R.raw.jalil));
        arrayList.add(new NameModel("الحسيب","আল হাসীব","মহাপরীক্ষক","Al-Hasib",R.raw.hasib));
        arrayList.add(new NameModel("المقيت","আল মুকিত","আহার্যদাতা","Al-Muqit",R.raw.muqit));
        arrayList.add(new NameModel("الحفيظ"," আল হাফীজ","মহারক্ষক","Al-Hafiz",R.raw.hafiz));
        arrayList.add(new NameModel("الحق"," আল হাক্ক","সত্য","Al-Haqq",R.raw.haqq));
        arrayList.add(new NameModel("الشهيد"," আশ শাহীদ","প্রত্যক্ষকারী","Ash-Shahid",R.raw.shahid));
        arrayList.add(new NameModel("الباعث"," আল বাইছ","পুনরুত্থানকারী","Al-Ba'ith",R.raw.baith));
        arrayList.add(new NameModel("المجيد"," আল মাজীদ","গৌরবময়","Al-Majid",R.raw.majeed));
        arrayList.add(new NameModel("الودود"," আল ওয়াদুদ ","প্রেমময়","Al-Wadud",R.raw.wadud));

        arrayList.add(new NameModel("الحكيم"," আল হাকীম","বিচক্ষণ","Al-Hakim",R.raw.hakim));
        arrayList.add(new NameModel("الواسع"," আল ওয়াসি","সর্বব্যাপী","Al-Wasi",R.raw.wasi));
        arrayList.add(new NameModel("المبدئ","আল মুবদী ","আদি স্রষ্টা","Al-Mubdi'",R.raw.mubdi));
        arrayList.add(new NameModel("المحصى"," আল মুহসী  ","হিসাব গ্রহণকারী","Al-Muhsi",R.raw.muhsi));
        arrayList.add(new NameModel("الحميد"," আল হামিদ ","প্রশংসিত","Al-Hamid",R.raw.hamid));
        arrayList.add(new NameModel("الولى"," আল ওয়ালী ","অভিভাবক ","Al-Waliyy",R.raw.wali));
        arrayList.add(new NameModel("المتين"," আল মাতীন","দৃড়তাসম্পন্ন","Al-Matin",R.raw.matin));
        arrayList.add(new NameModel("القوى"," আল কায়ুয়ী","শক্তিশালী","Al-Qawiyy",R.raw.qawi));
        arrayList.add(new NameModel("الوكيل","আল ওয়াকীল ","তত্বাবধায়ক","Al-Wakil",R.raw.wakil));
        arrayList.add(new NameModel("المجيد"," আল মাজিদ ","মহান","Al-Majid",R.raw.majid));

        arrayList.add(new NameModel("الواجد"," আল ওয়াজিদ","অবধারক","Al-Wajid",R.raw.wajid));
        arrayList.add(new NameModel("القيوم","আল কায়্যুম ","স্বয়ং স্থিতিশীল","Al-Qayyum",R.raw.qayyum));
        arrayList.add(new NameModel("الحي","আল হায়্যু","জীবিত","Al-Hayy",R.raw.hayy));
        arrayList.add(new NameModel("المميت","আল মুমীত","মরণদাতা","Al-Mumit",R.raw.mumit));
        arrayList.add(new NameModel("المحيى"," আল মুহয়ী","জীবনদাতা","Al-Muhyi",R.raw.muhyi));
        arrayList.add(new NameModel("المعيد"," আল মুʿঈদ","পুনঃ সৃষ্টিকারী","Al-Mu'id",R.raw.muid));
        arrayList.add(new NameModel("الأول","আল আওয়াল","অনাদী","Al-Awwal",R.raw.awwal));
        arrayList.add(new NameModel("المؤخر","আল মুʾয়াখখীর","পশ্চাদবর্তীকারী","Al-Mu'akhkhir",R.raw.muakhkhir));
        arrayList.add(new NameModel("المقدم"," আল মুকাদ্দিম","অগ্রবর্তীকারী","Al-Muqaddim",R.raw.muqaddim));
        arrayList.add(new NameModel("المقتدر"," আল মুকতাদীর","পরাক্রম","Al-Muqtadir",R.raw.muqtadir));

        arrayList.add(new NameModel("القادر"," আল কাদীর","শক্তিশালী","Al-Qadir",R.raw.qadir));
        arrayList.add(new NameModel("الصمد"," আস সামাদ","অভাবমুক্ত","As-Samad",R.raw.samad));
        arrayList.add(new NameModel("الواحد"," আল ওয়াহিদ","একক","Al-Wahid",R.raw.wahid));
        arrayList.add(new NameModel("التواب"," আত তাওয়াব","তওবা গ্রহণকারী","At-Tawwab",R.raw.tawwab));
        arrayList.add(new NameModel("البر"," আল বার্র ","ন্যায়বান","Al-Barr",R.raw.barr));
        arrayList.add(new NameModel("المتعالي","আল মুতাʿআলী","সুউচ্চ","Al-Muta'ali",R.raw.muta_ali));
        arrayList.add(new NameModel("الوالي","আল ওয়ালী","কার্যনির্বাহক","Al-Wali",R.raw.waliy));
        arrayList.add(new NameModel("الباطن","আল বাতিন","গুপ্ত","Al-Batin",R.raw.batin));
        arrayList.add(new NameModel("الظاهر","আল জাহির ","প্রকাশ্য","Az-Zahir",R.raw.zahir));
        arrayList.add(new NameModel("الأخر","আল আখির","অনন্ত","Al-Akhir",R.raw.akhir));

        arrayList.add(new NameModel("المقسط","আল মুকসিত","ন্যায়পরায়ণ","Al-Muqsit",R.raw.muqsit));
        arrayList.add(new NameModel(" الجلال والإكرام"," যুল জালাল ওয়ালইকরাম","মহিমান্বিত ও মাহাত্ম্যপূর্ণ","Dhu-al-Jalal wa-al-Ikram",R.raw.dhu_l_jalali_wal_ikram));
        arrayList.add(new NameModel("مالك الملك"," মালিকুল মুলক","রাজ্যের মালিক","Malik-al-Mulk",R.raw.malik_ul_mulk));
        arrayList.add(new NameModel("الرؤوف","আর রাʾউফ","কোমল হৃদয়","Ar-Ra'uf",R.raw.rauf));
        arrayList.add(new NameModel("العفو"," আল আʿওউফ","ক্ষমাকারী","Al-'Afuww",R.raw.afuw));
        arrayList.add(new NameModel("المنتقم","আল মুনতাকীম","প্রতিশোধ গ্রহণকারী","Al-Muntaqim",R.raw.muntaqim));
        arrayList.add(new NameModel("الهادي"," আল হাদী ","পথ প্রদর্শক","Al-Hadi",R.raw.hadi));
        arrayList.add(new NameModel("النافع"," আন নাফী","কল্যাণকর্তা","An-Nafi'",R.raw.nafi));
        arrayList.add(new NameModel("الضار","আদ দারর","( তাগুতের) অকল্যাণকর্তা","Ad-Darr",R.raw.darr));
        arrayList.add(new NameModel("المانع","আল মানি","প্রতিরোধকারী","Al-Mani'",R.raw.mani));

        arrayList.add(new NameModel("المغني","আল মুগনী","অভাব মোচনকারী","Al-Mughni",R.raw.mughni));
        arrayList.add(new NameModel("الغني","আল গানী","সম্পদশালী","Al-Ghani",R.raw.ghaniy));
        arrayList.add(new NameModel("الجامع","আল জামি","একত্রীকরণকারী","Al-Jami'",R.raw.jami));
        arrayList.add(new NameModel("الصبور","আস সাবুর ","ধৈর্যশীল","As-Sabur",R.raw.sabur));
        arrayList.add(new NameModel("الرشيد","আর রশীদ ","সত্যদর্শী"," Ar-Rashid",R.raw.rashid));
        arrayList.add(new NameModel("الوارث","আল ওয়ারিছ ","উত্তরাধিকারী","Al-Warith",R.raw.warith));
        arrayList.add(new NameModel("الباقي","আল বাকী","চিরস্থায়ী","Al-Baqi",R.raw.baqi));
        arrayList.add(new NameModel("البديع","আল বাদী","অভিনব সৃষ্টিকারী","Al-Badi",R.raw.badi));
        arrayList.add(new NameModel("النور","আন নূর","জ্যোতি","An-Nur",R.raw.nur));



        RecyclerAdapter adapter=new RecyclerAdapter(MainActivity.this,arrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(MainActivity.this);
        builder.setTitle(" Names Of Allah ");
        builder.setMessage(" আপনি কি অ্যাপ হতে বের হতে চান ? ");


        builder.setPositiveButton(" হ্যা ",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int id)
            {
                MainActivity.this.finish();
            }

        });
        builder.setNegativeButton(" না ",null);

        builder.show();
    }
}
