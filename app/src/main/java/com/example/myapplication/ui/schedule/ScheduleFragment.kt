package com.example.myapplication.ui.schedule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.FragmentScheduleBinding
import com.example.myapplication.databinding.FragmentTestimonialBinding

class ScheduleFragment : Fragment() {

private var _binding: FragmentScheduleBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
//    val testimonialViewModel =
//            ViewModelProvider(this).get(FragmentTestimonialBinding::class.java)

    _binding = FragmentScheduleBinding.inflate(inflater, container, false)
    val root: View = binding.root

//    val textView: TextView = binding.textSlideshow
//    testimonialViewModel.text.observe(viewLifecycleOwner) {
//      textView.text = it
//    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}