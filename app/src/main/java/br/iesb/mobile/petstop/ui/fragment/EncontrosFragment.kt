package br.iesb.mobile.petstop.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.petstop.R
import br.iesb.mobile.petstop.databinding.FragmentEncontrosBinding
import br.iesb.mobile.petstop.databinding.FragmentListaBinding

class EncontrosFragment : Fragment() {

    private lateinit var binding: FragmentEncontrosBinding

    fun irParaSugerirEncontro( v : View){
        findNavController().navigate(R.id.action_encontrosFragment_to_sugerirEncontroFragment)
    }

    fun irParaParticiparEncontro( v : View){
        findNavController().navigate(R.id.action_encontrosFragment_to_participarEncontroFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentEncontrosBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.navencontro = this

        return binding.root

        //return inflater.inflate(R.layout.fragment_encontros, container, false)
    }

}