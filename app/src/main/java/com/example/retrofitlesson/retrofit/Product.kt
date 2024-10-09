package com.example.retrofitlesson.retrofit

import android.accounts.AuthenticatorDescription
import android.health.connect.datatypes.units.Percentage
import android.media.Rating

data class Product(
    val id: Int,
    val title : String,
    val description : String,
    val price: Float,
    val discountPercentage : Float,
    val rating : Float,
    val stock : Int,
    val brand: String,
    val category: String,
    val thumbnail: String,
    val images : List<String>
)
