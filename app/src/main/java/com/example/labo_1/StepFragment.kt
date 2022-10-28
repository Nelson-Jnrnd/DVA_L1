package com.example.labo_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_NO_STEP = "no_step"

/**
 * A simple [Fragment] subclass.
 * Use the [StepFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class StepFragment : Fragment() {
    private var noStep: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            noStep = it.getInt(ARG_NO_STEP)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_step, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // linkage de la GUI
        val stepNoTv = view.findViewById<TextView>(R.id.f_step_no)

        // initialisation des vues
        stepNoTv.text = "$noStep"
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param noStep Number of the step in the view.
         * @return A new instance of fragment StepFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(noStep: Int) =
            StepFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_NO_STEP, noStep)
                }
            }
    }
}