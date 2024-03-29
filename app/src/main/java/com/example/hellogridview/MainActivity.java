package com.example.hellogridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


class ImageAdapter extends BaseAdapter
{
    private Context mContext;
    

    public ImageAdapter(Context c)
    {
        mContext = c;
    }

    public  int getCount()
    {
        return mThumdIds.length;
    }

    public Object getItem(int position)
    {
        return null;
    }

    public long getItemId(int position)
    {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        ImageView imageView;
        if(convertView == null)
        {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }
        else
        {
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(mThumdIds[position]);
        return imageView;

    }

    private Integer[] mThumdIds =
            {
                    R.drawable.sample_1, R.drawable.sample_2,
                    R.drawable.sample_3, R.drawable.sample_4,
                    R.drawable.sample_5, R.drawable.sample_6,
                    R.drawable.sample_7, R.drawable.sample_8,
                    R.drawable.sample_9, R.drawable.sample_10,
                    R.drawable.sample_11, R.drawable.sample_12,
                    R.drawable.sample_13, R.drawable.sample_14,
                    R.drawable.sample_15, R.drawable.sample_16,
                    R.drawable.sample_17, R.drawable.sample_18,
                    R.drawable.sample_19, R.drawable.sample_20
            };

}

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView)findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id)
            {
                Toast.makeText(MainActivity.this, "" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
