package vn.phamthang.hw_day04;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lvPost;
    private ArrayList<Post> mListPost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });

        lvPost = findViewById(R.id.listview);
        mListPost = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            Post post = new Post();
           if(i%2==0){
               post.setUserName("John Cena "+i);
               post.setStatus("John Cena tới chơi lần thứ "+i);
               post.setUrlAvt("https://gcs.tripi.vn/public-tripi/tripi-feed/img/474082Kvj/avt-de-thuong-cute_044342433.jpg");
               post.setUrlImgPost("https://platinumlist.net/guide/wp-content/uploads/2023/03/IMG-worlds-of-adventure.webp");
           }else {
               post.setUserName("John Wick "+i);
               post.setStatus("John Wick đang tìm bạn trong "+i+" ngày");
               post.setUrlAvt("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJ6v-ZtuxoQaXlu91gPE5_oOx-CincgfjT8Q&s");
               post.setUrlImgPost("https://cdn.nhathuoclongchau.com.vn/unsafe/800x0/filters:quality(95)/https://cms-prod.s3-sgn09.fptcloud.com/cach_lam_banh_pizza_thom_ngon_chuan_nha_hang_2_43d4f180fd.png");
           }
            mListPost.add(post);

        }
        PostAdapter adapter = new PostAdapter(mListPost);
        lvPost.setAdapter(adapter);
        lvPost.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, mListPost.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}