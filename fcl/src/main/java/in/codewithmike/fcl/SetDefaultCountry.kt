package `in`.codewithmike.fcl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SetDefaultCountry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_set_default_country)

        val hashMap = HashMap<String, String>()
        R.raw.fcl_english

    }
}