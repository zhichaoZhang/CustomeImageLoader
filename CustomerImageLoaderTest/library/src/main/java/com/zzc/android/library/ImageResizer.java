package com.zzc.android.library;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.io.FileDescriptor;

/**
 * one util class that can resize a bitmap
 * <p/>
 * Created by zczhang on 16/1/24.
 */
public class ImageResizer {
    private static final String TAG = "ImageResizer";

    public ImageResizer() {

    }

    //decode bitmap from resource
    public Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        options.inSampleSize = calculateInSampledSize(options, reqWidth, reqHeight);

        options.inJustDecodeBounds = false;

        return BitmapFactory.decodeResource(res, resId, options);

    }

    //decode bitmap from file descriptor
    public Bitmap decodeSampledBitmapFromFileDescriptor(FileDescriptor fileDescriptor, int reqWidth, int reqHeight) {
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);

        options.inSampleSize = calculateInSampledSize(options, reqWidth, reqHeight);

        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
    }

    //calculate the scale size
    private int calculateInSampledSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        if (reqWidth == 0 || reqHeight == 0) {
            return 1;
        }

        int width = options.outWidth;
        int height = options.outHeight;

        int inSampledSize = 1;
        if(height > reqHeight || width > reqWidth) {
            final int halfWidth = width / 2;
            final int halfHeight = height / 2;

            while (reqHeight <= (halfHeight / inSampledSize) && reqWidth <= (halfWidth / inSampledSize)) {
                inSampledSize *= 2;
            }
        }
        Log.d(TAG, "sampleSize:"+inSampledSize);
        return inSampledSize;
    }
}
