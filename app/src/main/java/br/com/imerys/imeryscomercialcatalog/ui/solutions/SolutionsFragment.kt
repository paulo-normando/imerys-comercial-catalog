package br.com.imerys.imeryscomercialcatalog.ui.solutions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import br.com.imerys.imeryscomercialcatalog.databinding.FragmentSolutionsBinding

class SolutionsFragment : Fragment() {

    private var _binding: FragmentSolutionsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val solutionsViewModel =
            ViewModelProvider(this).get(SolutionsViewModel::class.java)

        _binding = FragmentSolutionsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        solutionsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}