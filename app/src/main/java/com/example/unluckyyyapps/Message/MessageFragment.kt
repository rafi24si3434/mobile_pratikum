package com.example.unluckyyyapps.Message

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.unluckyyyapps.R
import com.example.unluckyyyapps.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {

    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMessageBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // =================================
        // HEADER
        // =================================

        binding.tvMessageTitle.text = "Muhammad Rafi"

        binding.tvMessageBody.text =
            "Mahasiswa Sistem Informasi Semester 4 yang memiliki minat besar dalam pengembangan aplikasi, UI/UX Design, dan web development menggunakan framework Laravel serta CodeIgniter."

        // =================================
        // ICON
        // =================================

        binding.ivMessageIcon.setImageResource(R.drawable.ic_launcher_foreground)

        // =================================
        // BUTTON
        // =================================

        binding.btnAction.text = "Hubungi Saya"

        binding.btnAction.setOnClickListener {

            Toast.makeText(
                requireContext(),
                "Terima kasih telah melihat profile saya 🚀",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}