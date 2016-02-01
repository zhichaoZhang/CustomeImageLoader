package com.zzc.android.customerimageloadertest;

import android.content.Context;
import android.media.Image;
import android.nfc.Tag;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.zzc.android.library.ImageLoader;

import java.util.List;

/**
 * Created by zczhang on 16/1/24.
 */
public class GridViewAdapter extends BaseAdapter {
    private Context mContext = null;
    private List<String> mUrls = null;
    private boolean mIsGridViewIdle = true;
    private boolean mCanGetBitmapFromNetWork = true;
    private ImageLoader mImageLoader = null;
    private static final String TAG = "Adapter";


    public GridViewAdapter(Context context, List<String> urls, ImageLoader imageLoader) {
        this.mContext = context;
        this.mUrls = urls;
        this.mImageLoader = imageLoader;
    }

    @Override
    public int getCount() {
        return mUrls == null ? 0 : mUrls.size();
    }

    @Override
    public Object getItem(int position) {
        return mUrls.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.view_gridview_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.imageView = (ImageView)convertView.findViewById(R.id.imageview);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        ImageView imageView = viewHolder.imageView;
        final String tag = (String) imageView.getTag();
        final String url = (String) getItem(position);

        if(!url.equals(tag)) {
            imageView.setImageResource(R.drawable.ic_launcher);
        }
        if(mIsGridViewIdle && mCanGetBitmapFromNetWork) {
            imageView.setTag(url);
            mImageLoader.bindBitmap(url, imageView);
        }
        return convertView;
    }

    private static class ViewHolder {
        public ImageView imageView;
    }
}
