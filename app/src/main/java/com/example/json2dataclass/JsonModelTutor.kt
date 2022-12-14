package com.example.json2dataclass

import com.google.gson.annotations.SerializedName

val json_string ="{\n" +
        "\"id\": \"6212577f0095c22f40b1a78a\",\n" +
        "\"email\": \"fields_tyson@manglo.degree\",\n" +
        "\"roles\": [\n" +
        "\"owner\",\n" +
        "\"guest\"\n" +
        "],\n" +
        "\"apiKey\": \"f767f1e7-63e2-4f7b-984d-1f4743e7dfd1\",\n" +
        "\"profile\": {\n" +
        "\"dob\": \"17.02.1989\",\n" +
        "\"name\": \"Fields Tyson\",\n" +
        "\"about\": \"Quis labore commodo culpa aliquip cillum deserunt culpa non pariatur minim ullamco reprehenderit nulla esse. Ullamco aliquip do commodo cillum.\",\n" +
        "\"address\": \"59 Menahan Street, Loretto, Washington\",\n" +
        "\"company\": \"Manglo\",\n" +
        "\"location\": {\n" +
        "\"lat\": 56.740646,\n" +
        "\"long\": -60.715809\n" +
        "}\n" +
        "},\n" +
        "\"username\": \"fields89\",\n" +
        "\"createdAt\": \"09.12.2013T14:53:16.548Z\",\n" +
        "\"updatedAt\": \"10.12.2013T14:53:16.548Z\"\n" +
        "}"

data class JsonModel(
    @SerializedName("id")
    val id:String,

    @SerializedName("email")
    val email:String,

    @SerializedName("roles")
    val roles:List<String>?,

    @SerializedName("apiKey")
    val apiKey:String,

    @SerializedName("profile")
    val profile: ProfileModel,

    @SerializedName("username")
    val username:String?,

    @SerializedName("createdAt")
    val createdAt:String?,

    @SerializedName("updatedAt")
    val updatedAt:String?,

    )

data class LocationModel(
    @SerializedName("lat")
    val lat:Float,

    @SerializedName("long")
    val long:Float,
)