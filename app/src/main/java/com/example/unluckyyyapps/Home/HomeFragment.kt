package com.example.unluckyyyapps.Home

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.unluckyyyapps.R
import com.example.unluckyyyapps.pertemuan_10.TenthActivity
import com.example.unluckyyyapps.pertemuan_2.SecondActivity
import com.example.unluckyyyapps.pertemuan_3.ThirdActivity
import com.example.unluckyyyapps.pertemuan_4.FourthActivity
import com.example.unluckyyyapps.pertemuan_5.FifthActivity
import com.example.unluckyyyapps.pertemuan_7.SeventhActivity
import com.example.unluckyyyapps.pertemuan_9.NinthActivity

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // =========================
        // PERTEMUAN
        // =========================

        view.findViewById<View>(R.id.btnPertemuan2).setOnClickListener {
            startActivity(Intent(requireContext(), SecondActivity::class.java))
        }

        view.findViewById<View>(R.id.btnPertemuan3).setOnClickListener {
            startActivity(Intent(requireContext(), ThirdActivity::class.java))
        }

        view.findViewById<View>(R.id.btnPertemuan4).setOnClickListener {
            val intent = Intent(requireContext(), FourthActivity::class.java)
            intent.putExtra("name", "Politeknik Caltex Riau")
            intent.putExtra("from", "Rumbai")
            intent.putExtra("age", 25)
            startActivity(intent)
        }

        view.findViewById<View>(R.id.btnPertemuan5).setOnClickListener {
            startActivity(Intent(requireContext(), FifthActivity::class.java))
        }

        view.findViewById<View>(R.id.btnPertemuan7).setOnClickListener {
            startActivity(Intent(requireContext(), SeventhActivity::class.java))
        }

        view.findViewById<View>(R.id.btnPertemuan9).setOnClickListener {
            startActivity(Intent(requireContext(), NinthActivity::class.java))
        }

        view.findViewById<View>(R.id.btnPertemuan10).setOnClickListener {
            startActivity(Intent(requireContext(), TenthActivity::class.java))
        }
    }
}