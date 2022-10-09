package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.glide.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            // 기본
            Glide.with(this@MainActivity)
                .load(R.drawable.compose2)
                .into(image1)

            // 이미지 사이즈 조절
            Glide.with(this@MainActivity)
                .load(R.drawable.compose2)
                .override(50, 50)
                .into(image2)

            // 이미지 로딩 사진
            Glide.with(this@MainActivity)
                .load("http://blog.jinbo.net/attach/615/200937431.jpg")
                .placeholder(R.drawable.loading)
                .into(image3)

            // 이미지 에러 이미지
            Glide.with(this@MainActivity)
                .load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.flaticon.com%2Fkr%2Ffree-icon%2Ferror_5741333&psig=AOvVaw2NTY-Amn6OiegIeOWP2mHj&ust=1665394659369000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCPCVyuPs0voCFQAAAAAdAAAAABAD")
                .error("https://cdn-icons-png.flaticon.com/512/5741/5741333.png")
                .into(image4)

            // GIF 로딩
            Glide.with(this@MainActivity)
                .asGif()
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/300px-Rotating_earth_%28large%29.gif")
                .into(image5)

            // 이미지 동그랗게
            Glide.with(this@MainActivity)
                .asGif()
                .load("https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Rotating_earth_%28large%29.gif/300px-Rotating_earth_%28large%29.gif")
                .circleCrop()
                .into(image6)

        }
    }
}