# CustomeImageLoader
基于LruCache算法的图片加载器

二级缓存 ： 磁盘+内存
支持知道尺寸压缩显示
仅支持从网络加载数据，使用httpUrlConnection

使用：new ImageLoader.bindBitmap(String url, ImageView imageView, int reqWidth, int reqHeight);
