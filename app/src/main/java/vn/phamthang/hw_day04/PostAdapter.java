package vn.phamthang.hw_day04;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {

    private ArrayList<Post> mListPost ;

    public PostAdapter(ArrayList<Post> mListPost) {
        this.mListPost = mListPost;
    }

    @Override
    public int getCount() {
        return mListPost.size();
    }

    @Override
    public Object getItem(int position) {
        return mListPost.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView == null){
             view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_layout,parent,false);
        }else{
            view = convertView;
        }
        Post post = (Post) getItem(position);
        ImageView imgAvt = view.findViewById(R.id.circleImageView);
        ImageView imgContent = view.findViewById(R.id.imgContent);
        TextView tvUserName = view.findViewById(R.id.tvUserName);
        TextView tvStatus = view.findViewById(R.id.tvStatus);

        tvUserName.setText(post.getUserName());
        tvStatus.setText(post.getStatus());
        Glide.with(parent.getContext())
                .load(post.getUrlAvt())
                .into(imgAvt);
        Glide.with(parent.getContext())
                .load(post.getUrlImgPost())
                .into(imgContent);
        return view;
    }
}
