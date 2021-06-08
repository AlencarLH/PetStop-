package br.iesb.mobile.petstop.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.petstop.R
import br.iesb.mobile.petstop.databinding.FragmentGrupoSelecionadoBinding


class GrupoSelecionadoFragment : Fragment() {

    private lateinit var binding: FragmentGrupoSelecionadoBinding

    fun irPara( v : View){
        findNavController().navigate(R.id.action_listaFragment2_to_perfilVeterinarioFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGrupoSelecionadoBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
      //  binding.navgruposelecionado = this

        return binding.root

    }
}