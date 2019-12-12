package com.d.jetpacknavigationdemo
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainFrg : Fragment() {
    companion object{
        var NAME_KEY = "name"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btnFirst.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(NAME_KEY,"radadiya")
            it.findNavController().navigate(R.id.action_mainFrg_to_firstFrg,bundle)
//            Navigation.findNavController(it).navigate(R.id.action_mainFrg_to_firstFrg)
        }

        view.btnSecond.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(NAME_KEY,"pradip")
            it.findNavController().navigate(R.id.action_mainFrg_to_secondFrg,bundle)
//            Navigation.findNavController(it).navigate(R.id.action_mainFrg_to_secondFrg)
        }

    }


}
