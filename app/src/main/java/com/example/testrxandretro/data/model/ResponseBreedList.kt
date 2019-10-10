package com.example.testrxandretro.data.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class ResponseBreedList(@field:SerializedName("status")
                        var status: String, @field:SerializedName("message")
                        var message: Any) : Serializable