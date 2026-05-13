package com.example.unluckyyyapps.More

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.unluckyyyapps.databinding.FragmentMoreBinding

class MoreFragment : Fragment() {

    // VIEW BINDING
    private var _binding: FragmentMoreBinding? = null
    private val binding get() = _binding!!

    // DATA LIST
    private val dataList = listOf(

        "Laravel CRUD App",
        "CodeIgniter Project",
        "UI/UX Mobile Design",
        "Android Kotlin",
        "Student Information System",
        "Responsive Web Design",
        "Material Design",
        "Bottom Navigation",
        "RecyclerView Project",
        "Database MySQL",
        "API Integration",
        "Login Authentication"

    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // INFLATE BINDING
        _binding = FragmentMoreBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        // ARRAY ADAPTER
        val adapter = ArrayAdapter(

            requireContext(),

            android.R.layout.simple_list_item_1,

            dataList

        )

        // SET ADAPTER KE LISTVIEW
        binding.listViewItems.adapter = adapter

        // CLICK ITEM LIST
        binding.listViewItems.setOnItemClickListener { _, _, position, _ ->

            val selectedItem = dataList[position]

            Toast.makeText(

                requireContext(),

                "Kamu memilih: $selectedItem",

                Toast.LENGTH_SHORT

            ).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}