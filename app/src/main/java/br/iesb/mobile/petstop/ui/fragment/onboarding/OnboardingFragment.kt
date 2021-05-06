package br.iesb.mobile.petstop.ui.fragment.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.iesb.mobile.petstop.databinding.FragmentOnboardingBinding
import br.iesb.mobile.petstop.ui.fragment.onboarding.screen.Onboarding1Fragment
import br.iesb.mobile.petstop.ui.fragment.onboarding.screen.Onboarding2Fragment
import br.iesb.mobile.petstop.ui.fragment.onboarding.screen.Onboarding3Fragment

class OnboardingFragment : Fragment() {

    private lateinit var binding: FragmentOnboardingBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        val listaFragmentos = listOf(
            Onboarding1Fragment(),
            Onboarding2Fragment(),
            Onboarding3Fragment()
        )

        val adaptador = AdaptadorConversacao(listaFragmentos, requireActivity().supportFragmentManager, lifecycle)

        binding.vpOnboarding.adapter = adaptador

        return binding.root
    }

}

class AdaptadorConversacao(
    val listaFragmentos: List<Fragment>,
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle){

    override fun getItemCount() = listaFragmentos.size
    override fun createFragment(position: Int) = listaFragmentos[position]
}