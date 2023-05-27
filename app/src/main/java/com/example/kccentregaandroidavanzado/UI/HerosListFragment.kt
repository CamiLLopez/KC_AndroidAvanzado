package com.example.kccentregaandroidavanzado.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.kccentregaandroidavanzado.UI.viewModels.HerosViewModel
import com.example.kccentregaandroidavanzado.Utils.viewBinding
import com.example.kccentregaandroidavanzado.databinding.FragmentHerosListBinding

/**
 * A simple [Fragment] subclass.
 * Use the [HerosListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HerosListFragment : Fragment() {

    private val binding: FragmentHerosListBinding by viewBinding(FragmentHerosListBinding::bind)
    private val viewModel: HerosViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = SuperHeroAdapter(){heroID: String ->
            findNavController().navigate(
                HerosListFragmentDirections.actionHerosListFragmentToHeroDetailFragment(
                    heroID
                )
            )
        }
        binding.herosList.adapter = adapter
        viewModel.getHeros()

        viewModel.heros.observe(viewLifecycleOwner){ heros ->
            adapter.submitList(heros)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }

}