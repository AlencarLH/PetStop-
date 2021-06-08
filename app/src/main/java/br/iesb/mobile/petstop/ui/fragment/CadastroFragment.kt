package br.iesb.mobile.petstop.ui.fragment

import android.os.Bundle

import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.iesb.mobile.petstop.R
import br.iesb.mobile.petstop.ui.classes.Usuario
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_cadastro.*

class CadastroFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_cadastro, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //BT Cadastrar
        bt_cadastro.setOnClickListener {

            cadastrar()
        }
        img_bt_cadastrar.setOnClickListener{
            cadastrar()
        }
    }

    //Funcao Valida Cadastro Profissional

    private fun cadastrar(){
        val email = et_email_cadastro.text.toString()
        val password = et_pass_cadastro.text.toString()
        val confirmaPass = et_confirm_pass_cadastro.text.toString()

        if (password != confirmaPass){
            Toast.makeText(activity, "As senhas não coincidem!", Toast.LENGTH_LONG).show()
            return
        }

        val auth = FirebaseAuth.getInstance()
        val taskDeLogin = auth.createUserWithEmailAndPassword(email, password)

        taskDeLogin.addOnCompleteListener { resultado ->
            if (resultado.isSuccessful) {
                Toast.makeText(activity, "Cadastro efetuado com sucesso!", Toast.LENGTH_LONG).show()
                findNavController().navigate(R.id.action_cadastroFragment_to_loginFragment)
            } else {
                Toast.makeText(activity, "Erro no Cadastro! Tente Novamente!", Toast.LENGTH_LONG).show()
            }
        }
    }
}