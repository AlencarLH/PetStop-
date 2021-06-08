package br.iesb.mobile.petstop.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.petstop.R
import br.iesb.mobile.petstop.databinding.FragmentEncontrosBinding
import br.iesb.mobile.petstop.databinding.FragmentGruposBinding


class GruposFragment : Fragment() {

    private lateinit var binding: FragmentGruposBinding

    fun irParaGrupoSelecionado( v : View){
        findNavController().navigate(R.id.action_gruposFragment_to_grupoSelecionadoFragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGruposBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.navgrupo = this

        return binding.root
    }


}