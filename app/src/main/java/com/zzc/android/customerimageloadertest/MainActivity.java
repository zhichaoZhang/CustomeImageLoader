package com.zzc.android.customerimageloadertest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import com.zzc.android.library.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    private ImageLoader mImageLoader;
    private List<String> mUrls;
    private GridViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        gridView = (GridView) findViewById(R.id.gridview);
        setSupportActionBar(toolbar);

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        init();
    }

    private void init() {
        mImageLoader = new ImageLoader(this);
        mUrls = new ArrayList<>();

        mUrls.add("http://img0.imgtn.bdimg.com/it/u=1482009946,1606111286&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=828291890,997706858&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=1600154049,3866529017&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=4067114527,3895628023&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=582178319,1614651747&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=1167198548,2111334184&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=1669233623,1624631266&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=1867276242,2555999605&fm=21&gp=0.jpg");
        mUrls.add("http://img5.imgtn.bdimg.com/it/u=741943961,2269056978&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=3506887496,3849702790&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=2128816153,2010971886&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=142387545,4034304544&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=2569470423,1418280857&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=2996073174,3443555603&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=514956850,3673547596&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=4096800381,4108346474&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=89785938,226592175&fm=21&gp=0.jpg");

        mUrls.add("http://img2.imgtn.bdimg.com/it/u=3506887496,3849702790&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=2226806234,1554002609&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=809213189,1873684304&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=3765246078,976966555&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=3202007631,2716249019&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=2669448178,111488560&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=3384960906,3871600608&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=957229642,3186698676&fm=21&gp=0.jpg");
        mUrls.add("http://img5.imgtn.bdimg.com/it/u=2039424959,3279599830&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=14190622,896236262&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=4254656430,3703449160&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=1482009946,1606111286&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=828291890,997706858&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=1600154049,3866529017&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=4067114527,3895628023&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=582178319,1614651747&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=1167198548,2111334184&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=1669233623,1624631266&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=1867276242,2555999605&fm=21&gp=0.jpg");
        mUrls.add("http://img5.imgtn.bdimg.com/it/u=741943961,2269056978&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=3506887496,3849702790&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=2128816153,2010971886&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=142387545,4034304544&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=2569470423,1418280857&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=2996073174,3443555603&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=514956850,3673547596&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=4096800381,4108346474&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=89785938,226592175&fm=21&gp=0.jpg");

        mUrls.add("http://img2.imgtn.bdimg.com/it/u=3506887496,3849702790&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=2226806234,1554002609&fm=21&gp=0.jpg");
        mUrls.add("http://img1.imgtn.bdimg.com/it/u=809213189,1873684304&fm=21&gp=0.jpg");
        mUrls.add("http://img3.imgtn.bdimg.com/it/u=3765246078,976966555&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=3202007631,2716249019&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=2669448178,111488560&fm=21&gp=0.jpg");
        mUrls.add("http://img2.imgtn.bdimg.com/it/u=3384960906,3871600608&fm=21&gp=0.jpg");
        mUrls.add("http://img4.imgtn.bdimg.com/it/u=957229642,3186698676&fm=21&gp=0.jpg");
        mUrls.add("http://img5.imgtn.bdimg.com/it/u=2039424959,3279599830&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=14190622,896236262&fm=21&gp=0.jpg");
        mUrls.add("http://img0.imgtn.bdimg.com/it/u=4254656430,3703449160&fm=21&gp=0.jpg");

        mAdapter = new GridViewAdapter(this, mUrls, mImageLoader);
        gridView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
