package scisrc.mobiledev.ecommercelayout.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import scisrc.mobiledev.ecommercelayout.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Get UI Elements
        val tvProfileName: TextView = view.findViewById(R.id.tvProfileName)
        val tvEmail: TextView = view.findViewById(R.id.tvEmail)
        val tvShippingLocation: TextView = view.findViewById(R.id.tvShippingLocation)


        return view
    }
}
