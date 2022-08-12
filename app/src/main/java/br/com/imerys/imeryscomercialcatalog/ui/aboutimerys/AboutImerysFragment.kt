package br.com.imerys.imeryscomercialcatalog.ui.aboutimerys

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.imerys.imeryscomercialcatalog.databinding.FragmentAboutimerysBinding

class AboutImerysFragment : Fragment() {

    private var _binding: FragmentAboutimerysBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val aboutImerysViewModel =
            ViewModelProvider(this).get(AboutImerysViewModel::class.java)

        _binding = FragmentAboutimerysBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        aboutImerysViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}