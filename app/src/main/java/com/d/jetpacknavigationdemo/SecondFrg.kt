package com.d.jetpacknavigationdemo

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_second_frg.view.*

class SecondFrg : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second_frg, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = arguments?.getString(MainFrg.NAME_KEY)
        Log.e("data", "------------" + data)

        view.btnCont.setOnClickListener {
            it.findNavController().navigate(R.id.action_secondFrg_to_thirdFrg)
//            Navigation.findNavController(it).navigate(R.id.action_secondFrg_to_thirdFrg)
        }
    }
}
