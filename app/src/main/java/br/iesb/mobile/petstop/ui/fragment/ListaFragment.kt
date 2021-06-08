package br.iesb.mobile.petstop.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.petstop.R
import br.iesb.mobile.petstop.databinding.FragmentListaBinding


class ListaFragment : Fragment() {

    private lateinit var binding: FragmentListaBinding

    fun irParaPerfilVeterinario( v : View){
        findNavController().navigate(R.id.action_listaFragment2_to_perfilVeterinarioFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListaBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        binding.navlista = this

        return binding.root

    }

}