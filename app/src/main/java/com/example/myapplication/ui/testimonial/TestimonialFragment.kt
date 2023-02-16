package com.example.myapplication.ui.testimonial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.FragmentTestimonialBinding

class TestimonialFragment : Fragment() {

private var _binding: FragmentTestimonialBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val testimonialViewModel =
            ViewModelProvider(this).get(TestimonialViewModel::class.java)

    _binding = FragmentTestimonialBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: TextView = binding.textSlideshow
    testimonialViewModel.text.observe(viewLifecycleOwner) {
      textView.text = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}