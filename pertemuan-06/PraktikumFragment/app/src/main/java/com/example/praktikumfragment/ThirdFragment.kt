package com.example.praktikumfragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders

/**
 * A simple [Fragment] subclass.
 */
class ThirdFragment : Fragment() {

    private var communicationViewModel: CommunicationViewModel? = null
    private var txtAddress: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).
        get(CommunicationViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_third,
            container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        txtAddress = view.findViewById(R.id.textViewAddress)
        communicationViewModel!!.address.observe(requireActivity(),
            Observer { s -> txtAddress!!.text = s })
    }
    companion object {
        fun newInstance(): ThirdFragment {
            return ThirdFragment()
        }
    }
}
